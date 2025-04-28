package com.jpacourse.service.impl;


import com.jpacourse.dto.PatientTO;
import com.jpacourse.mapper.PatientMapper;
import com.jpacourse.persistance.dao.PatientDao;
import com.jpacourse.persistance.entity.PatientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class PatientServiceImpl implements PatientService{
    private final PatientDao patientDao;

    @Autowired
    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }
    @Override
    public PatientTO findById(final Long id){
        final PatientEntity entity = patientDao.findOne(id);
        final PatientTO patientTO = PatientMapper.mapToTO(entity);
        if (patientTO !=null)
        {
            patientTO.setDoneVisits(patientDao.getPatientVisits(id));
        }
        return patientTO;
    }
}
