package hust.soict.cybersec.aims.exceptions;

@SuppressWarnings("serial")
public class CartFullException extends Exception {
    public CartFullException(String message) {
        super(message);
    }
}