package com.zinidata.bizmap.controller;

import com.zinidata.bizmap.service.BizMainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/bizmap")
public class BizMainController {

    private final BizMainService bizMainService;

    @GetMapping("/index_m")
    public String index_m() {
        return "bizmap/index_m";
    }


}