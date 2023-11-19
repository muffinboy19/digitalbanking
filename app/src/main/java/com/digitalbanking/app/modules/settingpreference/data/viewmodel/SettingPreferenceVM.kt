package com.digitalbanking.app.modules.settingpreference.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.settingpreference.`data`.model.SettingPreferenceModel
import org.koin.core.KoinComponent

class SettingPreferenceVM : ViewModel(), KoinComponent {
  val settingPreferenceModel: MutableLiveData<SettingPreferenceModel> =
      MutableLiveData(SettingPreferenceModel())

  var navArguments: Bundle? = null
}
