package com.fpt.btspring01.Repository;

import com.fpt.btspring01.Model.position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<position, Long> {
}
