package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.PatientEntity;

import java.util.Collection;


public interface PatientDao extends Dao<PatientEntity, Long>
{

    Collection<PatientEntity> getPatientByLastName(String lastName);

    Collection<PatientEntity> getPatinetsWithNumberOfVisits(String patientId);
}
