package br.com.maderal.payremind_me

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME = 4000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed({

            val mySuperIntent = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(mySuperIntent)

            finish()
        }, SPLASH_TIME.toLong())

     //   carrega()
    }

    /*private fun carrega() {
        Handler().postDelayed({
            proximaTela()
        }, 3000L)
    }

    private fun proximaTela() {
        val proximaTelaIntent = Intent(this,
            LoginActivity::class.java)
        startActivity(proximaTelaIntent)
        finish()
    }*/
}
