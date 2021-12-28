package org.akehopen.exception.runtime;


import org.akehopen.exception.AbstractBusinessException;
import org.akehopen.exception.BusinessExceptionCodeEnum;

/**
 * 权限异常
 *
 * @author panghaoyue
 */
public class AuthFailException extends AbstractBusinessException {

    public AuthFailException() {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.AUTH_FAIL.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.AUTH_FAIL.getHttpStatus().value();
        super.message = BusinessExceptionCodeEnum.AUTH_FAIL.getMessage();
    }

    public AuthFailException(String message) {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.AUTH_FAIL.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.AUTH_FAIL.getHttpStatus().value();
        super.message = message;
    }

    public AuthFailException(int code) {
        super(System.currentTimeMillis());
        super.code = code;
        super.httpStatus = BusinessExceptionCodeEnum.AUTH_FAIL.getHttpStatus().value();
        super.message = BusinessExceptionCodeEnum.AUTH_FAIL.getMessage();
    }

    public AuthFailException(String message, int code) {
        super(System.currentTimeMillis());
        super.code = code;
        super.httpStatus = BusinessExceptionCodeEnum.AUTH_FAIL.getHttpStatus().value();
        super.message = message;
    }

}
