package com.digitalbanking.app.modules.creditcards.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipsethirtythreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDBLBank: String? = MyApp.getInstance().resources.getString(R.string.lbl_dbl_bank)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBRCBank: String? = MyApp.getInstance().resources.getString(R.string.lbl_brc_bank)

)
