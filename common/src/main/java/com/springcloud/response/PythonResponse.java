package com.springcloud.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * python响应数据类型
 *
 * @param <T> 返回数据泛型
 * @author zhongyong
 * @date 20200409
 * @since v1.0
 */
@NoArgsConstructor
@Data
public class PythonResponse<T> extends ResponseBase {

    private T data;

    public PythonResponse(Integer code, String msg, T data) {
        super(code, msg);
        this.data = data;
    }
}
