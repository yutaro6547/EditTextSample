package zukkey.whiskey.edittextsample

import android.text.Editable
import android.text.TextWatcher


abstract class CustomTextWatcher : TextWatcher {

  private var lastLength: Int = 0

  abstract fun afterTextChanged(s: Editable, backSpace: Boolean)

  override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
    lastLength = s.length
  }

  override fun afterTextChanged(s: Editable) {
    afterTextChanged(s, lastLength > s.length)
  }
}
