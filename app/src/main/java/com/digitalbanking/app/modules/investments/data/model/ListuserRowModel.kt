package com.digitalbanking.app.modules.investments.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListuserRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtType: String? = MyApp.getInstance().resources.getString(R.string.lbl_apple_store)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlatform: String? = MyApp.getInstance().resources.getString(R.string.msg_e_commerce_mar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGrowth: String? = MyApp.getInstance().resources.getString(R.string.lbl_16)

)
