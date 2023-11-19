package com.digitalbanking.app.modules.investments.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.databinding.ActivityInvestmentsBinding
import com.digitalbanking.app.modules.investments.`data`.model.ListcontrastRowModel
import com.digitalbanking.app.modules.investments.`data`.model.ListslnoRowModel
import com.digitalbanking.app.modules.investments.`data`.model.ListuserRowModel
import com.digitalbanking.app.modules.investments.`data`.viewmodel.InvestmentsVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InvestmentsActivity : BaseActivity<ActivityInvestmentsBinding>(R.layout.activity_investments)
    {
  private val viewModel: InvestmentsVM by viewModels<InvestmentsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listcontrastAdapter =
    ListcontrastAdapter(viewModel.listcontrastList.value?:mutableListOf())
    binding.recyclerListcontrast.adapter = listcontrastAdapter
    listcontrastAdapter.setOnItemClickListener(
    object : ListcontrastAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcontrastRowModel) {
        onClickRecyclerListcontrast(view, position, item)
      }
    }
    )
    viewModel.listcontrastList.observe(this) {
      listcontrastAdapter.updateData(it)
    }
    val listuserAdapter = ListuserAdapter(viewModel.listuserList.value?:mutableListOf())
    binding.recyclerListuser.adapter = listuserAdapter
    listuserAdapter.setOnItemClickListener(
    object : ListuserAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListuserRowModel) {
        onClickRecyclerListuser(view, position, item)
      }
    }
    )
    viewModel.listuserList.observe(this) {
      listuserAdapter.updateData(it)
    }
    val listslnoAdapter = ListslnoAdapter(viewModel.listslnoList.value?:mutableListOf())
    binding.recyclerListslno.adapter = listslnoAdapter
    listslnoAdapter.setOnItemClickListener(
    object : ListslnoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListslnoRowModel) {
        onClickRecyclerListslno(view, position, item)
      }
    }
    )
    viewModel.listslnoList.observe(this) {
      listslnoAdapter.updateData(it)
    }
    binding.investmentsVM = viewModel
    setUpSearchViewGroup420Listener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListcontrast(
    view: View,
    position: Int,
    item: ListcontrastRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListuser(
    view: View,
    position: Int,
    item: ListuserRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListslno(
    view: View,
    position: Int,
    item: ListslnoRowModel
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
      const val TAG: String = "INVESTMENTS_ACTIVITY"

    }
  }
