package com.digitalbanking.app.modules.creditcards.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowListellipsethirtythreeBinding
import com.digitalbanking.app.modules.creditcards.`data`.model.ListellipsethirtythreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsethirtythreeAdapter(
  var list: List<ListellipsethirtythreeRowModel>
) : RecyclerView.Adapter<ListellipsethirtythreeAdapter.RowListellipsethirtythreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsethirtythreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsethirtythree,parent,false)
    return RowListellipsethirtythreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsethirtythreeVH, position: Int) {
    val listellipsethirtythreeRowModel = ListellipsethirtythreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsethirtythreeRowModel = list[position]
    holder.binding.listellipsethirtythreeRowModel = listellipsethirtythreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsethirtythreeRowModel>) {
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
      item: ListellipsethirtythreeRowModel
    ) {
    }
  }

  inner class RowListellipsethirtythreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsethirtythreeBinding = RowListellipsethirtythreeBinding.bind(itemView)
  }
}
