package com.digitalbanking.app.modules.transactionstabcontainer.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.databinding.ActivityTransactionsTabContainerBinding
import com.digitalbanking.app.modules.transactionstabcontainer.`data`.model.Listbalance1RowModel
import com.digitalbanking.app.modules.transactionstabcontainer.`data`.viewmodel.TransactionsTabContainerVM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TransactionsTabContainerActivity :
    BaseActivity<ActivityTransactionsTabContainerBinding>(R.layout.activity_transactions_tab_container)
    {
  private val viewModel: TransactionsTabContainerVM by viewModels<TransactionsTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbalanceAdapter =
    ListbalanceAdapter(viewModel.listbalanceList.value?:mutableListOf())
    binding.recyclerListbalance.adapter = listbalanceAdapter
    listbalanceAdapter.setOnItemClickListener(
    object : ListbalanceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbalance1RowModel) {
        onClickRecyclerListbalance(view, position, item)
      }
    }
    )
    viewModel.listbalanceList.observe(this) {
      listbalanceAdapter.updateData(it)
    }
    binding.transactionsTabContainerVM = viewModel
    val adapter = TransactionsTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup744,binding.viewPagerTabbarview) { tab, position ->
      tab.text = TransactionsTabContainerActivityPagerAdapter.title[position]
      }.attach()
      setUpSearchViewGroup420Listener()
    }

    override fun setUpClicks(): Unit {
    }

    fun onClickRecyclerListbalance(
      view: View,
      position: Int,
      item: Listbalance1RowModel
    ): Unit {
      when(view.id) {
      }
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
        const val TAG: String = "TRANSACTIONS_TAB_CONTAINER_ACTIVITY"

      }
    }
