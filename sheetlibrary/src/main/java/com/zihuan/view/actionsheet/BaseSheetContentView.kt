package com.zihuan.view.actionsheet

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import com.zihuan.view.actionsheet.listener.BottomSheetDismissListener
import com.zihuan.view.actionsheet.listener.BottomSheetShowListener
import com.zihuan.view.actionsheet.listener.BottomSheetListener

abstract class BaseSheetContentView : FrameLayout {

    var parentView: BaseSheetLayout<*>

    constructor(context: Context, parentView: BaseSheetLayout<*>) : super(context) {
        this.parentView = parentView
        initView(View.inflate(context, getLayoutId(), this))
    }

    abstract fun initView(view: View)
    abstract fun getLayoutId(): Int

    fun show(xoff: Int = 0, yoff: Int = 0) {
        parentView.show(xoff, yoff)
    }

    fun dismiss() {
        parentView.dismiss()
    }

}