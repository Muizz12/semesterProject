package com.example.shope_e.utils

import android.content.Context
import android.graphics.Typeface
import androidx.appcompat.widget.AppCompatTextView
import java.util.jar.Attributes

class MSPTextViewBold(context: Context,attributes: Attributes):AppCompatTextView(context)
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