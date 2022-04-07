package com.example.springsessionb;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 类名： SpringSessionTestController
 * 描述 TODO：
 * 创建时间： 2022/4/7 14:35
 * 创建人： Administrator
 */
@RestController
@RequestMapping("/session")
public class SpringSessionTestController {

    @RequestMapping("/get/{name}")
    public String getSesseion(HttpServletRequest request, @PathVariable("name") String name){
        HttpSession session = request.getSession();
        String value = (String)session.getAttribute(name);
        return "sessionId:"+session.getId()+" value:"+value;
    }
}
