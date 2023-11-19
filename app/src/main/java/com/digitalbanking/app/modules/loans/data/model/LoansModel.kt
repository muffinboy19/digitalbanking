package com.digitalbanking.app.modules.loans.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class LoansModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLoans: String? = MyApp.getInstance().resources.getString(R.string.lbl_loans)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActiveLoansOverview: String? =
      MyApp.getInstance().resources.getString(R.string.msg_active_loans_ov)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoanMoney: String? = MyApp.getInstance().resources.getString(R.string.lbl_loan_money)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLefttorepay: String? = MyApp.getInstance().resources.getString(R.string.lbl_left_to_repay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRepay: String? = MyApp.getInstance().resources.getString(R.string.lbl_repay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_125_0000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_750_000)

)
