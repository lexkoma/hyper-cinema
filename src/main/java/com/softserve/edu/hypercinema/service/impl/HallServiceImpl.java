package com.softserve.edu.hypercinema.service.impl;

import com.softserve.edu.hypercinema.entity.HallEntity;
import com.softserve.edu.hypercinema.exceptions.HallNotFoundException;
import com.softserve.edu.hypercinema.repository.HallRepository;
import com.softserve.edu.hypercinema.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HallServiceImpl implements HallService {

    private static final String HALL_NOT_FOUND_MESSAGE = "Could not find hall with id=";

    private final HallRepository hallRepository;

    @Autowired
    public HallServiceImpl(HallRepository hallRepository) {
        this.hallRepository = hallRepository;
    }

    @Override
    public void createHall(HallEntity hallEntity) {
        hallRepository.save(hallEntity);
    }

    @Override
    public List<HallEntity> selectAllHalls() {
        return hallRepository.findAll();
    }

    @Override
    public HallEntity selectHallById(Long id) {
        return hallRepository.findById(id).orElseThrow(() -> new HallNotFoundException(HALL_NOT_FOUND_MESSAGE + id));
    }

    @Override
    public void updateHall(HallEntity hallEntity) {
        hallRepository.save(hallEntity);
    }

    @Override
    public void deleteHall(Long id) {
        hallRepository.deleteById(id);
    }

    @Override
    public void deleteHall(HallEntity hallEntity) {
        hallRepository.delete(hallEntity);
    }

}