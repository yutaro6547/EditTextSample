package zukkey.whiskey.edittextsample

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class EditSampleFragmentPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {

  override fun getItem(position: Int): Fragment {
    return when(position) {
      0 -> EditFragment.newInstance()
      1 -> EditFragment.newInstance()
      2 -> EditFragment.newInstance()
      3 -> EditFragment.newInstance()
      4 -> EditFragment.newInstance()
      else -> EditFragment.newInstance()
    }
  }

  override fun getCount(): Int = 5

  override fun getPageTitle(position: Int): CharSequence? {
    return "Page" + (position + 1).toString()
  }
}
