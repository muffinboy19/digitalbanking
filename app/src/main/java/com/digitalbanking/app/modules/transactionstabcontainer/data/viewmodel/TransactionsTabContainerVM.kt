package com.digitalbanking.app.modules.transactionstabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.transactionstabcontainer.`data`.model.Listbalance1RowModel
import com.digitalbanking.app.modules.transactionstabcontainer.`data`.model.TransactionsTabContainerModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TransactionsTabContainerVM : ViewModel(), KoinComponent {
  val transactionsTabContainerModel: MutableLiveData<TransactionsTabContainerModel> =
      MutableLiveData(TransactionsTabContainerModel())

  var navArguments: Bundle? = null

  val listbalanceList: MutableLiveData<MutableList<Listbalance1RowModel>> =
      MutableLiveData(mutableListOf())
}
