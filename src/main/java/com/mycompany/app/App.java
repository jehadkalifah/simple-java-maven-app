package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
    // ❗ CRITICAL SonarQube issue: Hardcoded credential
    private static final String DB_PASSWORD = "SuperSecretPass123!";  // Sonar: Hardcoded password (CRITICAL)

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());

        // using the bad credential (still compiles fine)
        System.out.println("Connecting with password: " + DB_PASSWORD);
    }

    private final String getMessage() {
        return message;
    }
}
