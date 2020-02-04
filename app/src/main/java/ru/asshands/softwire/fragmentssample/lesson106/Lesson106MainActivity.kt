package ru.asshands.softwire.fragmentssample.lesson106

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.lesson106_activity_main.*
import kotlinx.android.synthetic.main.lesson106_fragment1.*
import ru.asshands.softwire.fragmentssample.R

class Lesson106MainActivity : AppCompatActivity(), Lesson106Fragment2.OnSomeEventListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson106_activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.lesson106_frame, Lesson106Fragment2())
            .commit()

        lesson106_btnFind.setOnClickListener {
            lesson106_frg1_textView.text = getString(R.string.frag1_access)
            // способ без kotlin.synthetic:
            val frag2 = supportFragmentManager.findFragmentById(R.id.lesson106_frame)
            val fragText = frag2?.view?.findViewById<TextView>(R.id.lesson106_frg2_textView)
            fragText!!.text = getString(R.string.frag2_access)
        }
    }

    override fun someEvent(s: String) {
        lesson106_frg1_textView.text = s
    }
}