package com.thymeleaf.controller;

import com.thymeleaf.entity.Psersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/goods")
public class Demo1Controller {

    @RequestMapping(value = "/demo1" , produces = "text/html")
    public String Demo1(HttpServletRequest request){
        request.setAttribute("name","姓名");
        request.setAttribute("age","年龄");
        List<Psersion> list = new ArrayList<Psersion>();
            list.add(new Psersion("张三" ,18));
            list.add(new Psersion("李四" ,25));
            list.add(new Psersion("王五" ,35));
        request.setAttribute("list" , list);
        return "test";
    }
}
