package org.ypq.exception;

public class DefRTException extends RuntimeException {

    public DefRTException() {
    }

    public DefRTException(String message) {
        super(message);
    }

    public DefRTException(String message, Throwable cause) {
        super(message, cause);
    }

    public DefRTException(Throwable cause) {
        super(cause);
    }

    public DefRTException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
