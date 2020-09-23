package com.springcloud.exception;

import com.springcloud.enums.MessageCode;
import com.springcloud.response.ResponseBase;
import com.springcloud.response.ResponseBuilder;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * 统一异常处理
 *
 * @author 张润东
 * @date 20200923
 * @since v1.0
 */
@Component
public class DefaultGlobalExceptionHandler {
    /**
     * 处理自定义业务异常处理
     */
    @ExceptionHandler(RuntimeException.class)
    public ResponseBase handleCpsException(RuntimeException e) {
        String message = e.getMessage();
        if (message == null) {
            return ResponseBuilder.buildErrorMsg(e.getMessage());
        } else {
            return ResponseBuilder.buildErrorMsg(message);
        }
    }

    /**
     * 参数校验异常处理
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseBase handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        String errorMsg = bindingResult.getFieldError().getDefaultMessage();
        return ResponseBuilder.buildErrorMsg(errorMsg);
    }

    @ExceptionHandler(BindException.class)
    public ResponseBase handleBindException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        String errorMsg = bindingResult.getFieldError().getDefaultMessage();

        return ResponseBuilder.buildErrorMsg(errorMsg);
    }

    /**
     * 上传文件大小限制异常处理
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseBase handleMaxUploadSizeExceededException(MaxUploadSizeExceededException e) {
        return ResponseBuilder.buildErrorMsg(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseBase handleException(Exception e) {
        return ResponseBuilder.buildErrorMsg(MessageCode.ERR105);
    }
}
