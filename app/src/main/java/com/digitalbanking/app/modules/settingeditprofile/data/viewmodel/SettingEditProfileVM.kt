package com.digitalbanking.app.modules.settingeditprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.digitalbanking.app.modules.settingeditprofile.`data`.model.SettingEditProfileModel
import com.digitalbanking.app.modules.settingeditprofile.`data`.model.SpinnerDateModel
import com.digitalbanking.app.network.models.fetchme.FetchMeResponse
import com.digitalbanking.app.network.repository.NetworkRepository
import com.digitalbanking.app.network.resources.Response
import kotlin.Boolean
import kotlin.collections.MutableList
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class SettingEditProfileVM : ViewModel(), KoinComponent {
  val settingEditProfileModel: MutableLiveData<SettingEditProfileModel> =
      MutableLiveData(SettingEditProfileModel())


  var navArguments: Bundle? = null


  val spinnerDateList: MutableLiveData<MutableList<SpinnerDateModel>> = MutableLiveData()


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val fetchMeLiveData: MutableLiveData<Response<FetchMeResponse>> =
      MutableLiveData<Response<FetchMeResponse>>()

  fun callFetchMeApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      fetchMeLiveData.postValue(
      networkRepository.fetchMe()
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindFetchMeResponse(response: FetchMeResponse) {
    val settingEditProfileModelValue = settingEditProfileModel.value ?:SettingEditProfileModel()
    settingEditProfileModelValue.etLanguageValue = response.data?.username.toString()
    settingEditProfileModelValue.etEmailOneValue = response.data?.email.toString()
    settingEditProfileModelValue.etLanguageValue = response.data?.name.toString()
    settingEditProfileModel.value = settingEditProfileModelValue
  }
}
