package com.shong.xiong_page_usage.services;

import com.shong.xiong_page.bean.Page;

import java.util.Map;

/**
 * @auther 10349 XIONGSY
 * @create 2021/8/3
 */
public interface AreaService {
    Page selectAreaPage(Page page, Map<String, String> param);
}
