package com.p7k.recyclerviewhomework.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.p7k.recyclerviewhomework.Model.PopularType
import com.p7k.recyclerviewhomework.R
import kotlinx.android.synthetic.main.item_popular.view.*

class PopularAdaptor (var popularList: ArrayList<PopularType>):
        RecyclerView.Adapter<PopularAdaptor.PopularViewHolder>(){

    inner class PopularViewHolder(var myView: View):
    RecyclerView.ViewHolder(myView){

        fun bindPopular(popularType: PopularType){
            myView.popImage.setImageResource(popularType.popPic)

            val viewA=itemView.Con_NEw
            viewA.visibility=if (popularType.newbtn!=null&&popularType.newbtn){
                View.VISIBLE
            }else{
                View.INVISIBLE
            }
            val viewB=itemView.Con_disc
            viewB.visibility=if (popularType.discbtn!=null&&popularType.discbtn){
                View.VISIBLE
            }else{
                View.INVISIBLE
            }

            myView.popName.text=popularType.namePop
            myView.popBrand.text=popularType.brandPop
            myView.popPrice.text=popularType.pricePop
            myView.popDiscount.text=popularType.discPop



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_popular,parent,false)
        return PopularViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularList.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.bindPopular(popularList.get(position))
    }
}