package com.neoteric.java.complexprocess.service;

import com.neoteric.java.complexprocess.dto.CityDto;
import com.neoteric.java.complexprocess.entity.CityEntity;
import com.neoteric.java.complexprocess.mapper.DtoToEntityMapper;
import com.neoteric.java.complexprocess.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    DtoToEntityMapper dtoToEntityMapper;

    public List<CityEntity> storage(List<CityDto> cityDto){


        List<CityEntity> dataEntities = cityDto.stream()
                .map(dtoToEntityMapper::cityDtoToEntity)
                .collect(Collectors.toList());

        return cityRepository.saveAll(dataEntities);
    }

}
