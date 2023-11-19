package com.digitalbanking.app.modules.services.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListlocationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtType: String? = MyApp.getInstance().resources.getString(R.string.lbl_life_insurance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUnlimitedprotection: String? =
      MyApp.getInstance().resources.getString(R.string.msg_unlimited_prote)

)
