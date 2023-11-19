package com.digitalbanking.app.modules.creditcards.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListlockRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangepiccodevalue: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_pic_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWithdrawwithoutcard: String? =
      MyApp.getInstance().resources.getString(R.string.msg_withdraw_withou)

)
