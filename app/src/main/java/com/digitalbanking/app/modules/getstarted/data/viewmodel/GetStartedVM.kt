package com.digitalbanking.app.modules.getstarted.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalbanking.app.modules.getstarted.`data`.model.GetStartedModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class GetStartedVM : ViewModel(), KoinComponent {
  val getStartedModel: MutableLiveData<GetStartedModel> = MutableLiveData(GetStartedModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
