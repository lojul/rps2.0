package com.lowork.rps.plangroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanGroupRepo extends JpaRepository<PlanGroup, Long> {

    /*public List<PlanGroup> findAll();*/
}
