package com.lowork.rps.plangroup;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="rps_plan_group")
@Getter @Setter @NoArgsConstructor
public class PlanGroup {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String planGroup;
    private String planGroupDesc;

    public PlanGroup(String planGroup, String planGroupDesc) {
        this.planGroup = planGroup;
        this.planGroupDesc = planGroupDesc;
    }
}
