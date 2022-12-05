package com.example.seckilldemo.controller;


import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.seckilldemo.vo.RespBean;

/**
 * 测试类
 *
 * @author: LC
 * @date 2022/10/1 4:22 下午
 * @ClassName: DemoController
 */
@Controller
@RequestMapping("demo")
@Api(value = "demo", tags = "demo测试类")
public class DemoController {

    /**
     * 测试页面
     *
     * @param model
     * @return java.lang.String
     * @author LC
     * @operation add
     * @date 4:25 下午 2022/10/1
     **/
    @RequestMapping(value = "/hello", method = RequestMethod.PUT)
    public String hello(Model model) {
        model.addAttribute("name", "example");
        return "hello";
    }

    @GetMapping()
    public String test(Model model) {
        return "test";
    }

    @GetMapping("/getTest1")
    @ResponseBody
    public RespBean getTest1(String str) {
        return RespBean.success("Params in get method :" + str);
    }

    @GetMapping("/getTest2")
    @ResponseBody
    public RespBean getTest2(@RequestBody String str) {
        return RespBean.success("Body in get method : " + str);
    }

    @PostMapping("/postTest1")
    @ResponseBody
    public RespBean postTest1(String str) {
        return RespBean.success("Params in post method : " + str);
    }

    @PostMapping("/postTest2")
    @ResponseBody
    public RespBean postTest2(@RequestBody String str) {
        return RespBean.success("Body in post method : " + str);
    }
}
