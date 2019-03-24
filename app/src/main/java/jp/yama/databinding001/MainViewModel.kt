package jp.yama.databinding001

class MainViewModel(fn: (MainViewModelState) -> Unit): ViewModel<MainViewModelState> {

    var val1: String = "empty"

    override val stateDidUpdate: (MainViewModelState) -> Unit = fn

    fun updateVal1(value: String) {
        this.val1 = value
        this.stateDidUpdate(MainViewModelState.Lbl1ValueChanged)
    }

}