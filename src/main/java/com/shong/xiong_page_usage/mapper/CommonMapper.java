package com.shong.xiong_page_usage.mapper;


import com.shong.xiong_page_usage.model.ConsultConfigArea;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CommonMapper {


    List<ConsultConfigArea> queryAreaByAreaCode(Map param);


    com.shong.xiong_page.bean.Page<ConsultConfigArea> queryAreaByAreaCodePage(com.shong.xiong_page.bean.Page page, @Param("param") Map param);


}
