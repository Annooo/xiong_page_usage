package com.shong.xiong_page_usage.services;

import com.shong.xiong_page.bean.Page;
import com.shong.xiong_page_usage.mapper.CommonMapper;
import com.shong.xiong_page_usage.model.ConsultConfigArea;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @auther 10349 XIONGSY
 * @create 2021/8/3
 */
@Slf4j
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private CommonMapper commonMapper;

    @Override
    public Page selectAreaPage(Page page, Map<String, String> param) {
        Page<ConsultConfigArea> consultConfigAreas = commonMapper.queryAreaByAreaCodePage(page, param);
        log.info("consultConfigAreas = {} ", consultConfigAreas);

        return consultConfigAreas;
    }
}
