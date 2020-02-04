package ru.asshands.softwire.fragmentssample.lesson106

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.lesson106_fragment2.*
import ru.asshands.softwire.fragmentssample.R

class Lesson106Fragment2 : Fragment() {
    private val logTAG = "myLogs"
    lateinit var someEventListener: OnSomeEventListener

    interface OnSomeEventListener {
        fun someEvent(s: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnSomeEventListener) {
            someEventListener = context
        } else {
            throw ClassCastException("$context must implement OnSomeEventListener.")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lesson106_fragment2, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lesson106_frg2_button.setOnClickListener {
            Log.d(logTAG, "Button click in Fragment2")
            someEventListener.someEvent("Some text Fragment2 -> Fragment1")
        }
    }

}