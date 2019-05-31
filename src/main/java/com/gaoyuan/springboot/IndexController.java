package com.gaoyuan.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能描述:
 *
 * @author yaoyizhou
 * @date 2019/5/30 18:31
 * @desc
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello";
    }
}
