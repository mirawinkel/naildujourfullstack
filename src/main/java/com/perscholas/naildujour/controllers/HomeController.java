package com.perscholas.naildujour.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    @GetMapping("/index")
    String index(){
        return "index";
    }

    @GetMapping("")
    String getIndex(){
        return "index";
    }

    @GetMapping("/staticmenu")
    String getStaticMenu(){
        return "staticmenu";
    }

    @GetMapping("/about")
    String getAbout(){
        return "about";
    }
//    @GetMapping("/inventory")
//    String getInventory(){
//        return "inventory";
//    }

//@GetMapping("/login")
//    String login(){
//        return "login";
//}


}
