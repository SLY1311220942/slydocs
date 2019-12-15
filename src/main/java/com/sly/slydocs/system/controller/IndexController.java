package com.sly.slydocs.system.controller;

import com.sly.slydocs.common.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 索引controller
 */
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController {

    /**
     *
     * @return
     */
    @RequestMapping("/toIndex")
    public String toIndex(){
        return "/system/index.html";
    }
}
