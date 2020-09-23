package com.springcloud.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 分页响应类
 *
 * @param <T> 分页响应类型
 * @author zhongyong
 * @date 20200114
 * @since v1.0
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponsePage<T> extends ResponseBase {

    private DataPage<T> data;

    ResponsePage(Integer code, String msg) {
        super(code, msg);
    }
}
