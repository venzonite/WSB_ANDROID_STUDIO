package net.wejer.bmi

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.containedButton)
        button.setOnClickListener {

            val myFragment = MybmiCalcFragment();

            val manager = supportFragmentManager

            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragmentcontainer, myFragment)

            transaction.commit()


        }

        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.page_1 -> {

                    //To sprawiło mi trudność. Na StackOverflow znalazłem, że w argumencie nr.1 metody Toast.makeText mogę dać this@MainActivity, jeżeli umieszczam ten kod w MainActivity.
                    //Niestety toast nie pojawia się po kliknięciu przycisku na dole.

                    Toast.makeText(this@MainActivity, "Przycisk !", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.page_2 -> {

                    //To sprawiło mi trudność. Na StackOverflow znalazłem, że w argumencie nr.1 metody Toast.makeText mogę dać this@MainActivity, jeżeli umieszczam ten kod w MainActivity.
                    //Niestety toast nie pojawia się po kliknięciu przycisku na dole.

                    Toast.makeText(this@MainActivity, "Przycisk !", Toast.LENGTH_LONG).show()

                    true
                }
                else -> false
            }
        }

    }


}

