package com.training.Training_Task_1_GET.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name= "patient_scans")
public class PatientScan {
    @Column(name ="pascn_id",precision = 8,nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pascnId;

    @Column(name = "pascn_est_id",precision = 8,nullable = false)
    private Integer pascnEstId;

    @Column(name = "pascn_sgr_id",precision = 10,nullable = false)
    private Integer pascnSgrId;

    @Column(name = "pascn_doc_name",length = 255)
    private String pascnDocName;

    @Column(name = "pascn_doc_path",length = 255)
    private String pascnDocPath;

    @Column(name = "pascn_t_score",length = 12)
    private String pascnTScore;

    @Column(name = "pascn_z_score",length = 12)
    private String pascnZScore;

    @Column(name = "pascn_bmd_score",length = 12)
    private String pascnBmdScore;

    @Column(name = "pascn_machine_name",length = 45)
    private String pascnMachineName;

    @Column(name = "pascn_record_status",nullable = false)
    private String pascnRecordStatus;

    @Column(name = "pascn_scan_date")
    private Date pascnScanDate;

    @Column(name = "pascn_scan_area",length = 255)
    private String pascnScanArea;

    @Column(name = "pascn_notes",length = 255)
    private String pascnNotes;

    public Integer getPascnId() {
        return pascnId;
    }

    public void setPascnId(Integer pascnId) {
        this.pascnId = pascnId;
    }

    public Integer getPascnEstId() {
        return pascnEstId;
    }

    public void setPascnEstId(Integer pascnEstId) {
        this.pascnEstId = pascnEstId;
    }

    public Integer getPascnSgrId() {
        return pascnSgrId;
    }

    public void setPascnSgrId(Integer pascnSgrId) {
        this.pascnSgrId = pascnSgrId;
    }

    public String getPascnDocName() {
        return pascnDocName;
    }

    public void setPascnDocName(String pascnDocName) {
        this.pascnDocName = pascnDocName;
    }

    public String getPascnDocPath() {
        return pascnDocPath;
    }

    public void setPascnDocPath(String pascnDocPath) {
        this.pascnDocPath = pascnDocPath;
    }

    public String getPascnTScore() {
        return pascnTScore;
    }

    public void setPascnTScore(String pascnTScore) {
        this.pascnTScore = pascnTScore;
    }

    public String getPascnZScore() {
        return pascnZScore;
    }

    public void setPascnZScore(String pascnZScore) {
        this.pascnZScore = pascnZScore;
    }

    public String getPascnBmdScore() {
        return pascnBmdScore;
    }

    public void setPascnBmdScore(String pascnBmdScore) {
        this.pascnBmdScore = pascnBmdScore;
    }

    public String getPascnMachineName() {
        return pascnMachineName;
    }

    public void setPascnMachineName(String pascnMachineName) {
        this.pascnMachineName = pascnMachineName;
    }

    public String getPascnRecordStatus() {
        return pascnRecordStatus;
    }

    public void setPascnRecordStatus(String pascnRecordStatus) {
        this.pascnRecordStatus = pascnRecordStatus;
    }

    public Date getPascnScanDate() {
        return pascnScanDate;
    }

    public void setPascnScanDate(Date pascnScanDate) {
        this.pascnScanDate = pascnScanDate;
    }

    public String getPascnScanArea() {
        return pascnScanArea;
    }

    public void setPascnScanArea(String pascnScanArea) {
        this.pascnScanArea = pascnScanArea;
    }

    public String getPascnNotes() {
        return pascnNotes;
    }

    public void setPascnNotes(String pascnNotes) {
        this.pascnNotes = pascnNotes;
    }
}
