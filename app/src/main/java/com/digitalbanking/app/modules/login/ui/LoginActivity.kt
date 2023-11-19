package com.digitalbanking.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.appcomponents.di.MyApp
import com.digitalbanking.app.databinding.ActivityLoginBinding
import com.digitalbanking.app.extensions.NoInternetConnection
import com.digitalbanking.app.extensions.isJSONObject
import com.digitalbanking.app.extensions.showProgressDialog
import com.digitalbanking.app.modules.home.ui.HomeActivity
import com.digitalbanking.app.modules.login.`data`.viewmodel.LoginVM
import com.digitalbanking.app.modules.otp.ui.OtpActivity
import com.digitalbanking.app.network.models.createlogin.CreateLoginResponse
import com.digitalbanking.app.network.resources.ErrorResponse
import com.digitalbanking.app.network.resources.SuccessResponse
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtForgotPassword.setOnClickListener {
      val destIntent = OtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  override fun addObservers() {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@LoginActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@LoginActivity.showProgressDialog()
      } else  {
        progressDialog?.dismiss()
      }
    }
    viewModel.createLoginLiveData.observe(this@LoginActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessCreateLogin(it)
      } else if(it is ErrorResponse)  {
        onErrorCreateLogin(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessCreateLogin(response: SuccessResponse<CreateLoginResponse>) {
    viewModel.bindCreateLoginResponse(response.data)
    val destBundle = Bundle()
    destBundle.putString("id",Gson().toJson(viewModel.createLoginLiveData.value?.getSuccessResponse()?.))
    val destIntent = HomeActivity.getIntent(this, destBundle)
    startActivity(destIntent)
    finish()
  }

  private fun onErrorCreateLogin(exception: Exception) {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject()) JSONObject(errorBody)
            else JSONObject()
        Toast.makeText(this@LoginActivity,MyApp.getInstance().getString(R.string.msg_invalid_username_or_pa),Toast.LENGTH_LONG).show()
      }
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
