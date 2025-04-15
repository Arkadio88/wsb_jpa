package com.jpacourse.mapper;

import com.jpacourse.dto.AddressTO;
import com.jpacourse.dto.PatientTO;
import com.jpacourse.persistance.entity.AddressEntity;
import com.jpacourse.persistance.entity.PatientEntity;

public final class PatientMapper
{

    public static PatientTO mapToTO(final PatientEntity patientEntity)
    {
        if (patientEntity== null)
        {
            return null;
        }
        final PatientTO patientTO = new PatientTO();
        patientTO.setPatientNumber(patientEntity.getPatientNumber());
        patientTO.setFirstName(patientEntity.getFirstName());
        patientTO.setLastName(patientEntity.getLastName());
        patientTO.setAddressTo(AddressMapper.mapToTO(patientEntity.getAddress()));
        patientTO.setTelephoneNumber(patientEntity.getTelephoneNumber());
        patientTO.setEmail(patientEntity.getEmail());
        patientTO.setDateOfBirth(patientEntity.getDateOfBirth());
        patientTO.setDoneVisits(patientEntity.getDoneVists());

        return patientTO;
    }
    }

