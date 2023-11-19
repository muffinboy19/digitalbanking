package com.digitalbanking.app.modules.accounts.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.databinding.ActivityAccountsBinding
import com.digitalbanking.app.modules.accounts.`data`.model.AccountsRowModel
import com.digitalbanking.app.modules.accounts.`data`.model.ListalarmRowModel
import com.digitalbanking.app.modules.accounts.`data`.model.ListrefreshRowModel
import com.digitalbanking.app.modules.accounts.`data`.viewmodel.AccountsVM
import com.digitalbanking.app.modules.creditcards.ui.CreditCardsActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AccountsActivity : BaseActivity<ActivityAccountsBinding>(R.layout.activity_accounts) {
  private val viewModel: AccountsVM by viewModels<AccountsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val accountsAdapter = AccountsAdapter(viewModel.accountsList.value?:mutableListOf())
    binding.recyclerAccounts.adapter = accountsAdapter
    accountsAdapter.setOnItemClickListener(
    object : AccountsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AccountsRowModel) {
        onClickRecyclerAccounts(view, position, item)
      }
    }
    )
    viewModel.accountsList.observe(this) {
      accountsAdapter.updateData(it)
    }
    val listalarmAdapter = ListalarmAdapter(viewModel.listalarmList.value?:mutableListOf())
    binding.recyclerListalarm.adapter = listalarmAdapter
    listalarmAdapter.setOnItemClickListener(
    object : ListalarmAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListalarmRowModel) {
        onClickRecyclerListalarm(view, position, item)
      }
    }
    )
    viewModel.listalarmList.observe(this) {
      listalarmAdapter.updateData(it)
    }
    val listrefreshAdapter =
    ListrefreshAdapter(viewModel.listrefreshList.value?:mutableListOf())
    binding.recyclerListrefresh.adapter = listrefreshAdapter
    listrefreshAdapter.setOnItemClickListener(
    object : ListrefreshAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrefreshRowModel) {
        onClickRecyclerListrefresh(view, position, item)
      }
    }
    )
    viewModel.listrefreshList.observe(this) {
      listrefreshAdapter.updateData(it)
    }
    binding.accountsVM = viewModel
    setUpSearchViewGroup420Listener()
  }

  override fun setUpClicks(): Unit {
    binding.txtSeeAll.setOnClickListener {
      val destIntent = CreditCardsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerAccounts(
    view: View,
    position: Int,
    item: AccountsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListalarm(
    view: View,
    position: Int,
    item: ListalarmRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrefresh(
    view: View,
    position: Int,
    item: ListrefreshRowModel
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
      const val TAG: String = "ACCOUNTS_ACTIVITY"

    }
  }
