package com.digitalbanking.app.modules.accounts.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListalarmRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSubscriptiontype: String? =
      MyApp.getInstance().resources.getString(R.string.msg_spotify_subscri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_25_jan_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_150)

)
