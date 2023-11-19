package com.digitalbanking.app.modules.creditcards.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowListfileBinding
import com.digitalbanking.app.modules.creditcards.`data`.model.ListfileRowModel
import kotlin.Int
import kotlin.collections.List

class ListfileAdapter(
  var list: List<ListfileRowModel>
) : RecyclerView.Adapter<ListfileAdapter.RowListfileVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListfileVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listfile,parent,false)
    return RowListfileVH(view)
  }

  override fun onBindViewHolder(holder: RowListfileVH, position: Int) {
    val listfileRowModel = ListfileRowModel()
    // TODO uncomment following line after integration with data source
    // val listfileRowModel = list[position]
    holder.binding.listfileRowModel = listfileRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListfileRowModel>) {
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
      item: ListfileRowModel
    ) {
    }
  }

  inner class RowListfileVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListfileBinding = RowListfileBinding.bind(itemView)
  }
}
