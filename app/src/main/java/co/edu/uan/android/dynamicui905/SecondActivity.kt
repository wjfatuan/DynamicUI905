package co.edu.uan.android.dynamicui905

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val p1 = intent.getStringExtra("CHARACTER_NAME")
        val p2 = intent.getIntExtra("CHARACTER_AGE", 0)
        println("$p2")
        val tv = findViewById<TextView>(R.id.txtResult)
        tv.text = p1

        val b = findViewById<Button>(R.id.goBack)
        b.setOnClickListener {
            finish()
//            val i = Intent(this, MainActivity::class.java)
//            startActivity(i)
        }
    }
}