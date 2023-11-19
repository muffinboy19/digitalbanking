package com.digitalbanking.app.modules.newpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.databinding.ActivityNewPasswordBinding
import com.digitalbanking.app.modules.login.ui.LoginActivity
import com.digitalbanking.app.modules.newpassword.`data`.viewmodel.NewPasswordVM
import kotlin.String
import kotlin.Unit

class NewPasswordActivity : BaseActivity<ActivityNewPasswordBinding>(R.layout.activity_new_password)
    {
  private val viewModel: NewPasswordVM by viewModels<NewPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.newPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtFrameTwentyEight.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NEW_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NewPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
