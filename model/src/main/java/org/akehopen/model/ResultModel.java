package org.akehopen.model;


import lombok.Data;
import org.akehopen.exception.AbstractBusinessException;
import org.akehopen.exception.HttpStatus;
import org.akehopen.exception.runtime.SystemException;

/**
 * 返回值模型
 *
 * @author panghaoyue
 */
@Data
public class ResultModel<T> {

    private final Long timestamp;
    private Integer code;
    private Integer status;
    private String message;
    private T model;

    private ResultModel() {
        this.timestamp = System.currentTimeMillis();
    }

    private ResultModel(T model) {
        this.timestamp = System.currentTimeMillis();
    }

    public static <E> ResultModel<E> getInstance() {
        return new ResultModel<>();
    }

    public static <E> ResultModel<E> getOkInstance() {
        ResultModel<E> resultModel = new ResultModel<>();
        resultModel.code = 0;
        resultModel.status = HttpStatus.OK.value();
        return resultModel;
    }

    public static <E> ResultModel<E> model(E model) {
        ResultModel<E> instance = getOkInstance();
        instance.model = model;
        return instance;
    }

    public static ResultModel<Object> exception(Throwable cause) {
        return exception(new SystemException(cause.getMessage()));
    }

    public static ResultModel<Object> exception(AbstractBusinessException cause) {
        ResultModel<Object> instance = getInstance();
        instance.message = cause.getMessage();
        instance.status = cause.getHttpStatus();
        instance.code = cause.getCode();
        instance.model = cause.getModel();
        return instance;
    }

}
