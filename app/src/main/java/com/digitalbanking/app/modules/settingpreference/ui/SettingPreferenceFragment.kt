package com.digitalbanking.app.modules.settingpreference.ui

import androidx.fragment.app.viewModels
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseFragment
import com.digitalbanking.app.databinding.FragmentSettingPreferenceBinding
import com.digitalbanking.app.modules.settingpreference.`data`.viewmodel.SettingPreferenceVM
import kotlin.String
import kotlin.Unit

class SettingPreferenceFragment :
    BaseFragment<FragmentSettingPreferenceBinding>(R.layout.fragment_setting_preference) {
  private val viewModel: SettingPreferenceVM by viewModels<SettingPreferenceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.settingPreferenceVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SETTING_PREFERENCE_FRAGMENT"

  }
}
