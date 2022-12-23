package com.softsquared.template.kotlin.src.main.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.softsquared.template.kotlin.databinding.ItemDataBinding

class RvAdapter (val context: Context, val dataList: ArrayList<Data>): RecyclerView.Adapter <RvAdapter.ViewHolder> (){
    inner class ViewHolder(val binding: ItemDataBinding): RecyclerView.ViewHolder(binding.root)
    {
        fun onBind(data: Data){
            binding.tvHeart.text = data.item_heart
            binding.tvPrice.text = data.item_price
            binding.tvLocation.text = data.item_location
            binding.tvTitle.text = data.item_title
            binding.tvTime.text = data.item_time
<<<<<<< HEAD
=======
            Glide.with(binding.ivPicture)
                .load(data.item_picture)
                .into(binding.ivPicture)
            Glide.with(binding.imgHeart)
                .load(data.item_img)
                .into(binding.imgHeart)
>>>>>>> 450307fa3c4f9b46661535ec9496c55390f198a7

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding  = ItemDataBinding.inflate(LayoutInflater.from(context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}