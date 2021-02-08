package com.lowork.rps.plangroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanGroupService {

    @Autowired
    private PlanGroupRepo planGroupRepo;

    public List<PlanGroup> findAll()
    {
        return planGroupRepo.findAll();
    }

}
