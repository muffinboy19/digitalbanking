package com.digitalbanking.app.modules.transactions.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseFragment
import com.digitalbanking.app.databinding.FragmentTransactionsBinding
import com.digitalbanking.app.modules.transactions.`data`.model.TransactionsRowModel
import com.digitalbanking.app.modules.transactions.`data`.viewmodel.TransactionsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TransactionsFragment :
    BaseFragment<FragmentTransactionsBinding>(R.layout.fragment_transactions) {
  private val viewModel: TransactionsVM by viewModels<TransactionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val transactionsAdapter =
    TransactionsAdapter(viewModel.transactionsList.value?:mutableListOf())
    binding.recyclerTransactions.adapter = transactionsAdapter
    transactionsAdapter.setOnItemClickListener(
    object : TransactionsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TransactionsRowModel) {
        onClickRecyclerTransactions(view, position, item)
      }
    }
    )
    viewModel.transactionsList.observe(requireActivity()) {
      transactionsAdapter.updateData(it)
    }
    binding.transactionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerTransactions(
    view: View,
    position: Int,
    item: TransactionsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TRANSACTIONS_FRAGMENT"

  }
}
