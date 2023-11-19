package com.digitalbanking.app.modules.loans.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.loans.`data`.model.ListpriceRowModel
import com.digitalbanking.app.modules.loans.`data`.model.Listuser1RowModel
import com.digitalbanking.app.modules.loans.`data`.model.LoansModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LoansVM : ViewModel(), KoinComponent {
  val loansModel: MutableLiveData<LoansModel> = MutableLiveData(LoansModel())

  var navArguments: Bundle? = null

  val listuserList: MutableLiveData<MutableList<Listuser1RowModel>> =
      MutableLiveData(mutableListOf())

  val listpriceList: MutableLiveData<MutableList<ListpriceRowModel>> =
      MutableLiveData(mutableListOf())
}
