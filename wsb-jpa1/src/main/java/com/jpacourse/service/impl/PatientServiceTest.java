package com.jpacourse.service.impl;

import com.jpacourse.dto.PatientTO;
import com.jpacourse.persistance.dao.AddressDao;
import com.jpacourse.persistance.dao.PatientDao;
import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class PatientServiceTest {
    @Autowired
    private PatientServiceTest patientServiceTest;

    @Autowired
    private PatientDao patientDao;

    @Autowired
    private AddressDao addressDao;
    {};



    }