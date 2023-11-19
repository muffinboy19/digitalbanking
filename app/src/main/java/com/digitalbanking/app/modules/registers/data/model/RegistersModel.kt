package com.digitalbanking.app.modules.registers.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class RegistersModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateaNewAccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_a_new_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItsfastandeasy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_it_s_fast_and_easy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyTwoOneValue: String? = null
)
