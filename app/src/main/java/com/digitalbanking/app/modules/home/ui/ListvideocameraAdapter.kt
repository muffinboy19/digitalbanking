package com.digitalbanking.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalbanking.app.R
import com.digitalbanking.app.databinding.RowListvideocameraBinding
import com.digitalbanking.app.modules.home.`data`.model.ListvideocameraRowModel
import kotlin.Int
import kotlin.collections.List

class ListvideocameraAdapter(
  var list: List<ListvideocameraRowModel>
) : RecyclerView.Adapter<ListvideocameraAdapter.RowListvideocameraVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListvideocameraVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listvideocamera,parent,false)
    return RowListvideocameraVH(view)
  }

  override fun onBindViewHolder(holder: RowListvideocameraVH, position: Int) {
    val listvideocameraRowModel = ListvideocameraRowModel()
    // TODO uncomment following line after integration with data source
    // val listvideocameraRowModel = list[position]
    holder.binding.listvideocameraRowModel = listvideocameraRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListvideocameraRowModel>) {
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
      item: ListvideocameraRowModel
    ) {
    }
  }

  inner class RowListvideocameraVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListvideocameraBinding = RowListvideocameraBinding.bind(itemView)
  }
}
