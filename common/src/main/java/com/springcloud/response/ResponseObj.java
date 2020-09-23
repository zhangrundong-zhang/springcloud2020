package com.springcloud.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 对象响应类
 *
 * @param <T> 对象响应类型
 * @author zhongyong
 * @date 20200114
 * @since v1.0
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseObj<T> extends ResponseBase {

    private DataObj<T> data;

    ResponseObj(Integer code, String msg) {
        super(code, msg);
    }
}
