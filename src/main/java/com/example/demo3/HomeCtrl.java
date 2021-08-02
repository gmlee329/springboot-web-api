package com.example.demo3;

import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

@RequestMapping("/home/*")
@Controller
public class HomeCtrl {

    final Sonny sonny;
    public HomeCtrl(Sonny sonny) {
        this.sonny = sonny;
    }

    private static final Logger logger = LoggerFactory.getLogger(HomeCtrl.class);

    @RequestMapping(value = "html", method = RequestMethod.GET)
    public String testViewPage(HttpServletRequest request) {
        return "testpage";
    }

    @ResponseBody
    @RequestMapping(value = "json", method = RequestMethod.GET)
    public String testJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("team", sonny.getTeam());
        jsonObject.addProperty("salary", sonny.getSalary());

        return jsonObject.toString();
    }

}
