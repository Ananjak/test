package com.practice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class ComputerVO {
    private int serialNumber;
    private String cpu;
    private String ram;
    private String ssd;
    private String vga;

}
