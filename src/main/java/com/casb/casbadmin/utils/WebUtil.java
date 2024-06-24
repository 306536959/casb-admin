package com.casb.casbadmin.utils;

import com.casb.casbadmin.constant.WebConstant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;


@Getter
@Setter
@Slf4j
public class WebUtil {

    /**
     * 状态码
     */
    private int code;

    /**
     * 返回内容
     */
    private String msg;

    /**
     * 数据对象
     */
    private Object data;

    public WebUtil() {
    }

    public WebUtil(WebConstant webConstant, Object data) {
        this.code = webConstant.getCode();
        this.msg = webConstant.getMsg();
        this.data = data;
    }

    public WebUtil(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static WebUtil success() {
        log.info("response：{}--->{}", WebConstant.SUCCESS.getCode(), WebConstant.SUCCESS.getMsg());
        return new WebUtil(WebConstant.SUCCESS, null);
    }

    /**
     * 返回成功消息
     *
     * @param data 数据对象
     * @return 成功消息
     */
    public static WebUtil success(Object data) {
        log.info("response：{}--->{}---->{}", WebConstant.SUCCESS.getCode(), WebConstant.SUCCESS.getMsg(), data);
        return new WebUtil(WebConstant.SUCCESS, data);
    }

    public static WebUtil successImport(String msg) {
        log.info("response：{}--->{}---->{}", WebConstant.SUCCESS.getCode(), WebConstant.SUCCESS.getMsg(), msg);
        return new WebUtil(0,  msg,  msg);
    }



    /**
     * 返回错误消息
     *
     * @return 成功消息
     */
    public static WebUtil error() {
        log.error("response：{}--->{}", WebConstant.ERROR.getCode(), WebConstant.ERROR.getMsg());
        return new WebUtil(WebConstant.ERROR, null);
    }

    /**
     * 返回错误消息
     *
     * @return 成功消息
     */
    public static WebUtil error(String  msg) {
        log.error("response：{}--->{}", WebConstant.ERROR.getCode(), WebConstant.ERROR.getMsg());
        return new WebUtil(WebConstant.ERROR1.getCode(), msg, null);
    }


    /**
     * 非正常情况
     *
     * @return 成功消息
     */
    public static WebUtil warn(WebConstant webConstant) {
        log.warn("response：{}--->{}", webConstant.getCode(), webConstant.getMsg());
        return warn(webConstant, null);
    }

    /**
     * 非正常情况
     *
     * @return 成功消息
     */
    public static WebUtil warn(int code, String msg) {
        log.warn("response：{}--->{}", code, msg);
        return new WebUtil(code, msg, null);
    }

    /**
     * 非正常情况（带数据返回）
     *
     * @return 成功消息
     */
    public static WebUtil warn(WebConstant webConstant, Object data) {
        return new WebUtil(webConstant, data);
    }

    /**
     * 附加msg信息的返回 带数据
     * msg附加到webConstant的msg后面
     *
     * @return 成功消息
     */
    public static WebUtil warn(WebConstant webConstant, Object data, String msg) {
        WebUtil webUtil = new WebUtil();
        webUtil.setCode(webConstant.getCode());
        webUtil.setData(data);
        webUtil.setMsg(webConstant.getMsg() + msg);
        return webUtil;
    }

    /**
     * 附加msg信息的返回
     * msg附加到webConstant的msg后面
     *
     * @return 成功消息
     */
    public static WebUtil warnMsg(WebConstant webConstant, String msg) {
        return warn(webConstant, null, msg);
    }

    @JsonIgnore
    public boolean isSuccess() {
        return this.code == WebConstant.SUCCESS.getCode();
    }


    /**
     * 响应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    public static WebUtil toAjax(int rows) {
        return rows > 0 ? success() : error();
    }

}
