package ru.asshands.softwire.fragmentssample.lesson105

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.lesson105_activity_main.*
import ru.asshands.softwire.fragmentssample.R

class Lesson105MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson105_activity_main)
    }

     fun onClick(view: View) {


        val fragmentMng = supportFragmentManager
        val fragmentTrans = fragmentMng.beginTransaction()
        val fragment1 = Lesson105Fragment1()
        val fragment2 = Lesson105Fragment2()
        val fragmentFrame = fragmentMng.findFragmentById(R.id.fragment_frame)
        // можно найти определённый фрагмент, если их добавлено несколько:
        // val firstFragmentInFrame = fragmentMng.fragments.getOrNull(0)

        when (view.id) {
            R.id.btnAdd -> fragmentTrans.add(R.id.fragment_frame, fragment1)
            R.id.btnReplace -> fragmentTrans.replace(R.id.fragment_frame, fragment2)
            R.id.btnRemove -> {

                if (fragmentFrame !== null) {
                    fragmentTrans.remove(fragmentFrame)
                } else {
                    Toast.makeText(this, "Fragment frame is empty", Toast.LENGTH_LONG).show()
                }
            }
        }
        if (chbStack.isChecked) {
            fragmentTrans.addToBackStack(null)
        }
        fragmentTrans.commit()
    }
}