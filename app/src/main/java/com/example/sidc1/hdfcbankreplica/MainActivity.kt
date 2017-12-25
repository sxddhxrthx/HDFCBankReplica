package com.example.sidc1.hdfcbankreplica

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var toolBar: android.support.v7.widget.Toolbar
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager:ViewPager
    private lateinit var pagerAdapter:PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setting up toolbar
        toolBar = findViewById(R.id.toolBar)
        setSupportActionBar(toolBar)

        //setting up TabLayout
        tabLayout = findViewById(R.id.tabs)
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.addTab(tabLayout.newTab().setText("QUICK ACCESS PIN"))
        tabLayout.addTab(tabLayout.newTab().setText("CUSTOMER ID / USER ID"))

        //setting up PagerAdapter
        //pagerAdapter = PagerAdapter(supportFragmentManager,this)

        //setting up viewPager
        viewPager = findViewById(R.id.viewPager)
        viewPager!!.adapter = pagerAdapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))



    }
}
