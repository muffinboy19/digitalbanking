package com.digitalbanking.app.modules.accounts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.accounts.`data`.model.AccountsModel
import com.digitalbanking.app.modules.accounts.`data`.model.AccountsRowModel
import com.digitalbanking.app.modules.accounts.`data`.model.ListalarmRowModel
import com.digitalbanking.app.modules.accounts.`data`.model.ListrefreshRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AccountsVM : ViewModel(), KoinComponent {
  val accountsModel: MutableLiveData<AccountsModel> = MutableLiveData(AccountsModel())

  var navArguments: Bundle? = null

  val accountsList: MutableLiveData<MutableList<AccountsRowModel>> =
      MutableLiveData(mutableListOf())

  val listalarmList: MutableLiveData<MutableList<ListalarmRowModel>> =
      MutableLiveData(mutableListOf())

  val listrefreshList: MutableLiveData<MutableList<ListrefreshRowModel>> =
      MutableLiveData(mutableListOf())
}
