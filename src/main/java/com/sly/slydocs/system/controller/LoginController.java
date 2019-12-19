package com.sly.slydocs.system.controller;

import com.sly.slydocs.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SLY
 * @time 2019/12/19
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

    /**
     * @param
     * @return
     * @author SLY
     * @time 2019/12/19
     */
    @RequestMapping("/toIndex")
    public String toLogin() {
        return "/system/index.html";
    }


}
