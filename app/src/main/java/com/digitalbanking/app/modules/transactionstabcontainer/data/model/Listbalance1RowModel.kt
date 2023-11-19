package com.digitalbanking.app.modules.transactionstabcontainer.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class Listbalance1RowModel(
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
  var txtCardholdervalue: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_eddy_cusuma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVALIDTHRU: String? = MyApp.getInstance().resources.getString(R.string.lbl_valid_thru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValidthruvalue: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.msg_3778)

)
