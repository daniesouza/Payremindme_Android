package br.com.maderal.payremind_me

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        carrega()
    }

    private fun carrega() {
        Handler().postDelayed({
            proximaTela()
        }, 3000L)
    }

    private fun proximaTela() {
        val proximaTelaIntent = Intent(this,
            LoginActivity::class.java)
        startActivity(proximaTelaIntent)
        finish()
    }
}
