package com.example.cseckill.controller;


//import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试类
 *
 * @author: LC
 * @date 2022/3/1 4:22 下午
 * @ClassName: DemoController
 */
@Controller
@RequestMapping("/demo")
//@Api(value = "demo", tags = "demo测试类")
public class DemoController {

    /**
     * 测试页面
     *
     * @param model
     * @return java.lang.String
     * @author LC
     * @operation add
     * @date 4:25 下午 2022/3/1
     **/
    @RequestMapping(value = "/hello")
    public String hello(Model model) {
        model.addAttribute("name", "example");
        return "hello";
    }
}
