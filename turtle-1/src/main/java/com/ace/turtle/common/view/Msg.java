package com.ace.turtle.common.view;

import org.springframework.ui.ModelMap;

/**
 * 通用返回类
 */
public class Msg extends ModelMap {

    public Msg() {
        // 系统当前时间，用户纠正客户端时间与服务端时间不同步的问题
        this.addAttribute("currenttime", System.currentTimeMillis());
    }

    public Msg(String code, String msg) {
        this.addAttribute("currenttime", System.currentTimeMillis());
        this.addAttribute("success", false);
        this.addAttribute("code", code);
        this.addAttribute("msg", msg);

    }

    public Msg(String msg) {
        this.addAttribute("currenttime", System.currentTimeMillis());
        this.addAttribute("success", false);
        this.addAttribute("msg", msg);

    }

    /**
     * 设置当前操作成功
     */
    public Msg success(Object data) {
        this.addAttribute("currenttime", System.currentTimeMillis());
        this.addAttribute("success", true);
        this.addAttribute("data", data);
        this.addAttribute("code", "1");
        this.addAttribute("msg", "成功");
        return this;
    }

    /**
     * 设置当前操作成功
     */
    public Msg success() {
        this.addAttribute("success", true);
        return this;
    }

    public Msg fail() {
        this.addAttribute("success", false);
        return this;
    }

    public Msg fail(Object obj) {
        this.addAttribute("success", false);
        this.addAttribute("msg", obj);
        return this;
    }

    /**
     * 设置时间戳
     * 
     * @param timestamp
     */
    public Msg timestamp(long timestamp) {
        this.addAttribute("timestamp", timestamp);
        return this;
    }

}
