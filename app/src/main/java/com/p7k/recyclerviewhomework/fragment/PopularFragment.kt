package com.p7k.recyclerviewhomework.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.p7k.recyclerviewhomework.Adaptor.PopularAdaptor
import com.p7k.recyclerviewhomework.Model.PopularType

import com.p7k.recyclerviewhomework.R
import kotlinx.android.synthetic.main.fragment_popular.view.*

/**
 * A simple [Fragment] subclass.
 */
class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root =  inflater.inflate(R.layout.fragment_popular, container, false)
        var popularArray=ArrayList<PopularType>()

        popularArray.add(PopularType(R.drawable.phoneimage,true,true,"Iphone 8plus","Apple","980000KS","1100000KS"))
        popularArray.add(PopularType(R.drawable.bed,true,true,"Ghost Bed 11 Inch","Ghost Bed","325000KS","498000KS"))
        popularArray.add(PopularType(R.drawable.nintendo,false,false,"Nintendo Switch","Nintendo","359000KS",""))
        popularArray.add(PopularType(R.drawable.lady,true,false,"BELADI","beladi","18980KS",""))


        var popularAdaptor=PopularAdaptor(popularArray)
        root.recyclerPopular.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        root.recyclerPopular.adapter=popularAdaptor
        return root
    }

}
