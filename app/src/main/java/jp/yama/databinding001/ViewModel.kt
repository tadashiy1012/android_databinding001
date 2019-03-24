package jp.yama.databinding001

interface ViewModel<T> {
    val stateDidUpdate: (T) -> Unit
}