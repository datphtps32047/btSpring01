package com.fpt.btspring01.Service.Impl;

import com.fpt.btspring01.Model.position;
import com.fpt.btspring01.Repository.PositionRepository;
import com.fpt.btspring01.Service.positionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class positionServiceImpl implements positionService {
    private final PositionRepository positionRepository;
    @Autowired
    public positionServiceImpl(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public position savePosition(position position) {
        return positionRepository.save(position);
    }

    @Override
    public Optional<position> getPositionById(Long positionId) {
        return positionRepository.findById(positionId);
    }

    @Override
    public List<position> getAllPositions() {
        return positionRepository.findAll();
    }

    @Override
    public void deletePositionById(Long positionId) {
        positionRepository.deleteById(positionId);
    }
}
