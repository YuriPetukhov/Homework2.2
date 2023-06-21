package JavaCore.Exception.Exceptions;

public class WrongConfirmPasswordException extends UserRegistrationException {
    public WrongConfirmPasswordException(String message) {
        super(message);
    }
}
