package com.digitalbanking.app.modules.transactions.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class TransactionsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtType: String? = MyApp.getInstance().resources.getString(R.string.msg_spotify_subscri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_28_jan_12_30_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_500)

)
