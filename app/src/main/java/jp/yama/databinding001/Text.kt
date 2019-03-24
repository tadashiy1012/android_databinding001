package jp.yama.databinding001

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.util.Log

class Text: BaseObservable() {
    @Bindable var val1: String? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.val1)
        }
}