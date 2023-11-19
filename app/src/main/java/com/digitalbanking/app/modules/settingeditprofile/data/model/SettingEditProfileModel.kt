package com.digitalbanking.app.modules.settingeditprofile.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class SettingEditProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourName: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserName: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofBirth: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPresentAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_present_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPermanentAddress: String? =
      MyApp.getInstance().resources.getString(R.string.msg_permanent_addre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPostalCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_postal_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup572Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup572OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup572TwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etZipcodeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup572ThreeValue: String? = null
)
