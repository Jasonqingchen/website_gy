package com.example.LqcSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 跳转page
 * liuqingchen 2023/12/09
 */
@org.springframework.stereotype.Controller
public class Controller {

    /**
     * 导航
     */
    @RequestMapping("/index")
    public String seach() {
        return "index";
    }






}
