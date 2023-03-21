package com.practice.mapper;

import com.practice.domain.ComputerVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ComputerMapper {
   @Select("SELECT * FROM computer_tbl")
   List<ComputerVO> get_all_computer();

   ComputerVO get_computer(String serialNumber);

   List<ComputerVO> get_computer_by_ram(String ram);
}
