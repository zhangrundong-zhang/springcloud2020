package com.springcloud.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseBase {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 消息
     */

    private String msg;
}
