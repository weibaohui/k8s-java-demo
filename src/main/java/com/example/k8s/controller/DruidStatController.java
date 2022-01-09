package com.example.k8s.controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author weibh
 */
@RestController
@Slf4j
public class DruidStatController {
    @GetMapping("/druidx/stat")
    public List<Map<String, Object>> druidStat() {
        log.debug("xxx");
        log.info("xxx");
        log.warn("xxx");
        log.info("xxx");
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }
}
