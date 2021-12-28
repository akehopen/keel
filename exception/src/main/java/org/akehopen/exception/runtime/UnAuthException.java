package org.akehopen.exception.runtime;


import org.akehopen.exception.AbstractBusinessException;
import org.akehopen.exception.BusinessExceptionCodeEnum;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * 权限异常
 *
 * @author panghaoyue
 */
public class UnAuthException extends AbstractBusinessException {

    public UnAuthException() {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.UNAUTHORIZED.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.UNAUTHORIZED.getHttpStatus().value();
        super.message = BusinessExceptionCodeEnum.UNAUTHORIZED.getMessage();
    }

    public UnAuthException(String message) {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.UNAUTHORIZED.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.UNAUTHORIZED.getHttpStatus().value();
        super.message = message;
    }

    public UnAuthException(String message, String loginUrl, String originUrl) {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.UNAUTHORIZED.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.UNAUTHORIZED.getHttpStatus().value();
        super.message = message;
        super.model = this.buildModel(loginUrl, originUrl);
    }

    public UnAuthException(String loginUrl, String originUrl) {
        super(System.currentTimeMillis());
        super.code = BusinessExceptionCodeEnum.UNAUTHORIZED.getCode();
        super.httpStatus = BusinessExceptionCodeEnum.UNAUTHORIZED.getHttpStatus().value();
        super.model = this.buildModel(loginUrl, originUrl);
    }

    public UnAuthException(int code) {
        super(System.currentTimeMillis());
        super.code = code;
        super.httpStatus = BusinessExceptionCodeEnum.UNAUTHORIZED.getHttpStatus().value();
        super.message = BusinessExceptionCodeEnum.UNAUTHORIZED.getMessage();
    }

    public UnAuthException(int code, String loginUrl, String originUrl) {
        super(System.currentTimeMillis());
        super.code = code;
        super.httpStatus = BusinessExceptionCodeEnum.UNAUTHORIZED.getHttpStatus().value();
        super.message = BusinessExceptionCodeEnum.UNAUTHORIZED.getMessage();
        super.model = this.buildModel(loginUrl, originUrl);
    }

    public UnAuthException(String message, int code) {
        super(System.currentTimeMillis());
        super.code = code;
        super.httpStatus = BusinessExceptionCodeEnum.UNAUTHORIZED.getHttpStatus().value();
        super.message = message;
    }

    public UnAuthException(String message, int code, String loginUrl, String originUrl) {
        super(System.currentTimeMillis());
        super.code = code;
        super.httpStatus = BusinessExceptionCodeEnum.UNAUTHORIZED.getHttpStatus().value();
        super.message = message;
        super.model = this.buildModel(loginUrl, originUrl);
    }

    private Map<String, String> buildModel(String loginUrl, String originUrl) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("loginUrl", loginUrl);
        map.put("originUrl", originUrl);
        return map;
    }

}
