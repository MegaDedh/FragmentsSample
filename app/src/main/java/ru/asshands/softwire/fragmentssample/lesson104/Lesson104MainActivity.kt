package ru.asshands.softwire.fragmentssample.lesson104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.asshands.softwire.fragmentssample.R

/** Result:
Fragment1 onAttach
Fragment1 onCreate
Fragment1 onCreateView
Fragment2 onAttach
Fragment2 onCreate
Fragment2 onCreateView
MainActivity onCreate
Fragment1 onActivityCreated
Fragment2 onActivityCreated
Fragment1 onStart
Fragment2 onStart
MainActivity onStart
MainActivity onResume
Fragment1 onResume
Fragment2 onResume

Fragment1 onStop
Fragment2 onStop
MainActivity onStop
Fragment1 onDestroyView
Fragment1 onDestroy
Fragment1 onDetach
Fragment2 onDestroyView
Fragment2 onDestroy
Fragment2 onDetach
MainActivity onDestroy */

class Lesson104MainActivity : AppCompatActivity() {

    val LOG_TAG = "myLogs"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson104_activity_main)
        Log.d(LOG_TAG, "MainActivity onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "MainActivity onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "MainActivity onDestroy")
    }
}