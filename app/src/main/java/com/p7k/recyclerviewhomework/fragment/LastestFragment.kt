package com.p7k.recyclerviewhomework.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.p7k.recyclerviewhomework.Adaptor.LatestAdaptor
import com.p7k.recyclerviewhomework.Model.LatestType

import com.p7k.recyclerviewhomework.R
import kotlinx.android.synthetic.main.fragment_lastest.view.*

/**
 * A simple [Fragment] subclass.
 */
class LastestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_lastest,container,false)
        var latestArray=ArrayList<LatestType>()

        latestArray.add(LatestType(R.drawable.pic1,"Hyde Park","N41015","LOUIS VUITTON","999,99999 KS","2,11000 KS"))
        latestArray.add(LatestType(R.drawable.pink,"HORNS PINK LONG","SLEEVE SHIRT","lady Gaga","72000KS",""))
        latestArray.add(LatestType(R.drawable.iphone,"I PHONE","XS MAX","Apple","1200000",""))
        var latestAdaptor=LatestAdaptor(latestArray)
        root.recyclerLatest.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        root.recyclerLatest.adapter=latestAdaptor
        return root

    }

}
