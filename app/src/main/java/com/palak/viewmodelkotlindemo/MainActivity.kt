package com.palak.viewmodelkotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.palak.viewmodelkotlindemo.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    //in develop branch.
    //changing master to demo rebase.
    //in feature branch.
    //committing again from feature branch.

    //created feature branch from develop using cli
    //Developed profile feature.
    //developed menu.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
