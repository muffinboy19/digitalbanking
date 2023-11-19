package com.digitalbanking.app.modules.loans.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowListuser1Binding
import com.digitalbanking.app.modules.loans.`data`.model.Listuser1RowModel
import kotlin.Int
import kotlin.collections.List

class ListuserAdapter(
  var list: List<Listuser1RowModel>
) : RecyclerView.Adapter<ListuserAdapter.RowListuser1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListuser1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listuser1,parent,false)
    return RowListuser1VH(view)
  }

  override fun onBindViewHolder(holder: RowListuser1VH, position: Int) {
    val listuser1RowModel = Listuser1RowModel()
    // TODO uncomment following line after integration with data source
    // val listuser1RowModel = list[position]
    holder.binding.listuser1RowModel = listuser1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listuser1RowModel>) {
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
      item: Listuser1RowModel
    ) {
    }
  }

  inner class RowListuser1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListuser1Binding = RowListuser1Binding.bind(itemView)
  }
}
