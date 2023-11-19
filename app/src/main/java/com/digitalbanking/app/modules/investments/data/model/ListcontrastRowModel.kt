package com.digitalbanking.app.modules.investments.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListcontrastRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalInvestedAmount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_total_invested)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_150_000)

)
