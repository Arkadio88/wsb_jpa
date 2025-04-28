package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.PatientEntity;
import com.jpacourse.persistance.entity.VisitEntity;

import java.util.Collection;


public interface PatientDao extends Dao<PatientEntity, Long>
{

    Collection<PatientEntity> getPatientByLastName(String lastName);

    Collection<PatientEntity> getPatinetsWithNumberOfVisits(String patientId);

    Collection<VisitEntity> getPatientVisits (long patientId);

}
