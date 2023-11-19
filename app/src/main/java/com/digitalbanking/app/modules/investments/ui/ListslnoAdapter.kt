package com.digitalbanking.app.modules.investments.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowListslnoBinding
import com.digitalbanking.app.modules.investments.`data`.model.ListslnoRowModel
import kotlin.Int
import kotlin.collections.List

class ListslnoAdapter(
  var list: List<ListslnoRowModel>
) : RecyclerView.Adapter<ListslnoAdapter.RowListslnoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListslnoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listslno,parent,false)
    return RowListslnoVH(view)
  }

  override fun onBindViewHolder(holder: RowListslnoVH, position: Int) {
    val listslnoRowModel = ListslnoRowModel()
    // TODO uncomment following line after integration with data source
    // val listslnoRowModel = list[position]
    holder.binding.listslnoRowModel = listslnoRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListslnoRowModel>) {
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
      item: ListslnoRowModel
    ) {
    }
  }

  inner class RowListslnoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListslnoBinding = RowListslnoBinding.bind(itemView)
  }
}
