package tn.esprit.nascar

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import tn.esprit.nascar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO 11 Bind the toolbar to the activity
setSupportActionBar(binding.toolbar)



        //TODO 1 Implement the click on the 3 buttons (btnNews|btnEvents|btnProfile) to call changeFragment(...)
        binding.btnNews.setOnClickListener(){
            val newsfragment = NewsFragment()
            changeFragment(newsfragment,"NewsFragment")
        }
        binding.btnEvents.setOnClickListener(){
            val eventsfragment = EventsFragment()
            changeFragment(eventsfragment,"eventsfragment")
        }
        binding.btnProfile.setOnClickListener(){
            val profilefragment = ProfileFragment()
            changeFragment(profilefragment,"profilefragment")
        }


        //TODO 2 Implement the first call of the first fragment
        val newsfragment = NewsFragment()
        changeFragment(newsfragment,"profilefragment")
    }

    private fun changeFragment(fragment: Fragment, tag: String) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(binding.fragmentContainer.id, fragment)



        transaction.commit()
    }

    //TODO 12 Override the method onCreateOptionsMenu()
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
      menuInflater.inflate(R.menu.menu_toolbar,menu)
        return true
    }

    //TODO 13 Override the method onOptionsItemSelected() and Implement info and logout behavior
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }




}