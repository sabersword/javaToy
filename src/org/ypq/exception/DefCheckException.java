package org.ypq.exception;

public class DefCheckException extends Exception {

    public DefCheckException() {
    }

    public DefCheckException(String message) {
        super(message);
    }

    public DefCheckException(String message, Throwable cause) {
        super(message, cause);
    }

    public DefCheckException(Throwable cause) {
        super(cause);
    }

    public DefCheckException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
