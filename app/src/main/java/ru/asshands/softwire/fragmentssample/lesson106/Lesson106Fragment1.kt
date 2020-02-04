package ru.asshands.softwire.fragmentssample.lesson106

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.lesson106_activity_main.*
import kotlinx.android.synthetic.main.lesson106_fragment1.*
import ru.asshands.softwire.fragmentssample.R

class Lesson106Fragment1 : Fragment() {
    private val logTAG = "myLogs"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        если нужно иницилизиоровать в onCreateView
//        inflatedView.lesson106_frg1_button.setOnClickListener {
//            Log.d(logTAG, "Button click in Fragment1")
//        }

        return inflater.inflate(R.layout.lesson106_fragment1, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lesson106_frg1_button.setOnClickListener {
            Log.d(logTAG, "Button click in Fragment1")
            activity?.findViewById<Button>(R.id.lesson106_btnFind)?.text = "Access from Fragment1"

        }
    }
}

