package com.digitalbanking.app.modules.transactions.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowTransactionsBinding
import com.digitalbanking.app.modules.transactions.`data`.model.TransactionsRowModel
import kotlin.Int
import kotlin.collections.List

class TransactionsAdapter(
  var list: List<TransactionsRowModel>
) : RecyclerView.Adapter<TransactionsAdapter.RowTransactionsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTransactionsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_transactions,parent,false)
    return RowTransactionsVH(view)
  }

  override fun onBindViewHolder(holder: RowTransactionsVH, position: Int) {
    val transactionsRowModel = TransactionsRowModel()
    // TODO uncomment following line after integration with data source
    // val transactionsRowModel = list[position]
    holder.binding.transactionsRowModel = transactionsRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TransactionsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: TransactionsRowModel
    ) {
    }
  }

  inner class RowTransactionsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTransactionsBinding = RowTransactionsBinding.bind(itemView)
  }
}
