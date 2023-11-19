package com.digitalbanking.app.modules.settingpreferencetabcontainer.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.databinding.ActivitySettingPreferenceTabContainerBinding
import com.digitalbanking.app.modules.settingpreferencetabcontainer.`data`.viewmodel.SettingPreferenceTabContainerVM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SettingPreferenceTabContainerActivity :
    BaseActivity<ActivitySettingPreferenceTabContainerBinding>(R.layout.activity_setting_preference_tab_container)
    {
  private val viewModel: SettingPreferenceTabContainerVM by
      viewModels<SettingPreferenceTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingPreferenceTabContainerVM = viewModel
    val adapter =
    SettingPreferenceTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup744,binding.viewPagerTabbarview) { tab, position ->
      tab.text = SettingPreferenceTabContainerActivityPagerAdapter.title[position]
      }.attach()
      setUpSearchViewGroup420Listener()
    }

    override fun setUpClicks(): Unit {
    }

    private fun setUpSearchViewGroup420Listener(): Unit {
      binding.searchViewGroup420.setOnQueryTextListener(object :
      SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(p0 : String) : Boolean {
          // Performs search when user hit
          // the search button on the keyboard
          return false
        }
        override fun onQueryTextChange(p0 : String) : Boolean {
          // Start filtering the list as user
          // start entering the characters
          return false
        }
        })
      }

      companion object {
        const val TAG: String = "SETTING_PREFERENCE_TAB_CONTAINER_ACTIVITY"

      }
    }
