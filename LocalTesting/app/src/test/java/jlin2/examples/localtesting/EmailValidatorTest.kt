package jlin2.examples.localtesting

import org.junit.Assert.*
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun validEmailFormatTest() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun invalidEmailFormatTest() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
        assertFalse(EmailValidator.isValidEmail("testing123"))
        assertFalse(EmailValidator.isValidEmail(""))
        assertFalse(EmailValidator.isValidEmail(null))
    }
}