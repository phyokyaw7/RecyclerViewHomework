package com.p7k.recyclerviewhomework.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.p7k.recyclerviewhomework.Model.LatestType
import com.p7k.recyclerviewhomework.R
import kotlinx.android.synthetic.main.item_latest.view.*

class LatestAdaptor (var latestList:ArrayList<LatestType>):
    RecyclerView.Adapter<LatestAdaptor.LatestViewHolder>(){
    inner class LatestViewHolder(var myView: View):
        RecyclerView.ViewHolder(myView){

            fun bindLatest(latestType: LatestType){
                myView.latestImage.setImageResource(latestType.lateImage)
                myView.itemName.text=latestType.item
                myView.modelName.text=latestType.model
                myView.brandName.text=latestType.brand
                myView.latestPrice.text= latestType.price
                myView.discountPrice.text= latestType.discount
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_latest,parent,false)
        return LatestViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestList.size
    }

    override fun onBindViewHolder(holder: LatestViewHolder, position: Int) {
        holder.bindLatest(latestList[position])
    }
}
