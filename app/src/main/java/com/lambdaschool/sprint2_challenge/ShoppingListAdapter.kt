package com.lambdaschool.sprint2_challenge

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.grocery_items_layout.view.*

class ShoppingListAdapter(val shoppingList: MutableList<GroceryItems>) : RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageIv: ImageView = view.iv_item_drawable
        val nameTv: TextView = view.tv_item_name
        val parentView: LinearLayout = view.llcardview
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.grocery_items_layout, parent, false)
        return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return shoppingList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTv.text = shoppingList[position].kind
        holder.imageIv.setImageResource(shoppingList[position].resourceId)

        if (shoppingList[position].ordered) {
            holder.parentView.setBackgroundColor(ContextCompat.getColor(holder.parentView.context, R.color.bought))
        }
        else {
            holder.parentView.setBackgroundColor(ContextCompat.getColor(holder.parentView.context, R.color.unbought))
        }
    }

}
