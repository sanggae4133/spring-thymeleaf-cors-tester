package com.test.cors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiTestController {

    @RequestMapping("/view")
    public String view() {
        return "cors";
    }

    @RequestMapping("/view-post")
    public String viewPost() {
        return "cors-post";
    }

    @RequestMapping("/view-delete")
    public String viewDelete() {
        return "cors-delete";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

}
