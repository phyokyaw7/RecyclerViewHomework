package com.p7k.recyclerviewhomework.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.p7k.recyclerviewhomework.Adaptor.ChooseAdaptor
import com.p7k.recyclerviewhomework.Model.ChooseType

import com.p7k.recyclerviewhomework.R
import kotlinx.android.synthetic.main.fragment_choose.view.*

/**
 * A simple [Fragment] subclass.
 */
class ChooseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?):
            View? {
        var root = inflater.inflate(R.layout.fragment_choose,container,false)
        var chooseArray=ArrayList<ChooseType>()

        chooseArray.add(ChooseType(R.drawable.japan,"Japan"))
        chooseArray.add(ChooseType(R.drawable.korea,"Korea"))
        chooseArray.add(ChooseType(R.drawable.chinese,"China"))
        chooseArray.add(ChooseType(R.drawable.international,"International"))

        var chooseAdapter=ChooseAdaptor(chooseArray)
        root.recyclerChoose.layoutManager=GridLayoutManager(context,2)
        root.recyclerChoose.adapter=chooseAdapter
        return root
    }

}
