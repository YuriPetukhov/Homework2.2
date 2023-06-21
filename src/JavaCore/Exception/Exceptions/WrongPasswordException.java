package JavaCore.Exception.Exceptions;

public class WrongPasswordException extends UserRegistrationException {
    public WrongPasswordException(String message) {
        super(message);
    }
}
