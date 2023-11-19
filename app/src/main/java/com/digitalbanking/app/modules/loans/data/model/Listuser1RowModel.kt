package com.digitalbanking.app.modules.loans.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class Listuser1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLoantype: String? = MyApp.getInstance().resources.getString(R.string.lbl_personal_loans)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_50_000)

)
