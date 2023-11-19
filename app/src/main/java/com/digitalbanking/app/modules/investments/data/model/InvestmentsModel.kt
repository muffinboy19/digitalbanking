package com.digitalbanking.app.modules.investments.`data`.model

import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.di.MyApp
import kotlin.String

data class InvestmentsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInvestments: String? = MyApp.getInstance().resources.getString(R.string.lbl_investments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYearlyTotalInvestment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_yearly_total_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2016)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2017)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2018)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonthlyRevenue: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_monthly_revenue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_2016)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_2017)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_2018)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_2019)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyInvestment: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_investment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingStock: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_trending_stock)

)
