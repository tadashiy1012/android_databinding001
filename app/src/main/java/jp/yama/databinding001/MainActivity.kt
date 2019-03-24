package jp.yama.databinding001

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import jp.yama.databinding001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var viewModel: MainViewModel? = null
    private var text: Text? = null
    private var txt1: TextView? = null
    private var btn1: Button? = null
    private var btn2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        this.txt1 = findViewById(R.id.txt1)
        this.btn1 = findViewById(R.id.btn1)
        this.btn2 = findViewById(R.id.btn2)
        this.text = Text()
        binding.text = this.text
        this.viewModel = MainViewModel {
            when (it) {
                MainViewModelState.Lbl1ValueChanged -> {
                    this.text?.val1 = this.viewModel?.val1
                }
            }
        }
        this.viewModel?.updateVal1("hogehoge")
        this.btn1?.setOnClickListener {
            this.viewModel?.updateVal1("hogehoge")
        }
        this.btn2?.setOnClickListener {
            this.viewModel?.updateVal1("fugafuga")
        }
    }
}
