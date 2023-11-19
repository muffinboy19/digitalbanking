package com.digitalbanking.app.modules.accounts.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListrefreshRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStorename: String? = MyApp.getInstance().resources.getString(R.string.lbl_apple_store)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeago: String? = MyApp.getInstance().resources.getString(R.string.lbl_5h_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_450)

)
