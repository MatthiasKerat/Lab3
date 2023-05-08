package com.example.lab3

import android.content.Context
import androidx.compose.ui.res.stringResource
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

private const val FAKE_STRING = "FAKE Test string"

@RunWith(MockitoJUnitRunner::class)
class StringReturnTest {

    @Mock
    private lateinit var mockContext: Context

    @Test
    fun `test returns test string properly`() {
        mockContext = mock {
            on { getString(R.string.test_string1) } doReturn FAKE_STRING
        }

        val stringReturn = StringReturn()
        val result = stringReturn(mockContext)

        assertThat(result).isEqualTo(FAKE_STRING)
    }

}