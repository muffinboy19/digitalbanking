package com.digitalbanking.app.modules.registers.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.databinding.ActivityRegistersBinding
import com.digitalbanking.app.extensions.NoInternetConnection
import com.digitalbanking.app.extensions.isJSONObject
import com.digitalbanking.app.extensions.showProgressDialog
import com.digitalbanking.app.modules.home.ui.HomeActivity
import com.digitalbanking.app.modules.registers.`data`.viewmodel.RegistersVM
import com.digitalbanking.app.network.models.createregister.CreateRegisterResponse
import com.digitalbanking.app.network.resources.ErrorResponse
import com.digitalbanking.app.network.resources.SuccessResponse
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class RegistersActivity : BaseActivity<ActivityRegistersBinding>(R.layout.activity_registers) {
  private val viewModel: RegistersVM by viewModels<RegistersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registersVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  override fun addObservers(): Unit {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@RegistersActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@RegistersActivity.showProgressDialog()
      } else {
        progressDialog?.dismiss()
      }
    }
    viewModel.createRegisterLiveData.observe(this@RegistersActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessCreateRegister(it)
      } else if(it is ErrorResponse) {
        onErrorCreateRegister(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessCreateRegister(response: SuccessResponse<CreateRegisterResponse>): Unit {
    viewModel.bindCreateRegisterResponse(response.data)
    val destBundle = Bundle()
    destBundle.putString("id",Gson().toJson(viewModel.createRegisterLiveData.value?.getSuccessResponse()?.))
    val destIntent = HomeActivity.getIntent(this, destBundle)
    startActivity(destIntent)
    finish()
  }

  private fun onErrorCreateRegister(exception: Exception): Unit {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject()) JSONObject(errorBody)
        else JSONObject()
        val errMessage = if(!errorObject.optString("message").isNullOrEmpty()) {
          errorObject.optString("message").toString()
        } else {
          exception.response()?.message()?:""
        }
        Toast.makeText(this@RegistersActivity,errMessage,Toast.LENGTH_LONG).show()
      }
    }
  }

  companion object {
    const val TAG: String = "REGISTERS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistersActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
