package com.digitalbanking.app.modules.settingsecurity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.settingsecurity.`data`.model.SettingSecurityModel
import org.koin.core.KoinComponent

class SettingSecurityVM : ViewModel(), KoinComponent {
  val settingSecurityModel: MutableLiveData<SettingSecurityModel> =
      MutableLiveData(SettingSecurityModel())

  var navArguments: Bundle? = null
}
