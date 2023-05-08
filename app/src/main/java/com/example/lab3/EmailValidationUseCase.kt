package com.example.lab3

class EmailValidationUseCase {

    operator fun invoke(email: String): EmailValidationType {
        if (email.isEmpty()) {
            return EmailValidationType.EmptyField
        }
        if (email.count() < 5) {
            return EmailValidationType.TooShort
        }
        if (!email.contains("@")) {
            return EmailValidationType.NoEmailSign
        }
        return EmailValidationType.Valid
    }

}

enum class EmailValidationType {
    EmptyField,
    NoEmailSign,
    TooShort,
    Valid
}