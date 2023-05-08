package com.example.lab3

import android.content.Context

class StringReturn {

    operator fun invoke(context: Context): String {
        return context.getString(R.string.test_string1)
    }

}