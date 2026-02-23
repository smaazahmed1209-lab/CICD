package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void demoNotificationReturnsMessageForGivenUser() {
        String message = Main.demoNotification("Alice");
        assertEquals("Demo notification: Hello, Alice!", message);
    }

    @Test
    void demoNotificationReturnsFallbackForBlankUser() {
        String message = Main.demoNotification("User");
        assertEquals("Demo notification: Hello, User!", message);
    }

    @Test
    void demoNotificationTrimsWhitespaceFromUser() {
        String message = Main.demoNotification("  Bob  ");
        assertEquals("Demo notification: Hello, Bob!", message);
    }
}
