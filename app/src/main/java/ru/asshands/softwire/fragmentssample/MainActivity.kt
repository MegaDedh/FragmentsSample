package ru.asshands.softwire.fragmentssample

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.asshands.softwire.fragmentssample.lesson104.Lesson104MainActivity
import ru.asshands.softwire.fragmentssample.lesson105.Lesson105MainActivity
import ru.asshands.softwire.fragmentssample.lesson106.Lesson106MainActivity
import ru.asshands.softwire.fragmentssample.lesson107.Lesson107MainActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_104.setOnClickListener {
            startActivity(Intent(applicationContext, Lesson104MainActivity::class.java))
        }

        btn_105.setOnClickListener {
            startActivity(Intent(applicationContext, Lesson105MainActivity::class.java))
        }

        btn_106.setOnClickListener {
            startActivity(Intent(applicationContext, Lesson106MainActivity::class.java))
        }

        btn_107.setOnClickListener {
            startActivity(Intent(applicationContext, Lesson107MainActivity::class.java))
        }
    }
}