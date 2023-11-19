package com.digitalbanking.app.modules.creditcards.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.creditcards.`data`.model.CreditCardsModel
import com.digitalbanking.app.modules.creditcards.`data`.model.Listbalance2RowModel
import com.digitalbanking.app.modules.creditcards.`data`.model.ListellipsethirtythreeRowModel
import com.digitalbanking.app.modules.creditcards.`data`.model.ListfileRowModel
import com.digitalbanking.app.modules.creditcards.`data`.model.ListlockRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CreditCardsVM : ViewModel(), KoinComponent {
  val creditCardsModel: MutableLiveData<CreditCardsModel> = MutableLiveData(CreditCardsModel())

  var navArguments: Bundle? = null

  val listbalanceList: MutableLiveData<MutableList<Listbalance2RowModel>> =
      MutableLiveData(mutableListOf())

  val listellipsethirtythreeList: MutableLiveData<MutableList<ListellipsethirtythreeRowModel>> =
      MutableLiveData(mutableListOf())

  val listfileList: MutableLiveData<MutableList<ListfileRowModel>> =
      MutableLiveData(mutableListOf())

  val listlockList: MutableLiveData<MutableList<ListlockRowModel>> =
      MutableLiveData(mutableListOf())
}
