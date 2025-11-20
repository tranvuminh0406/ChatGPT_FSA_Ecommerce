package training.g2.exception.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Setter
@Getter
public class BusinessException extends RuntimeException {
    @JsonIgnore
    protected int httpCode;
    protected String responseMessage;
    protected Object responseData;

    public BusinessException(String responseMessage) {
        super(responseMessage);
        this.responseMessage = responseMessage;
        this.httpCode = HttpStatus.CONFLICT.value();
        this.responseData = null;
    }

    public BusinessException(HttpStatus status, String responseMessage) {
        super(responseMessage);
        this.responseMessage = responseMessage;
        this.httpCode = status.value();
        this.responseData = null;
    }

    public BusinessException(HttpStatus status, String responseMessage, Object responseData) {
        super(responseMessage);
        this.responseMessage = responseMessage;
        this.httpCode = status.value();
        this.responseData = responseData;

    }

    public BusinessException(String responseMessage, Object responseData) {
        super(responseMessage);
        this.responseMessage = responseMessage;
        this.httpCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
        this.responseData = responseData;
    }

    // Các phương thức tiện lợi để tạo exception
    public static BusinessException of(String responseMessage) {
        return new BusinessException(responseMessage);
    }

    public static BusinessException of(String responseMessage, Exception e) {
        return new BusinessException(responseMessage, e.getLocalizedMessage());
    }

    public static BusinessException of(HttpStatus status, String responseMessage) {
        return new BusinessException(status, responseMessage);
    }

}