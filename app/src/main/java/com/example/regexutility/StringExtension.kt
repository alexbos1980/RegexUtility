package com.example.regexutility



fun String.isValidPassword(maxLength: Int): Boolean {
    val passwordCheckRegex = Regex("^(?=.{4," + maxLength +"}$).*(?=.*\\d)(?=.*[a-z])" +
            "(?=.*[A-Z])(?!.*\\s)(?=.*[!@#$%^&*()_+|~\\-=\\\\`{}\\[\\]:\";'<>?,.\\/]).*$")

    return passwordCheckRegex.matches(this)
}
