package com.training.Training_Task_1_GET.controller;

import com.training.Training_Task_1_GET.Record.PatientScanRecord;
import com.training.Training_Task_1_GET.model.PatientScan;
import com.training.Training_Task_1_GET.service.PatientScanServiceImple;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patientScan")
public class PatientScanController {

    @Autowired
    PatientScanServiceImple patientScanServiceImple;

    @PostMapping("/add")// Save data.
    public PatientScan savePatientScan(@RequestBody PatientScan patientScan){
        System.out.println("Record added successfully");
        return patientScanServiceImple.savePatientScan(patientScan);
    }

    @GetMapping("/fetchAll")// Fetch record
    public List<PatientScan> fetchAllPatientScanEntity(){
        return patientScanServiceImple.fetchAllPatientScanEntity();
    }

    @GetMapping("/fetch/{id}")// Fetch All column record by specific id.
    public Optional<PatientScan> findRequiredField(@PathVariable("id") Integer pascnId){
        return patientScanServiceImple.findRequiredField(pascnId);
    }

    @GetMapping("/fetch/required") // Fetch those column record the column I want but the condition is pascnRecordStatus='Approved'.
    public List<PatientScanRecord> findRecordByPrimeryKey(@RequestParam Integer pascnId){//@RequestParam is for parameter pass.
        return patientScanServiceImple.findRecordByPrimeryKey(pascnId);
    }

}
