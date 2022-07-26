package com.thechance.task_week9.activites

import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.thechance.task_week9.fragments.HomeFragment
import com.thechance.task_week9.R
import com.thechance.task_week9.base_classes.BaseActivity
import com.thechance.task_week9.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    private val homeFragment = HomeFragment()

    override val logTag = MainActivity::class.simpleName
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate

    override fun setup() {
        replaceFragment(homeFragment)
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.sub_view_container, fragment)
        transaction.commit()
    }

}