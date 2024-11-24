package com.example.da3

import android.text.InputFilter
import android.text.Spanned

class DigitsInputFilter : InputFilter {
    override fun filter(
        source: CharSequence?,
        start: Int,
        end: Int,
        dest: Spanned?,
        dstart: Int,
        dend: Int
    ): CharSequence? {
        for (i in start until end) {
            if (!Character.isDigit(source?.get(i) ?: ' ')) {
                return ""
            }
        }
        return null
    }
}