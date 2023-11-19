package com.digitalbanking.app.modules.getstarted.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class GetStartedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsGetStartedOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lets_get_started)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFindtherightandOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_the_right_and)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrUseInstantSign: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_use_instant_sign)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignWithGoogle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_with_google)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignWithApple: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sign_with_apple)

)
