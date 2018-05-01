package com.softserve.edu.hypercinema.service;

import com.softserve.edu.hypercinema.entity.HallEntity;

import java.util.List;

public interface HallService {

    void createHall(HallEntity hallEntity);

    List<HallEntity> getHalls();

    HallEntity getHall(Long id);

    void updateHall(Long id, HallEntity hallEntity);

    void deleteHall(Long id);

}