package zukkey.whiskey.edittextsample

import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.widget.EditText
import timber.log.Timber


class CustomEditText @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : EditText(context, attrs, defStyleAttr) {

  override fun onTextChanged(text: CharSequence?, start: Int, lengthBefore: Int, lengthAfter: Int) {
    super.onTextChanged(text, start, lengthBefore, lengthAfter)
    Timber.i("EditText: text=%s, start=%s, lengthBefore=%s, lengthAfter=%s", text, start, lengthBefore, lengthAfter)
  }

  override fun onFocusChanged(focused: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
    super.onFocusChanged(focused, direction, previouslyFocusedRect)
    Timber.i("EditText: focused=%s, direction=%s, previouslyFocusedRect=%s", focused, direction, previouslyFocusedRect)
  }
}
