package com.digitalbanking.app.modules.services.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.databinding.ActivityServicesBinding
import com.digitalbanking.app.modules.services.`data`.model.ListlocationRowModel
import com.digitalbanking.app.modules.services.`data`.model.ListquestionRowModel
import com.digitalbanking.app.modules.services.`data`.viewmodel.ServicesVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ServicesActivity : BaseActivity<ActivityServicesBinding>(R.layout.activity_services) {
  private val viewModel: ServicesVM by viewModels<ServicesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlocationAdapter =
    ListlocationAdapter(viewModel.listlocationList.value?:mutableListOf())
    binding.recyclerListlocation.adapter = listlocationAdapter
    listlocationAdapter.setOnItemClickListener(
    object : ListlocationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlocationRowModel) {
        onClickRecyclerListlocation(view, position, item)
      }
    }
    )
    viewModel.listlocationList.observe(this) {
      listlocationAdapter.updateData(it)
    }
    val listquestionAdapter =
    ListquestionAdapter(viewModel.listquestionList.value?:mutableListOf())
    binding.recyclerListquestion.adapter = listquestionAdapter
    listquestionAdapter.setOnItemClickListener(
    object : ListquestionAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListquestionRowModel) {
        onClickRecyclerListquestion(view, position, item)
      }
    }
    )
    viewModel.listquestionList.observe(this) {
      listquestionAdapter.updateData(it)
    }
    binding.servicesVM = viewModel
    setUpSearchViewGroup420Listener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListlocation(
    view: View,
    position: Int,
    item: ListlocationRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListquestion(
    view: View,
    position: Int,
    item: ListquestionRowModel
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
      const val TAG: String = "SERVICES_ACTIVITY"

    }
  }
