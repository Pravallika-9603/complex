package com.neoteric.java.complexprocess.mapper;

import com.neoteric.java.complexprocess.dto.CityDto;
import com.neoteric.java.complexprocess.entity.CityEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DtoToEntityMapper {

    @Autowired
    public ModelMapper modelMapper;

    public CityEntity cityDtoToEntity(CityDto cityDto){

        return modelMapper.map(cityDto, CityEntity.class);

    }

}
