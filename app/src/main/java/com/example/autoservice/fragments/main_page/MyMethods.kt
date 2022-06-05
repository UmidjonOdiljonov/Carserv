package com.example.autoservice.fragments.main_page

import com.example.autoservice.R
import kotlin.math.abs

object MyMethods {

    fun getRandomGradient(index: Int): Int {
        val list = ArrayList<Int>()
        list.add(R.drawable.ic_gradient1)
        list.add(R.drawable.ic_gradient2)
        list.add(R.drawable.ic_gradient3)
        list.add(R.drawable.ic_gradient4)
        list.add(R.drawable.ic_gradient5)
        list.add(R.drawable.ic_gradient6)
        list.add(R.drawable.ic_gradient7)
        list.add(R.drawable.ic_gradient8)
        list.add(R.drawable.ic_gradient9)
        list.add(R.drawable.ic_gradient10)
        list.add(R.drawable.ic_gradient11)
        list.add(R.drawable.ic_gradient12)
        list.add(R.drawable.ic_gradient13)
        list.add(R.drawable.ic_gradient14)
        return list[index]
    }

    fun distance(x1: Double, y1: Double, x2: Double, y2: Double): Double {
        val k = (abs(x1 - x2) + abs(y1 - y2)) * 110.574
        var str = k.toString()
        var index = -1
        for (c in str) {
            index++
            if (c == '.') break
        }
        str = if (str.elementAt(index + 1) == '0') str.substring(0, index)
        else str.substring(0, index + 1)
        return str.toDouble()
    }
}