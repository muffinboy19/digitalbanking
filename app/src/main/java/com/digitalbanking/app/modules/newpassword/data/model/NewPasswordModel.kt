package com.digitalbanking.app.modules.newpassword.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class NewPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateNewPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateyournew: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTwentyEight: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNewpasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etConfirmpasswordValue: String? = null
)
