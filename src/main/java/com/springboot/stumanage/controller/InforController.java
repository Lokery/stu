package com.springboot.stumanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.stumanage.entity.ExceptionInfoRepository;

import java.util.List;

@Controller
public class InforController {
    @Autowired
    private ExceptionInfoRepository info;
    @RequestMapping("/query")
    @ResponseBody
    public List queryAll(){
        return  info.findAll();
    }
    @RequestMapping("/hat")
    public String Show(Model model){
        model.addAttribute("info",info.findAll());
        return "blank";
    }
}
