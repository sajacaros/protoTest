package com.bnpinnovation.protobuf.controller;

import com.bnpinnovation.protobuf.dto.SCVDto;
import com.bnpinnovation.protobuf.service.SCVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DemoController {
    @Autowired
    private SCVService scvService;

    @PostMapping
    @RequestMapping("/scv")
    public Long createSCV(@RequestBody SCVDto.Request request) {
        return scvService.create(request);
    }
}
