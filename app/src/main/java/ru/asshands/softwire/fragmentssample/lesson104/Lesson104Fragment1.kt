package ru.asshands.softwire.fragmentssample.lesson104

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.asshands.softwire.fragmentssample.R

class Lesson104Fragment1 : Fragment() {

    val LOG_TAG = "myLogs"

    /**
     * onAttach - фрагмент прикреплен к Activity и получает ссылку на него.
     * В дальнейшем мы всегда можем получить ссылку на Activity,
     * вызвав метод getActivity().
     */
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(LOG_TAG, "Fragment1 onAttach")
    }

    /**
     * onCreate  - это аналог метода onCreate у Activity, но здесь мы пока не имеем доступа к UI-элементам
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LOG_TAG, "Fragment1 onCreate")
    }

    /**
     * onCreateView – здесь вы создаете View, который будет содержимым фрагмента, и отдаете его системе
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(LOG_TAG, "Fragment1 onCreateView")
     //   return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.lesson104_fragment1, null)
    }

    /**
     * onActivityCreated – сообщает фрагменту о том,
     * что Activity создано и можно работать с UI-элементами
     */
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(LOG_TAG, "Fragment1 onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "Fragment1 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "Fragment1 onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "Fragment1 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "Fragment1 onStop")
    }

    override fun onDestroyView() {
        Log.d(LOG_TAG, "Fragment1 onDestroyView")
        super.onDestroyView()

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "Fragment1 onDestroy")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d(LOG_TAG, "Fragment1 onDetach")

    }
}