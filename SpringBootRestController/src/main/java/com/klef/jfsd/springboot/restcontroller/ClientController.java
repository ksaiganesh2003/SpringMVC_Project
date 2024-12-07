package com.klef.jfsd.springboot.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    List<Customer> customers = new ArrayList<>();

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String demo() {
        return "Welcome";
    }

    @GetMapping(path = "/demo1")
    public String demo1() {
        return "Y22 jfsd course";
    }

    @GetMapping(path = "demo2")
    public int demo2() {
        return 787;
    }

    @GetMapping("demo3")
    public String demo3(@RequestParam("id") int eid) {
        return "ID=" + eid;
    }

    @GetMapping(path = "calculateSum")
    public String demo4(@RequestParam("i") int x, @RequestParam("j") int y) {
        return Integer.toString(x + y);
    }

    @GetMapping(path = "combine")
    public String demo5(@RequestParam("str1") String x, @RequestParam("str2") String y) {
        return x.toUpperCase() + " " + y.toUpperCase();
    }
    
    @GetMapping(path = "calculate")
    public String demo6(@RequestParam("i") int x, @RequestParam("j") int y) {
        return Integer.toString(x * y);
    }
    
    @GetMapping("addcustomer")
    public String addcustomerGetFallback() {
        return "Customer inserted sucessfully";
    }

    }

