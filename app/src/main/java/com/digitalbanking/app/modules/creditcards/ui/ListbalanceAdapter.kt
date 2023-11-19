package com.digitalbanking.app.modules.creditcards.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowListbalance2Binding
import com.digitalbanking.app.modules.creditcards.`data`.model.Listbalance2RowModel
import kotlin.Int
import kotlin.collections.List

class ListbalanceAdapter(
  var list: List<Listbalance2RowModel>
) : RecyclerView.Adapter<ListbalanceAdapter.RowListbalance2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbalance2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbalance2,parent,false)
    return RowListbalance2VH(view)
  }

  override fun onBindViewHolder(holder: RowListbalance2VH, position: Int) {
    val listbalance2RowModel = Listbalance2RowModel()
    // TODO uncomment following line after integration with data source
    // val listbalance2RowModel = list[position]
    holder.binding.listbalance2RowModel = listbalance2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listbalance2RowModel>) {
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
      item: Listbalance2RowModel
    ) {
    }
  }

  inner class RowListbalance2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbalance2Binding = RowListbalance2Binding.bind(itemView)
  }
}
