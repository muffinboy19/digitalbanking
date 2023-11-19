package com.digitalbanking.app.modules.services.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.services.`data`.model.ListlocationRowModel
import com.digitalbanking.app.modules.services.`data`.model.ListquestionRowModel
import com.digitalbanking.app.modules.services.`data`.model.ServicesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ServicesVM : ViewModel(), KoinComponent {
  val servicesModel: MutableLiveData<ServicesModel> = MutableLiveData(ServicesModel())

  var navArguments: Bundle? = null

  val listlocationList: MutableLiveData<MutableList<ListlocationRowModel>> =
      MutableLiveData(mutableListOf())

  val listquestionList: MutableLiveData<MutableList<ListquestionRowModel>> =
      MutableLiveData(mutableListOf())
}
