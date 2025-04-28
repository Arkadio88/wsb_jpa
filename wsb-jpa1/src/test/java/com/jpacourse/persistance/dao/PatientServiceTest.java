package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.PatientEntity;
import com.jpacourse.persistance.entity.VisitEntity;
import org.junit.jupiter.api.Test;

public class PatientServiceTest {

    @Test
    public void testFindPatientById(){
        //Given
        Long patientId = 1L;
        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientId);
        patientEntity.setFirstName("Arkadio");
        patientEntity.setLastName("Morales");

        Long visitId = 1L;
        VisitEntity visitEntity = new VisitEntity();
        visitEntity.setId(visitId);
        visitEntity.setDescription("cancer");

    }
}
