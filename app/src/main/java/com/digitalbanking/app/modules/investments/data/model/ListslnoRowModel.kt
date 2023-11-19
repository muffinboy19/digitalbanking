package com.digitalbanking.app.modules.investments.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListslnoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSLNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_sl_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReturn: String? = MyApp.getInstance().resources.getString(R.string.lbl_return)

)
