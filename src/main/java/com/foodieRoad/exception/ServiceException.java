package com.foodieRoad.exception;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/05/05
 */
public class ServiceException extends RuntimeException{

    private static final long serialVersionUID = -7661881974219233311L;

    private int statusCode;

    public ServiceException (String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

}
