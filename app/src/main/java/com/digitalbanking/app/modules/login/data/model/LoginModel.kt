package com.digitalbanking.app.modules.login.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoFirstBank: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_firstbank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginyouraccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_your_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailidValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
