package com.digitalbanking.app.modules.creditcards.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class CreditCardsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditCards: String? = MyApp.getInstance().resources.getString(R.string.lbl_credit_cards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyCards: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_cards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardExpenseStatistics: String? =
      MyApp.getInstance().resources.getString(R.string.msg_card_expense_st)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardList: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddNewCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_new_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_card_gen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardType: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameOnCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_name_on_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpirationDate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_expiration_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardSetting: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlockCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_block_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInstantlyblock: String? =
      MyApp.getInstance().resources.getString(R.string.msg_instantly_block)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup572Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup572OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup572TwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDateValue: String? = null
)
