package com.digitalbanking.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import androidx.core.view.GravityCompat
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.databinding.ActivityHomeBinding
import com.digitalbanking.app.modules.creditcards.ui.CreditCardsActivity
import com.digitalbanking.app.modules.home.`data`.model.ListbalanceRowModel
import com.digitalbanking.app.modules.home.`data`.model.ListvideocameraRowModel
import com.digitalbanking.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbalanceAdapter =
    ListbalanceAdapter(viewModel.listbalanceList.value?:mutableListOf())
    binding.recyclerListbalance.adapter = listbalanceAdapter
    listbalanceAdapter.setOnItemClickListener(
    object : ListbalanceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbalanceRowModel) {
        onClickRecyclerListbalance(view, position, item)
      }
    }
    )
    viewModel.listbalanceList.observe(this) {
      listbalanceAdapter.updateData(it)
    }
    val listvideocameraAdapter =
    ListvideocameraAdapter(viewModel.listvideocameraList.value?:mutableListOf())
    binding.recyclerListvideocamera.adapter = listvideocameraAdapter
    listvideocameraAdapter.setOnItemClickListener(
    object : ListvideocameraAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListvideocameraRowModel) {
        onClickRecyclerListvideocamera(view, position, item)
      }
    }
    )
    viewModel.listvideocameraList.observe(this) {
      listvideocameraAdapter.updateData(it)
    }
    binding.homeVM = viewModel
    setUpSearchViewGroup420Listener()
  }

  override fun setUpClicks(): Unit {
    binding.imageMenu.setOnClickListener {
      toggleDrawer()
    }
    binding.txtSeeAll.setOnClickListener {
      val destIntent = CreditCardsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun toggleDrawer(): Unit {
    if (!binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
      binding.drawerLayout.openDrawer(GravityCompat.START)
    }
    else {
      binding.drawerLayout.closeDrawer(GravityCompat.START)
    }
  }

  fun onClickRecyclerListbalance(
    view: View,
    position: Int,
    item: ListbalanceRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListvideocamera(
    view: View,
    position: Int,
    item: ListvideocameraRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroup420Listener(): Unit {
    binding.searchViewGroup420.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
      const val TAG: String = "HOME_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
