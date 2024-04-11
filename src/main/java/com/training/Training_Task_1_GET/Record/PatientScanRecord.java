package com.training.Training_Task_1_GET.Record;

import com.training.Training_Task_1_GET.model.PatientScan;

import java.util.Date;

public record PatientScanRecord(String pascnDocName, String pascnTScore, String pascnZScore, String pascnBmdScore, String pascnMachineName,
                                Date pascnScanDate,String pascnScanArea,String pascnNotes) {
}
