package com.shong.xiong_page_usage;

import com.shong.xiong_page_usage.model.ConsultConfigArea;
import com.shong.xiong_page_usage.services.AreaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class XiongPageUsageApplicationTests {

    @Autowired
    private AreaService areaService;

    @Test
    void contextLoads() {
    }

    @Test
    void areaPageTest() {
        Map<String, String> map = new HashMap();
        com.shong.xiong_page.bean.Page page = new com.shong.xiong_page.bean.Page(1, 10);
        com.shong.xiong_page.bean.Page<ConsultConfigArea> consultConfigAreas = areaService.selectAreaPage(page, map);
        System.out.println(consultConfigAreas);
    }
    @Test
    void areaPageTest2() {
        Map<String, String> map = new HashMap();
        map.put("areaCode", "030401");
        map.put("areaName", "德安");
        com.shong.xiong_page.bean.Page page = new com.shong.xiong_page.bean.Page(1, 10);
        com.shong.xiong_page.bean.Page<ConsultConfigArea> consultConfigAreas = areaService.selectAreaPage(page, map);
        System.out.println(consultConfigAreas);
    }

}
