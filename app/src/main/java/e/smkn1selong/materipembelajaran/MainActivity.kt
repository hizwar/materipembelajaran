package e.smkn1selong.materipembelajaran

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //deklarasi button
    lateinit var Matematika :Button
    lateinit var Sejarah :Button
    lateinit var Fisika :Button
    lateinit var Bahasa :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Matematika=findViewById(R.id.matematika)
        Sejarah=findViewById(R.id.sejarah)
        Fisika=findViewById(R.id.fisika)
        Bahasa=findViewById(R.id.bahasa)

        Matematika.setOnClickListener {
            startActivity(Intent(this, Mmatematika::class.java))
        }
        Sejarah.setOnClickListener {
            startActivity(Intent(this, Msejarah::class.java))
        }
        Fisika.setOnClickListener {
            startActivity(Intent(this, Mfisika::class.java))
        }
        Bahasa.setOnClickListener {
            startActivity(Intent(this, Mbahasa::class.java))
        }
    }
}
