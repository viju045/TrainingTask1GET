package com.training.Training_Task_1_GET.service;

import com.training.Training_Task_1_GET.Record.PatientScanRecord;
import com.training.Training_Task_1_GET.model.PatientScan;
import com.training.Training_Task_1_GET.repository.PatientScanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientScanServiceImple implements PatientScanService{
    @Autowired
    private PatientScanRepository patientScanRepository;
    @Override
    public PatientScan savePatientScan(PatientScan patientScan)
    {
    return patientScanRepository.save(patientScan);// Adding record in table
    }

    @Override
    public List<PatientScan> fetchAllPatientScanEntity() {
        return patientScanRepository.findAll();// Fetch all column record.
    }

    @Override

    public Optional<PatientScan> findRequiredField(Integer pascnId) {

        return patientScanRepository.findById(pascnId);// Fetch All column record but only one row.
    }

    public List<PatientScanRecord> findRecordByPrimeryKey(Integer pascnId) {
        return patientScanRepository.findRecordByPrimeryKey(pascnId);// Fetch required column record but the condition is pascnRecordStatus='Approved'.
    }
}
