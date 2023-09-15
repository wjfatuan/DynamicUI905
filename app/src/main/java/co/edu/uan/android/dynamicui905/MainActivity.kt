package co.edu.uan.android.dynamicui905

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val container = findViewById<LinearLayout>(R.id.simpsonsContainer)
//        for (i in (1..3)) {
//            addSimpson(container)
//        }

        val b = findViewById<Button>(R.id.btnGoTo)
        b.setOnClickListener { goToSecondActivity() }

        val f = supportFragmentManager.findFragmentById(R.id.myFragment) as BlankFragment
        f.doSomething()
    }

    override fun onStart() {
        super.onStart()
        Log.e("MIMENSAJE","onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MIMENSAJE","onresume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MIMENSAJE","onpause")
    }

    override fun onStop() {
        super.onStop()
        println("onstop")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

    }
    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
    }

    fun addSimpsonDynamic(container: LinearLayout) {
        val iv = ImageView(this)
        iv.setImageResource(R.drawable.homer)
        val lp = LinearLayout.LayoutParams(
            200, 200
        )
        iv.layoutParams = lp
        container.addView(iv)
    }

    fun addSimpson(container: LinearLayout) {
        val view = layoutInflater.inflate(R.layout.simpson_data, null)
        val iv = view.findViewById<ImageView>(R.id.simpson_img)
        iv.setImageResource(R.drawable.homer)
        container.addView(view)
    }

    fun goToSecondActivity() {
//        val uri = Uri.parse("tel:5551234")
//        val intent = Intent(Intent.ACTION_DIAL, uri)

//        val callIntent: Intent = Uri.parse("tel:5551234").let { number ->
//            Intent(Intent.ACTION_DIAL, number)
//        }
//        startActivity(callIntent)


        val i = Intent(this, SecondActivity::class.java)
        i.putExtra("CHARACTER_NAME", "homer")
        i.putExtra("CHARACTER_AGE", 8)
        startActivity(i)
    }
}


