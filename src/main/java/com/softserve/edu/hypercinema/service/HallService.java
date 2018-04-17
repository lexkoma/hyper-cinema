package com.softserve.edu.hypercinema.service;

import com.softserve.edu.hypercinema.entity.HallEntity;

import java.util.List;

public interface HallService {

    void createHall(HallEntity hallEntity);

    List<HallEntity> getAllHalls();

    HallEntity getHallById(Long id);

    void updateHall(HallEntity hallEntity);

    void deleteHall(Long id);

}