package JavaCore.Exception;

import JavaCore.Exception.Exceptions.UserRegistrationException;

public class Main {
    public static void main(String[] args) {
        try {
            String login = "java_skypro_go";
            String password = "D_1hWiKjjP_9";
            String confirmPassword = "D_1hWiKjjP_9";
            UserRegistration.checkUserInfo(login, password, confirmPassword);
        } catch (UserRegistrationException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}
