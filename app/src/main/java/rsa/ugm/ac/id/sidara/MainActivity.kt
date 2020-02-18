package rsa.ugm.ac.id.sidara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            // code here
            //Log.i( "MainActivity", "Button was clicked")

            Toast.makeText( this@MainActivity, "Wis diklik, bener", Toast.LENGTH_LONG).show()
        }
    }
}
