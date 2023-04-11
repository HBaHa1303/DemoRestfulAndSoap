package com.example.projectdemorestfulandsoap.exceptions;

public class StudentNotFoundException extends BaseException {

    private static final long serialVersionUID = 1L;

    private static final int ERROR_STATUS_DEFAULT = 404;

    public StudentNotFoundException(String message, Throwable e) {
        super(ERROR_STATUS_DEFAULT, message, e);
    }

    public StudentNotFoundException(String message) {
        super(ERROR_STATUS_DEFAULT, message);
    }
}
