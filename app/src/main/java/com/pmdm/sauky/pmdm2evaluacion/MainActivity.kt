package com.pmdm.sauky.pmdm2evaluacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find
import org.jetbrains.anko.horizontalScrollView
import org.jetbrains.anko.toast
import android.content.Intent

class MainActivity : AppCompatActivity() {

    var posicion_horizontal:Boolean = false
    lateinit var boton1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (textoVertical == null) {
            posicion_horizontal = true
            toast("Estas en horizontal")
        }else{
            toast("Estas en vertical")
        }

    boton1 = findViewById(R.id.boton1)

        boton1.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
            finish()
        }



}
}
