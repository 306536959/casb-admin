package com.casb.casbadmin.controller.login;

import com.casb.casbadmin.service.LoginService;
import com.casb.casbadmin.utils.WebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/login")
    public WebUtil login() {
        loginService.login(1,"12345");
        return WebUtil.success("成功了");
    }
}
