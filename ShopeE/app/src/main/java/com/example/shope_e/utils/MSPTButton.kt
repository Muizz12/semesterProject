package com.example.shope_e.utils

import android.content.Context
import android.graphics.Typeface
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import java.util.jar.Attributes

class MSPTButton(context: Context,attributes: Attributes):AppCompatButton(context)
{
    init {
        applyfont()
    }

    private fun applyfont() {

        val typeface:Typeface=
            Typeface.createFromAsset(context.assets,"Montserrat-Bold.ttf")
        setTypeface(typeface)


    }
}