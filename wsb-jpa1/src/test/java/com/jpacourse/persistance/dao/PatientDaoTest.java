package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.AddressEntity;
import com.jpacourse.persistance.entity.PatientEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PatientDaoTest
{
    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testGetPatientsByLastName() {
        // given
        final String lastName = "Morales";
        // when
        Collection<PatientEntity> results = patientDao.getPatientByLastName(lastName);
        // then
        assertThat(results).isNotNull();
        assertThat(results).isNotEmpty();
    }
    @Transactional
    @Test
    public void testGetPatinetsWithNumberOfVisits() {
        // given
        final short minVisits = 1;
        //when
        Collection<PatientEntity> patients = patientDao.getPatinetsWithNumberOfVisits(String.valueOf(minVisits));
        //then
        assertThat(patients).isNotNull();
        assertThat(patients).isNotEmpty();
        for (PatientEntity patient: patients) {
            assertTrue(patient.getDoneVisits().size() >= minVisits,"Patient " + patient.getFirstName() + " " + patient.getLastName() + " has fewer than " + minVisits + " visits.");}
    }
    @Transactional
    @Test
    public void testPatientGender(){
        //given
        final String partialGender = "M";
        //when
        Collection<PatientEntity> patients = patientDao.getPatientGender(partialGender);
        //then
        assertThat(patients).isNotNull();
        assertThat(patients).isNotEmpty();
        for (PatientEntity patient : patients) {
            assertTrue(String.valueOf(patient.getGenderAsString()).contains(partialGender),
                    "Patient " + patient.getFirstName() + " " + patient.getLastName() + " does not match gender fragment.");
        }
    }


}
