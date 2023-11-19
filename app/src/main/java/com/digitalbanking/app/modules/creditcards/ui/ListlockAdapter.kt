package com.digitalbanking.app.modules.creditcards.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowListlockBinding
import com.digitalbanking.app.modules.creditcards.`data`.model.ListlockRowModel
import kotlin.Int
import kotlin.collections.List

class ListlockAdapter(
  var list: List<ListlockRowModel>
) : RecyclerView.Adapter<ListlockAdapter.RowListlockVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlockVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlock,parent,false)
    return RowListlockVH(view)
  }

  override fun onBindViewHolder(holder: RowListlockVH, position: Int) {
    val listlockRowModel = ListlockRowModel()
    // TODO uncomment following line after integration with data source
    // val listlockRowModel = list[position]
    holder.binding.listlockRowModel = listlockRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlockRowModel>) {
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
      item: ListlockRowModel
    ) {
    }
  }

  inner class RowListlockVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlockBinding = RowListlockBinding.bind(itemView)
  }
}
