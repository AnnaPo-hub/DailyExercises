package regEx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIPTest {
    String correctIP1 = "127.0.0.1";
    String correctIP2 = "192.168.123.231";
    String notCorrectIP1 = "256.0.0.1";
    String notCorrectIP2 = "127.0.1";
    String notCorrectIP3 = "-1.0.0.1";
    String notCorrectIP4 = "127.0.0.1.";
    CheckIP check = new CheckIP();

    @Test
    void shouldCheckIPAddressIsCorrect() {
        assertTrue(check.checkIPAddress(correctIP1));
    }
    @Test
    void shouldCheckIPAddressIsCorrect2() {
        assertTrue(check.checkIPAddress(correctIP2));
    }

    @Test
    void shouldCheckIPAddressIsNotCorrect() {
        assertFalse(check.checkIPAddress(notCorrectIP1));
    }

    @Test
    void shouldCheckIPAddressIsNotCorrect2() {
        assertFalse(check.checkIPAddress(notCorrectIP2));
    }

    @Test
    void shouldCheckIPAddressIsNotCorrect3() {
        assertFalse(check.checkIPAddress(notCorrectIP3));
    }

    @Test
    void shouldCheckIPAddressIsNotCorrect4() {
        assertFalse(check.checkIPAddress(notCorrectIP4));
    }
}