package com.digitalbanking.app.modules.services.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ServicesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtServices: String? = MyApp.getInstance().resources.getString(R.string.lbl_services)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBankServicesList: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bank_services_l)

)
