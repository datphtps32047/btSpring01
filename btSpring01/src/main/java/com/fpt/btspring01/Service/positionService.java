package com.fpt.btspring01.Service;

import com.fpt.btspring01.Model.position;

import java.util.List;
import java.util.Optional;

public interface positionService {
    position savePosition(position position);
    Optional<position> getPositionById(Long positionId);
    List<position> getAllPositions();
    void deletePositionById(Long positionId);
}
