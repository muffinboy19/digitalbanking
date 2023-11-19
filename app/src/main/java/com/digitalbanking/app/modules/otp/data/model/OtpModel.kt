package com.digitalbanking.app.modules.otp.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class OtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterOTP: String? = MyApp.getInstance().resources.getString(R.string.lbl_enter_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCodehasbeensendOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_code_has_been_send)

)
