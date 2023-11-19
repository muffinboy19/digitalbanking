package com.digitalbanking.app.modules.settingeditprofile.ui

import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.viewModels
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseFragment
import com.digitalbanking.app.databinding.FragmentSettingEditProfileBinding
import com.digitalbanking.app.extensions.NoInternetConnection
import com.digitalbanking.app.extensions.isJSONObject
import com.digitalbanking.app.extensions.showProgressDialog
import com.digitalbanking.app.modules.settingeditprofile.`data`.model.SpinnerDateModel
import com.digitalbanking.app.modules.settingeditprofile.`data`.viewmodel.SettingEditProfileVM
import com.digitalbanking.app.network.models.fetchme.FetchMeResponse
import com.digitalbanking.app.network.resources.ErrorResponse
import com.digitalbanking.app.network.resources.SuccessResponse
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class SettingEditProfileFragment :
    BaseFragment<FragmentSettingEditProfileBinding>(R.layout.fragment_setting_edit_profile) {
  private val viewModel: SettingEditProfileVM by viewModels<SettingEditProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerDateList.value = mutableListOf(
    SpinnerDateModel("Item1"),
    SpinnerDateModel("Item2"),
    SpinnerDateModel("Item3"),
    SpinnerDateModel("Item4"),
    SpinnerDateModel("Item5")
    )
    val spinnerDateAdapter =
    SpinnerDateAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerDateList.value?:
    mutableListOf())
    binding.spinnerDate.adapter = spinnerDateAdapter
    binding.settingEditProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  override fun addObservers() {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(requireActivity()) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = requireActivity().showProgressDialog()
      } else  {
        progressDialog?.dismiss()
      }
    }
    viewModel.fetchMeLiveData.observe(requireActivity()) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessFetchMe(it)
      } else if(it is ErrorResponse)  {
        onErrorFetchMe(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessFetchMe(response: SuccessResponse<FetchMeResponse>) {
    viewModel.bindFetchMeResponse(response.data)
  }

  private fun onErrorFetchMe(exception: Exception) {
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
        Toast.makeText(requireActivity(),errMessage,Toast.LENGTH_LONG).show()
      }
    }
  }

  companion object {
    const val TAG: String = "SETTING_EDIT_PROFILE_FRAGMENT"

  }
}
