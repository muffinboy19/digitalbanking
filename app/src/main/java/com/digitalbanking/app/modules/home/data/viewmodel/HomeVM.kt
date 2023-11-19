package com.digitalbanking.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.home.`data`.model.HomeModel
import com.digitalbanking.app.modules.home.`data`.model.ListbalanceRowModel
import com.digitalbanking.app.modules.home.`data`.model.ListvideocameraRowModel
import com.digitalbanking.app.modules.itemsidemenu.`data`.model.DrawerItemSideMenuModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeVM : ViewModel(), KoinComponent {
  val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  var navArguments: Bundle? = null

  public var includedModel: MutableLiveData<DrawerItemSideMenuModel> =
      MutableLiveData(DrawerItemSideMenuModel())

  val listbalanceList: MutableLiveData<MutableList<ListbalanceRowModel>> =
      MutableLiveData(mutableListOf())

  val listvideocameraList: MutableLiveData<MutableList<ListvideocameraRowModel>> =
      MutableLiveData(mutableListOf())
}
