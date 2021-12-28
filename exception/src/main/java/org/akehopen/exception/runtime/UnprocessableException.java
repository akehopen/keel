package org.akehopen.exception.runtime;


import org.akehopen.exception.AbstractBusinessException;
import org.akehopen.exception.BusinessExceptionCodeEnum;

/**
 * 异常
 *
 * @author panghaoyue
 */
public class UnprocessableException extends AbstractBusinessException {

    public UnprocessableException() {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.UNPROCESSABLE.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.UNPROCESSABLE.getHttpStatus().value();
        super.message = BusinessExceptionCodeEnum.UNPROCESSABLE.getMessage();
    }

    public UnprocessableException(String message) {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.UNPROCESSABLE.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.UNPROCESSABLE.getHttpStatus().value();
        super.message = message;
    }

    public UnprocessableException(int code) {
        super(System.currentTimeMillis());
        super.code = code;
        super.httpStatus = BusinessExceptionCodeEnum.UNPROCESSABLE.getHttpStatus().value();
        super.message = BusinessExceptionCodeEnum.UNPROCESSABLE.getMessage();
    }

    public UnprocessableException(String message, int code) {
        super(System.currentTimeMillis());
        super.code = code;
        super.httpStatus = BusinessExceptionCodeEnum.UNPROCESSABLE.getHttpStatus().value();
        super.message = message;
    }

}
