package org.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/kimEditor")
    public String kimEditor(){

        return "pages/kimEditor" ;
    }

    @GetMapping("/ParkEditor")
    public String parkEditor(){

        return "pages/ParkEditor";
    }





}
