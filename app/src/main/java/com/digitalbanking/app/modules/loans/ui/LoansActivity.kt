package com.digitalbanking.app.modules.loans.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.databinding.ActivityLoansBinding
import com.digitalbanking.app.modules.loans.`data`.model.ListpriceRowModel
import com.digitalbanking.app.modules.loans.`data`.model.Listuser1RowModel
import com.digitalbanking.app.modules.loans.`data`.viewmodel.LoansVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoansActivity : BaseActivity<ActivityLoansBinding>(R.layout.activity_loans) {
  private val viewModel: LoansVM by viewModels<LoansVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listuserAdapter = ListuserAdapter(viewModel.listuserList.value?:mutableListOf())
    binding.recyclerListuser.adapter = listuserAdapter
    listuserAdapter.setOnItemClickListener(
    object : ListuserAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listuser1RowModel) {
        onClickRecyclerListuser(view, position, item)
      }
    }
    )
    viewModel.listuserList.observe(this) {
      listuserAdapter.updateData(it)
    }
    val listpriceAdapter = ListpriceAdapter(viewModel.listpriceList.value?:mutableListOf())
    binding.recyclerListprice.adapter = listpriceAdapter
    listpriceAdapter.setOnItemClickListener(
    object : ListpriceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpriceRowModel) {
        onClickRecyclerListprice(view, position, item)
      }
    }
    )
    viewModel.listpriceList.observe(this) {
      listpriceAdapter.updateData(it)
    }
    binding.loansVM = viewModel
    setUpSearchViewGroup420Listener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListuser(
    view: View,
    position: Int,
    item: Listuser1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListprice(
    view: View,
    position: Int,
    item: ListpriceRowModel
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
      const val TAG: String = "LOANS_ACTIVITY"

    }
  }
