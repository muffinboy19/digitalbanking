package com.digitalbanking.app.modules.settingsecurity.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class SettingSecurityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTwofactorAuthentication: String? =
      MyApp.getInstance().resources.getString(R.string.msg_two_factor_auth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnableordisableOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enable_or_disab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentPasswordOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_current_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCurrentpasswordvalueValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCurrentpasswordvalueOneValue: String? = null
)
