package com.springcloud.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 列表响应类
 *
 * @param <T> 列表类型
 * @author zhongyong
 * @date 20200114
 * @since v1.0
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseList<T> extends ResponseBase {
    private DataList<T> data;

    ResponseList(Integer code, String msg) {
        super(code, msg);
    }
}
