package zukkey.whiskey.edittextsample

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import com.jakewharton.rxbinding2.widget.RxTextView
import io.reactivex.android.schedulers.AndroidSchedulers
import timber.log.Timber
import zukkey.whiskey.edittextsample.databinding.FragmentEditSampleBinding


class EditFragment: Fragment() {

  lateinit var binding: FragmentEditSampleBinding

  companion object {

    fun newInstance(): Fragment {
      return EditFragment()
    }
  }


  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_edit_sample, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding = FragmentEditSampleBinding.bind(view)

    with(binding) {

      RxTextView.textChangeEvents(one)
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe({ event ->
            if (event.count() == 1) {
              two.performClick()
              two.requestFocus()
            }
          }, {
            Timber.e(it, it.message)
          })

      RxTextView.textChangeEvents(two)
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe({ event ->
            if (event.count() == 1) {
              three.performClick()
              three.requestFocus()
            } else if (event.text().isEmpty()) {
              two.setOnKeyListener { v, keyCode, event ->
                if (event.keyCode == KeyEvent.KEYCODE_DEL
                    && event.action == KeyEvent.ACTION_DOWN && two.text.isEmpty()) {
                  one.performClick()
                  one.requestFocus()
                  one.text.clear()
                }
                false
              }
            }
          }, {
            Timber.e(it, it.message)
          })

      RxTextView.textChangeEvents(three)
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe({ event ->
            if (event.count() == 1) {
              four.performClick()
              four.requestFocus()
            } else if (event.text().isEmpty()) {
              three.setOnKeyListener { v, keyCode, event ->
                if (event.keyCode == KeyEvent.KEYCODE_DEL
                    && event.action == KeyEvent.ACTION_DOWN && three.text.isEmpty()) {
                  two.performClick()
                  two.requestFocus()
                  two.text.clear()
                }
                false
              }
            }
          }, {
            Timber.e(it, it.message)
          })

      RxTextView.textChangeEvents(four)
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe({ event ->
            if (event.count() == 1) {
              five.performClick()
              five.requestFocus()
            } else if (event.text().isEmpty()) {
              four.setOnKeyListener { v, keyCode, event ->
                if (event.keyCode == KeyEvent.KEYCODE_DEL
                    && event.action == KeyEvent.ACTION_DOWN && four.text.isEmpty()) {
                  three.performClick()
                  three.requestFocus()
                  three.text.clear()
                }
                false
              }
            }
          }, {
            Timber.e(it, it.message)
          })

      RxTextView.textChangeEvents(five)
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe({ event ->
            if (event.count() == 1) {
              six.performClick()
              six.requestFocus()
            } else if (event.text().isEmpty()) {
              five.setOnKeyListener { v, keyCode, event ->
                if (event.keyCode == KeyEvent.KEYCODE_DEL
                    && event.action == KeyEvent.ACTION_DOWN && five.text.isEmpty()) {
                  four.performClick()
                  four.requestFocus()
                  four.text.clear()
                }
                false
              }
            }
          }, {
            Timber.e(it, it.message)
          })

      RxTextView.textChangeEvents(six)
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe({ event ->
            if (event.count() == 1) {
              seven.performClick()
              seven.requestFocus()
            } else if (event.text().isEmpty()) {
              six.setOnKeyListener { v, keyCode, event ->
                if (event.keyCode == KeyEvent.KEYCODE_DEL
                    && event.action == KeyEvent.ACTION_DOWN && six.text.isEmpty()) {
                  five.performClick()
                  five.requestFocus()
                  five.text.clear()
                }
                false
              }
            }
          }, {
            Timber.e(it, it.message)
          })

      RxTextView.textChangeEvents(seven)
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe({ event ->
            if (event.count() == 1) {
              eight.performClick()
              eight.requestFocus()
            } else if (event.text().isEmpty()) {
              seven.setOnKeyListener { v, keyCode, event ->
                if (event.keyCode == KeyEvent.KEYCODE_DEL
                    && event.action == KeyEvent.ACTION_DOWN && seven.text.isEmpty()) {
                  six.performClick()
                  six.requestFocus()
                  six.text.clear()
                }
                false
              }
            }
          }, {
            Timber.e(it, it.message)
          })

      RxTextView.textChangeEvents(eight)
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe({ event ->
            if (event.count() == 1) {
              nine.performClick()
              nine.requestFocus()
            } else if (eight.text.isEmpty()) {
              eight.setOnKeyListener { v, keyCode, event ->
                if (event.keyCode == KeyEvent.KEYCODE_DEL
                    && event.action == KeyEvent.ACTION_DOWN && eight.text.isEmpty()) {
                  seven.performClick()
                  seven.requestFocus()
                  seven.text.clear()
                }
                false
              }
            }
          }, {
            Timber.e(it, it.message)
          })

      RxTextView.textChangeEvents(nine)
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe({ event ->
            if (event.count() == 1) {
              val im = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
              im.hideSoftInputFromWindow(nine.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
            } else if (nine.text.isEmpty()) {
              nine.setOnKeyListener { v, keyCode, event ->
                if (event.keyCode == KeyEvent.KEYCODE_DEL
                    && event.action == KeyEvent.ACTION_DOWN && nine.text.isEmpty()) {
                  eight.performClick()
                  eight.requestFocus()
                  eight.text.clear()
                }
                false
              }
            }
          }, {
            Timber.e(it, it.message)
          })
    }
  }

}
