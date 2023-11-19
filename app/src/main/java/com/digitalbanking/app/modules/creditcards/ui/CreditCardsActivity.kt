package com.digitalbanking.app.modules.creditcards.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.digitalbanking.app.R
import com.digitalbanking.app.appcomponents.base.BaseActivity
import com.digitalbanking.app.databinding.ActivityCreditCardsBinding
import com.digitalbanking.app.modules.creditcards.`data`.model.Listbalance2RowModel
import com.digitalbanking.app.modules.creditcards.`data`.model.ListellipsethirtythreeRowModel
import com.digitalbanking.app.modules.creditcards.`data`.model.ListfileRowModel
import com.digitalbanking.app.modules.creditcards.`data`.model.ListlockRowModel
import com.digitalbanking.app.modules.creditcards.`data`.viewmodel.CreditCardsVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CreditCardsActivity : BaseActivity<ActivityCreditCardsBinding>(R.layout.activity_credit_cards)
    {
  private val viewModel: CreditCardsVM by viewModels<CreditCardsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbalanceAdapter =
    ListbalanceAdapter(viewModel.listbalanceList.value?:mutableListOf())
    binding.recyclerListbalance.adapter = listbalanceAdapter
    listbalanceAdapter.setOnItemClickListener(
    object : ListbalanceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listbalance2RowModel) {
        onClickRecyclerListbalance(view, position, item)
      }
    }
    )
    viewModel.listbalanceList.observe(this) {
      listbalanceAdapter.updateData(it)
    }
    val listellipsethirtythreeAdapter =
    ListellipsethirtythreeAdapter(viewModel.listellipsethirtythreeList.value?:mutableListOf())
    binding.recyclerListellipsethirtythree.adapter = listellipsethirtythreeAdapter
    listellipsethirtythreeAdapter.setOnItemClickListener(
    object : ListellipsethirtythreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListellipsethirtythreeRowModel) {
        onClickRecyclerListellipsethirtythree(view, position, item)
      }
    }
    )
    viewModel.listellipsethirtythreeList.observe(this) {
      listellipsethirtythreeAdapter.updateData(it)
    }
    val listfileAdapter = ListfileAdapter(viewModel.listfileList.value?:mutableListOf())
    binding.recyclerListfile.adapter = listfileAdapter
    listfileAdapter.setOnItemClickListener(
    object : ListfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfileRowModel) {
        onClickRecyclerListfile(view, position, item)
      }
    }
    )
    viewModel.listfileList.observe(this) {
      listfileAdapter.updateData(it)
    }
    val listlockAdapter = ListlockAdapter(viewModel.listlockList.value?:mutableListOf())
    binding.recyclerListlock.adapter = listlockAdapter
    listlockAdapter.setOnItemClickListener(
    object : ListlockAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlockRowModel) {
        onClickRecyclerListlock(view, position, item)
      }
    }
    )
    viewModel.listlockList.observe(this) {
      listlockAdapter.updateData(it)
    }
    binding.creditCardsVM = viewModel
    setUpSearchViewGroup420Listener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListbalance(
    view: View,
    position: Int,
    item: Listbalance2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipsethirtythree(
    view: View,
    position: Int,
    item: ListellipsethirtythreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListfile(
    view: View,
    position: Int,
    item: ListfileRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListlock(
    view: View,
    position: Int,
    item: ListlockRowModel
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
      const val TAG: String = "CREDIT_CARDS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, CreditCardsActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
