package com.digitalbanking.app.modules.accounts.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class AccountsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAccounts: String? = MyApp.getInstance().resources.getString(R.string.lbl_accounts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastTransactionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_last_transactio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalance: String? = MyApp.getInstance().resources.getString(R.string.lbl_balance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_756)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCARDHOLDER: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_holder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEddyCusuma: String? = MyApp.getInstance().resources.getString(R.string.lbl_eddy_cusuma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVALIDTHRU: String? = MyApp.getInstance().resources.getString(R.string.lbl_valid_thru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1222: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt37781234: String? = MyApp.getInstance().resources.getString(R.string.msg_3778)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDebitCreditOverview: String? =
      MyApp.getInstance().resources.getString(R.string.msg_debit_credit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDebit: String? = MyApp.getInstance().resources.getString(R.string.lbl_debit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCredit: String? = MyApp.getInstance().resources.getString(R.string.lbl_credit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSat: String? = MyApp.getInstance().resources.getString(R.string.lbl_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSun: String? = MyApp.getInstance().resources.getString(R.string.lbl_sun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMon: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTue: String? = MyApp.getInstance().resources.getString(R.string.lbl_tue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWed: String? = MyApp.getInstance().resources.getString(R.string.lbl_wed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThu: String? = MyApp.getInstance().resources.getString(R.string.lbl_thu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFri: String? = MyApp.getInstance().resources.getString(R.string.lbl_fri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInvoicesSent: String? = MyApp.getInstance().resources.getString(R.string.lbl_invoices_sent)

)
