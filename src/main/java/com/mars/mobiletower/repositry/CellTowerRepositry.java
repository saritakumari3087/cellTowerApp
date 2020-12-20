package com.mars.mobiletower.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mars.mobiletower.model.CellTower;
@Repository
public interface CellTowerRepositry extends JpaRepository<CellTower, Long> {

}
