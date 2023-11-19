package com.digitalbanking.app.modules.settingpreference.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class SettingPreferenceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrency: String? = MyApp.getInstance().resources.getString(R.string.lbl_currency)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZone: String? = MyApp.getInstance().resources.getString(R.string.lbl_time_zone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotification: String? = MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIsendorreceive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_send_or_recei)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIreceivemerchant: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_receive_merch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTherearerecommendation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_there_are_recom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etCurrencyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTimezoneOneValue: String? = null
)
