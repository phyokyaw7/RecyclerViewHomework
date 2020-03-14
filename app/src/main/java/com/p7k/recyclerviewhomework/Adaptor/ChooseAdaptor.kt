package com.p7k.recyclerviewhomework.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.p7k.recyclerviewhomework.Model.ChooseType
import com.p7k.recyclerviewhomework.R
import kotlinx.android.synthetic.main.item_choose.view.*

class ChooseAdaptor (var chooseList:ArrayList<ChooseType>):
        RecyclerView.Adapter<ChooseAdaptor.ChooseViewHolder>(){

    inner class ChooseViewHolder(var myView:View):
            RecyclerView.ViewHolder(myView){

        fun bindChoose(chooseType: ChooseType){
            myView.ChooseImage.setImageResource(chooseType.choosePic)
            myView.ChooseTxt.text=chooseType.chooseText
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChooseViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_choose,parent,false)
        return ChooseViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chooseList.size
    }

    override fun onBindViewHolder(holder: ChooseViewHolder, position: Int) {
        holder.bindChoose(chooseList.get(position))
    }
}