package com.digitalbanking.app.modules.transactionstabcontainer.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class TransactionsTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactions: String? = MyApp.getInstance().resources.getString(R.string.lbl_transactions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyCards: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_cards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_card2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyExpense: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_expense)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAug: String? = MyApp.getInstance().resources.getString(R.string.lbl_aug)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSep: String? = MyApp.getInstance().resources.getString(R.string.lbl_sep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOct: String? = MyApp.getInstance().resources.getString(R.string.lbl_oct)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNov: String? = MyApp.getInstance().resources.getString(R.string.lbl_nov)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_500)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDec: String? = MyApp.getInstance().resources.getString(R.string.lbl_dec)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJan: String? = MyApp.getInstance().resources.getString(R.string.lbl_jan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrevious: String? = MyApp.getInstance().resources.getString(R.string.lbl_previous)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_42)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNext: String? = MyApp.getInstance().resources.getString(R.string.lbl_next)

)
