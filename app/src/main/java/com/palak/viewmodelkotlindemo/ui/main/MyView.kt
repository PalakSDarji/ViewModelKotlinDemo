package com.palak.viewmodelkotlindemo.ui.main

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.annotation.StyleableRes

class MyView : View{

    constructor(context: Context?) : this(context,null)
    constructor(context: Context?,attributeSet: AttributeSet?) : this(context,attributeSet,0)
    constructor(context: Context?,attributeSet: AttributeSet?, defStyleAttr: Int)
            : super(context,attributeSet, defStyleAttr){

        val kotlinView = MyKotlinView(context)
    }
}