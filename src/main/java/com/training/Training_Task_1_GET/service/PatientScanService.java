package com.training.Training_Task_1_GET.service;

import com.training.Training_Task_1_GET.Record.PatientScanRecord;
import com.training.Training_Task_1_GET.model.PatientScan;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PatientScanService {

    PatientScan savePatientScan(PatientScan patientScan);// Save Operation;
    List<PatientScan> fetchAllPatientScanEntity();// Get method for all column record.
    Optional<PatientScan> findRequiredField(Integer pascnId); // Get method for all column record but only one row at time.

/*
SELECT pascnScanDate, pascnScanArea, pascnTScore, pascnZScore, pascnBmdScore, pascnMachineName, pascnNotes
    FROM patient_scan
    WHERE pascnId = your_pascnId_value;
*/
/*SELECT pascnScanDate, pascnScanArea, pascnTScore, pascnZScore, pascnBmdScore, pascnMachineName, pascnNotes
    FROM patient_scan
    WHERE pascnId = your_pascnId_value
    AND pascnRecordStatus = 'approved';*/

}
