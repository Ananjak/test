package com.practice.controller;

import com.practice.domain.ComputerVO;
import com.practice.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ComputerAPIController {
    @Autowired
    private ComputerMapper computerMapper;

    @GetMapping
    public List<ComputerVO> get_all_computer(){
        return computerMapper.get_all_computer();
    }

    @GetMapping("/{serialName}")
    public ComputerVO get_computer_by_serialName(@PathVariable String serialName){
        return computerMapper.get_computer(serialName);
    }

    @GetMapping("/ram")
    public List<ComputerVO> get_computer_by_ram(@RequestParam(required = false) String key){
        return computerMapper.get_computer_by_ram(key);
    }


}
