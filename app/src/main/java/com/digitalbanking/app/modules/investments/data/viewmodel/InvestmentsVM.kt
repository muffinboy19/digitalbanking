package com.digitalbanking.app.modules.investments.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.investments.`data`.model.InvestmentsModel
import com.digitalbanking.app.modules.investments.`data`.model.ListcontrastRowModel
import com.digitalbanking.app.modules.investments.`data`.model.ListslnoRowModel
import com.digitalbanking.app.modules.investments.`data`.model.ListuserRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class InvestmentsVM : ViewModel(), KoinComponent {
  val investmentsModel: MutableLiveData<InvestmentsModel> = MutableLiveData(InvestmentsModel())

  var navArguments: Bundle? = null

  val listcontrastList: MutableLiveData<MutableList<ListcontrastRowModel>> =
      MutableLiveData(mutableListOf())

  val listuserList: MutableLiveData<MutableList<ListuserRowModel>> =
      MutableLiveData(mutableListOf())

  val listslnoList: MutableLiveData<MutableList<ListslnoRowModel>> =
      MutableLiveData(mutableListOf())
}
