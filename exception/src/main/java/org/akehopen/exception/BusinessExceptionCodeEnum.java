package org.akehopen.exception;


/**
 * 业务异常代码枚举
 *
 * @author panghaoyue
 */
public enum BusinessExceptionCodeEnum {

    /**
     * 未授权
     */
    UNAUTHORIZED(40001, HttpStatus.UNAUTHORIZED, "UNAUTHORIZED"),
    /**
     * 授权失败
     */
    AUTH_FAIL(40002, HttpStatus.UNAUTHORIZED, "UN_LOGIN"),

    /**
     * 没有权限
     */
    ACCESS_DENIED(40003, HttpStatus.FORBIDDEN, "没有该功能权限"),
    /**
     * 业务异常
     */
    UNPROCESSABLE(40004, HttpStatus.UNPROCESSABLE_ENTITY, "业务异常"),
    /**
     * 系统异常
     */
    SYSTEM(50001, HttpStatus.INTERNAL_SERVER_ERROR, "系统异常");

    private final int code;
    private final HttpStatus httpStatus;
    private final String message;

    BusinessExceptionCodeEnum(int code, HttpStatus httpStatus, String message) {
        this.code = code;
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }

}
