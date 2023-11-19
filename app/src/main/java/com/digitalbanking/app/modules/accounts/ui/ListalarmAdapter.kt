package com.digitalbanking.app.modules.accounts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowListalarmBinding
import com.digitalbanking.app.modules.accounts.`data`.model.ListalarmRowModel
import kotlin.Int
import kotlin.collections.List

class ListalarmAdapter(
  var list: List<ListalarmRowModel>
) : RecyclerView.Adapter<ListalarmAdapter.RowListalarmVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListalarmVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listalarm,parent,false)
    return RowListalarmVH(view)
  }

  override fun onBindViewHolder(holder: RowListalarmVH, position: Int) {
    val listalarmRowModel = ListalarmRowModel()
    // TODO uncomment following line after integration with data source
    // val listalarmRowModel = list[position]
    holder.binding.listalarmRowModel = listalarmRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListalarmRowModel>) {
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
      item: ListalarmRowModel
    ) {
    }
  }

  inner class RowListalarmVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListalarmBinding = RowListalarmBinding.bind(itemView)
  }
}
