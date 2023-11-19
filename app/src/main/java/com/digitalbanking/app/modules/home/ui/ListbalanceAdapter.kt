package com.digitalbanking.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowListbalanceBinding
import com.digitalbanking.app.modules.home.`data`.model.ListbalanceRowModel
import kotlin.Int
import kotlin.collections.List

class ListbalanceAdapter(
  var list: List<ListbalanceRowModel>
) : RecyclerView.Adapter<ListbalanceAdapter.RowListbalanceVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbalanceVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbalance,parent,false)
    return RowListbalanceVH(view)
  }

  override fun onBindViewHolder(holder: RowListbalanceVH, position: Int) {
    val listbalanceRowModel = ListbalanceRowModel()
    // TODO uncomment following line after integration with data source
    // val listbalanceRowModel = list[position]
    holder.binding.listbalanceRowModel = listbalanceRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbalanceRowModel>) {
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
      item: ListbalanceRowModel
    ) {
    }
  }

  inner class RowListbalanceVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbalanceBinding = RowListbalanceBinding.bind(itemView)
  }
}
