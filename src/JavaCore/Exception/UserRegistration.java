package JavaCore.Exception;

import JavaCore.Exception.Exceptions.*;

public class UserRegistration {
    private static final int MAX_LOGIN_LENGTH = 20;
    private static final int MAX_PASSWORD_LENGTH = 20;
    public static final String PATTERN = "[a-zA-Z0-9_]+";

    public static void checkUserInfo(String login, String password, String confirmPassword)
            throws UserRegistrationException {
        // Проверка логина
        if (login.length() > MAX_LOGIN_LENGTH || !login.matches(PATTERN)) {
            throw new WrongLoginException("Wrong login");
        }

        // Проверка пароля
        if (password.length() > MAX_PASSWORD_LENGTH || !password.matches(PATTERN)) {
            throw new WrongPasswordException("Wrong password");
        }

        // Проверка подтверждения пароля
        if (!password.equals(confirmPassword)) {
            throw new WrongConfirmPasswordException("Passwords do not match");
        }
    }
}
