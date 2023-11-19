package com.digitalbanking.app.modules.transactions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.transactions.`data`.model.TransactionsModel
import com.digitalbanking.app.modules.transactions.`data`.model.TransactionsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TransactionsVM : ViewModel(), KoinComponent {
  val transactionsModel: MutableLiveData<TransactionsModel> = MutableLiveData(TransactionsModel())

  var navArguments: Bundle? = null

  val transactionsList: MutableLiveData<MutableList<TransactionsRowModel>> =
      MutableLiveData(mutableListOf())
}
