package com.jpacourse.persistance.dao.impl;

import com.jpacourse.persistance.dao.PatientDao;
import com.jpacourse.persistance.entity.PatientEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
     public Collection<PatientEntity> getPatientByLastName(final String lastName) {
        return entityManager
                .createQuery("SELECT p FROM PatientEntity p WHERE p.lastName = :lastName", PatientEntity.class)
                .setParameter("lastName", lastName)
                .getResultList();
    }
    @Override
    public Collection<PatientEntity> getPatinetsWithNumberOfVisits(final String minVisits) {
        int minVisitCount = Integer.parseInt(minVisits);

        return entityManager
                .createQuery("SELECT p FROM PatientEntity p WHERE size(p.visits) >= :minVisits", PatientEntity.class)
                .setParameter("minVisits", minVisitCount)
                .getResultList();

    }

}