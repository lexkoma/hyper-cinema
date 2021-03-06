package com.softserve.edu.hypercinema.converter.impl;

import com.softserve.edu.hypercinema.converter.HallConverter;
import com.softserve.edu.hypercinema.dto.HallDto;
import com.softserve.edu.hypercinema.entity.HallEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HallConverterImpl implements HallConverter {

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public HallEntity convertToEntity(HallDto hallDto) {
        return modelMapper.map(hallDto, HallEntity.class);
    }

    @Override
    public HallDto convertToDto(HallEntity hallEntity) {
        return modelMapper.map(hallEntity, HallDto.class);
    }

}
