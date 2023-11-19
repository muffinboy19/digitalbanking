package com.digitalbanking.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.digitalbanking.app.appcomponents.utility.PreferenceHelper
import com.digitalbanking.app.modules.login.`data`.model.LoginModel
import com.digitalbanking.app.network.models.createlogin.CreateLoginRequest
import com.digitalbanking.app.network.models.createlogin.CreateLoginResponse
import com.digitalbanking.app.network.repository.NetworkRepository
import com.digitalbanking.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class LoginVM : ViewModel(), KoinComponent {
  val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createLoginLiveData: MutableLiveData<Response<CreateLoginResponse>> =
      MutableLiveData<Response<CreateLoginResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateLoginApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createLoginLiveData.postValue(
      networkRepository.createLogin(
      createLoginRequest = CreateLoginRequest(
          password = loginModel.value?.etPasswordValue,
          username = loginModel.value?.etEmailidValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateLoginResponse(response: CreateLoginResponse) {
    val loginModelValue = loginModel.value ?:LoginModel()
    prefs.setToken(response.data?.token)
    loginModel.value = loginModelValue
  }
}
