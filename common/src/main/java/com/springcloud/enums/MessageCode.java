package com.springcloud.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 返回信息
 *
 * @author 张润东
 * @date 20200923
 * @since v1.0
 */
@AllArgsConstructor
public enum MessageCode {
    /**
     * 统一响应编码，这些不可以修改
     */
    SUCCESS(1, "成功"),
    ERROR(0, "失败"),
    ERR101(101, "未登录或登录超时"),
    ERR102(102, "无权限访问该接口"),
    ERR103(103, "预留错误码"),
    ERR104(104, "预留错误码"),
    ERR105(105, "系统出错"),


    /**
     * 本系统自定义响应错误码
     */
    ERR201(201, "文件大小超出限制"),
    ERR202(202, "参数不正确"),
    ERR203(203,"密码为默认密码,请修改密码");

    @Getter
    private Integer code;
    @Getter
    private String msg;
}
