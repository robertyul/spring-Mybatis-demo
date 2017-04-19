package com.action;

import com.persistence.manager.DemoMannger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by robertpicyu on 2017/3/7.
 */
@Controller
public class DemoAction {
    @Autowired
    DemoMannger demoMannger;
    @RequestMapping(value="/ok",method={RequestMethod.GET})
    public Object welcome(HttpServletRequest request, HttpServletResponse response){
        Map<String,String> result = new HashMap<String,String>();
        result.put("key","ok value");
        return  result;
    }

    @RequestMapping(value="/ok2",method={RequestMethod.GET})
    public Object welcome2(HttpServletRequest request, HttpServletResponse response){
        return "ok2 value";
    }

    @RequestMapping(value="/mybatisDemo",method={RequestMethod.GET})
    public Object mybatisDemo(HttpServletRequest request, HttpServletResponse response){
        return demoMannger.getValue();
    }


}
