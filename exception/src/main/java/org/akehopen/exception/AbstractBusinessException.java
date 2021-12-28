package org.akehopen.exception;

import lombok.Data;

/**
 * 自定义异常
 *
 * @author panghaoyue
 */
@Data
public abstract class AbstractBusinessException extends RuntimeException {

    protected String message;
    protected Integer code;
    protected Integer httpStatus;
    protected final Long timestamp;
    protected Object model;

    protected AbstractBusinessException(Long timestamp) {
        this.timestamp = timestamp;
    }

}
