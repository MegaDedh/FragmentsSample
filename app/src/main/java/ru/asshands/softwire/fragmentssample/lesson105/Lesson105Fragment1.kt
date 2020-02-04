package ru.asshands.softwire.fragmentssample.lesson105

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.asshands.softwire.fragmentssample.R

class Lesson105Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lesson105_fragment1, null)
    }

}