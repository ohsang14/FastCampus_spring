package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
   public String niceToMeetyou(Model model){
        model.addAttribute("username","홍홍홍박사");
       return "greetings"; //geetings.mustache 파일 반환.
   }
   @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","오길동");
        return "goodbye";
   }
}
