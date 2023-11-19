package com.digitalbanking.app.modules.transactionstabcontainer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowListbalance1Binding
import com.digitalbanking.app.modules.transactionstabcontainer.`data`.model.Listbalance1RowModel
import kotlin.Int
import kotlin.collections.List

class ListbalanceAdapter(
  var list: List<Listbalance1RowModel>
) : RecyclerView.Adapter<ListbalanceAdapter.RowListbalance1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbalance1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbalance1,parent,false)
    return RowListbalance1VH(view)
  }

  override fun onBindViewHolder(holder: RowListbalance1VH, position: Int) {
    val listbalance1RowModel = Listbalance1RowModel()
    // TODO uncomment following line after integration with data source
    // val listbalance1RowModel = list[position]
    holder.binding.listbalance1RowModel = listbalance1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbalance1RowModel>) {
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
      item: Listbalance1RowModel
    ) {
    }
  }

  inner class RowListbalance1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbalance1Binding = RowListbalance1Binding.bind(itemView)
  }
}
