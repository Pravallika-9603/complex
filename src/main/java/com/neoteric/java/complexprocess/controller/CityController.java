package com.neoteric.java.complexprocess.controller;


import com.neoteric.java.complexprocess.dto.CityDto;
import com.neoteric.java.complexprocess.entity.CityEntity;
import com.neoteric.java.complexprocess.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @PostMapping(value = "/send")
    public void send(@RequestBody Map<String,Map<String,List<CityDto>>> dataDto) {

        Map<String,List<CityDto>> res=dataDto.get("response");
//        if (res == null || !res.containsKey("cil")) {
//            throw new IllegalArgumentException("Invalid payload: 'response' or 'cil' not found");
//        }
//
      List<CityDto> cli=res.get("cil");
//        if (cli.isEmpty()) {
//            throw new IllegalArgumentException("The 'cil' list is empty");
//        }

        cityService.storage(cli);
    }

}
