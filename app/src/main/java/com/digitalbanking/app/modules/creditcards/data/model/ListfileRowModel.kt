package com.digitalbanking.app.modules.creditcards.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListfileRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCardType: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardtypevalue: String? = MyApp.getInstance().resources.getString(R.string.lbl_secondary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBank: String? = MyApp.getInstance().resources.getString(R.string.lbl_bank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBankvalue: String? = MyApp.getInstance().resources.getString(R.string.lbl_dbl_bank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewdetailsvalue: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_view_details)

)
