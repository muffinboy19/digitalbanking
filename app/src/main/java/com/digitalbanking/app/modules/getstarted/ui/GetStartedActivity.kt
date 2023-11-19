package com.digitalbanking.app.modules.getstarted.ui

import androidx.activity.viewModels
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.appcomponents.googleauth.GoogleHelper
import com.digitalbanking.app.databinding.ActivityGetStartedBinding
import com.digitalbanking.app.modules.getstarted.`data`.viewmodel.GetStartedVM
import com.digitalbanking.app.modules.login.ui.LoginActivity
import com.digitalbanking.app.modules.registers.ui.RegistersActivity
import kotlin.String
import kotlin.Unit

class GetStartedActivity : BaseActivity<ActivityGetStartedBinding>(R.layout.activity_get_started) {
  private val viewModel: GetStartedVM by viewModels<GetStartedVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.getStartedVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.btnRegister.setOnClickListener {
        val destIntent = RegistersActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnLogin.setOnClickListener {
        val destIntent = LoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "GET_STARTED_ACTIVITY"

    }
  }
