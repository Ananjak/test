package com.practice.controller;

import com.practice.domain.ComputerVO;
import com.practice.mapper.ComputerMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Log4j2
@Controller
@RequestMapping("/com")
public class ComputerController {
    @Autowired
    private ComputerMapper computerMapper;

    @GetMapping
    public void get_all_computer(Model model){
        List<ComputerVO> vos = computerMapper.get_all_computer();
        model.addAttribute("vos", vos);
    }

    @GetMapping("/{serialName}")
    public String get_computer_by_serialName(
            @PathVariable String serialName,
            Model model
    ){
        model.addAttribute("vo", computerMapper.get_computer(serialName));
        return "/com/serial";
    }

    @GetMapping("/ram")
    public void get_computer_by_ram(
            @RequestParam(required = false) String key,
            Model model
    ){
        model.addAttribute(
                "vos",
                computerMapper.get_computer_by_ram(key)
        );
    }
}







