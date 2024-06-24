package com.casb.casbadmin.constant;

public enum WebConstant {

    SUCCESS(200, "操作成功"),
    ERROR(500, "操作失败"),
    ERROR1(500, "操作失败"),
    WARN(400, "操作警告"),
    NOT_FOUND(404, "未找到该资源"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_ACCEPTABLE(406, "请求格式不支持"),
    REQUEST_TIMEOUT(408, "请求超时"),
    CONFLICT(409, "请求冲突"),
    UNSUPPORTED_MEDIA_TYPE(415, "不支持的媒体类型");

    private final int code;
    private final String msg;
    WebConstant(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }
}
