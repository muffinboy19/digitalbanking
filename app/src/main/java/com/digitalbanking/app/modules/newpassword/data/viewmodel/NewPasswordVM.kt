package com.digitalbanking.app.modules.newpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.newpassword.`data`.model.NewPasswordModel
import org.koin.core.KoinComponent

class NewPasswordVM : ViewModel(), KoinComponent {
  val newPasswordModel: MutableLiveData<NewPasswordModel> = MutableLiveData(NewPasswordModel())

  var navArguments: Bundle? = null
}
