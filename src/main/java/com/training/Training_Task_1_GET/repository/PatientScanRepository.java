package com.training.Training_Task_1_GET.repository;

import com.training.Training_Task_1_GET.Record.PatientScanRecord;
import com.training.Training_Task_1_GET.model.PatientScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientScanRepository extends JpaRepository<PatientScan, Integer> {

    @Query("SELECT new com.training.Training_Task_1_GET.Record.PatientScanRecord(p.pascnDocName, p.pascnTScore,p.pascnZScore,p.pascnBmdScore,p.pascnMachineName,p.pascnScanDate,p.pascnScanArea,p.pascnNotes)FROM PatientScan p where p.pascnRecordStatus='Approved'")
    List<PatientScanRecord> findRecordByPrimeryKey(Integer pascnId);
}
