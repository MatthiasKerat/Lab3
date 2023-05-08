package com.example.lab3

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class EmailValidationUseCaseTest {

    private lateinit var emailValidationUseCase: EmailValidationUseCase

    @Before
    fun setUp() {
        emailValidationUseCase = EmailValidationUseCase()
    }

    @Test
    fun `test email validation empty field returns correct validation type`() {
        val result = emailValidationUseCase("")
        assertThat(result).isEqualTo(EmailValidationType.EmptyField)
    }

    @Test
    fun `test email validation 4 characters returns correct validation type`() {
        val result = emailValidationUseCase("Emai")
        assertThat(result).isEqualTo(EmailValidationType.TooShort)
    }

    @Test
    fun `test email validation no email sign returns correct validation type`() {
        val result = emailValidationUseCase("Testemail")
        assertThat(result).isEqualTo(EmailValidationType.NoEmailSign)
    }

    @Test
    fun `test email validation correct email returns correct validation type`() {
        val result = emailValidationUseCase("Email@test")
        assertThat(result).isEqualTo(EmailValidationType.Valid)
    }


}