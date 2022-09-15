package com.appylar.android.sample


import com.fiveexceptions.testaar.Logic
import java.util.*


class MyLibary {

    fun add(number1 : Int ,number2 : Int ):Int{
        var sum = Logic().addNumber(number1,number2)
        return sum
    }

}