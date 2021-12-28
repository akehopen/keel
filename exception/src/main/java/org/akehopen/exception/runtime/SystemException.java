package org.akehopen.exception.runtime;


import org.akehopen.exception.AbstractBusinessException;
import org.akehopen.exception.BusinessExceptionCodeEnum;

/**
 * 系统异常
 *
 * @author panghaoyue
 */
public class SystemException extends AbstractBusinessException {

    public SystemException() {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.SYSTEM.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.SYSTEM.getHttpStatus().value();
        super.message = BusinessExceptionCodeEnum.SYSTEM.getMessage();
    }

    public SystemException(Throwable cause) {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.SYSTEM.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.SYSTEM.getHttpStatus().value();
        super.message = BusinessExceptionCodeEnum.SYSTEM.getMessage();
        super.addSuppressed(cause);
    }

    public SystemException(String message) {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.SYSTEM.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.SYSTEM.getHttpStatus().value();
        super.message = message;
    }

    public SystemException(int code) {
        super(System.currentTimeMillis());
        super.code = code;
        super.httpStatus = BusinessExceptionCodeEnum.SYSTEM.getHttpStatus().value();
        super.message = BusinessExceptionCodeEnum.SYSTEM.getMessage();
    }

    public SystemException(String message, int code) {
        super(System.currentTimeMillis());
        super.code = code;
        super.httpStatus = BusinessExceptionCodeEnum.SYSTEM.getHttpStatus().value();
        super.message = message;
    }

}
