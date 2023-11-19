package com.digitalbanking.app.modules.settingpreferencetabcontainer.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class SettingPreferenceTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSetting: String? = MyApp.getInstance().resources.getString(R.string.lbl_setting)

)
