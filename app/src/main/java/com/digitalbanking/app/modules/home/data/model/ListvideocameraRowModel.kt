package com.digitalbanking.app.modules.home.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListvideocameraRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDepositfrommy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_deposit_from_my)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_28_january_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_850)

)
