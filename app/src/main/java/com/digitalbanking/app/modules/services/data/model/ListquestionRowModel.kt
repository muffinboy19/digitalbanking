package com.digitalbanking.app.modules.services.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class ListquestionRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtType: String? = MyApp.getInstance().resources.getString(R.string.lbl_business_loans)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_it_is_a_long_es)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewdetailsvalue: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_view_details)

)
