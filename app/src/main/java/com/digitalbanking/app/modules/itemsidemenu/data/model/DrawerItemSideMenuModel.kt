package com.digitalbanking.app.modules.itemsidemenu.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemSideMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstBank: String? = MyApp.getInstance().resources.getString(R.string.lbl_firstbank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDashboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactions: String? = MyApp.getInstance().resources.getString(R.string.lbl_transactions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccounts: String? = MyApp.getInstance().resources.getString(R.string.lbl_accounts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInvestments: String? = MyApp.getInstance().resources.getString(R.string.lbl_investments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditCards: String? = MyApp.getInstance().resources.getString(R.string.lbl_credit_cards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoans: String? = MyApp.getInstance().resources.getString(R.string.lbl_loans)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServices: String? = MyApp.getInstance().resources.getString(R.string.lbl_services)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyPrivileges: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_privileges)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetting: String? = MyApp.getInstance().resources.getString(R.string.lbl_setting)

)
