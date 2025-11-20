package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
    // ❗ CRITICAL SonarQube issue: Hardcoded credential (unused → DOES NOT break tests)
    private static final String DB_PASSWORD = "SuperSecretPass123!";

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());  // keeps test output unchanged
    }

    private final String getMessage() {
        return message;
    }
}
