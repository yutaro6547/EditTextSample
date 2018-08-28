package zukkey.whiskey.edittextsample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import zukkey.whiskey.edittextsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  lateinit var binding : ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    with(binding) {
      setSupportActionBar(toolBar)
      pager.adapter = EditSampleFragmentPagerAdapter(supportFragmentManager)
      tabLayout.setupWithViewPager(pager)
    }
  }
}
