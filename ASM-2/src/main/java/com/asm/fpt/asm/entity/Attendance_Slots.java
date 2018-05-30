package com.asm.fpt.asm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance_Slots {
    @Id
    private int id;
    private String classId;
    private int slotId;
    private String time;
    private String subjectId;
    private String dayCheck;
    private int statusCheck;

    public Attendance_Slots() {
    }

    public Attendance_Slots(int id, String classId, int slotId, String time, String subjectId, String dayCheck, int statusCheck) {
        this.id = id;
        this.classId = classId;
        this.slotId = slotId;
        this.time = time;
        this.subjectId = subjectId;
        this.dayCheck = dayCheck;
        this.statusCheck = statusCheck;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getDayCheck() {
        return dayCheck;
    }

    public void setDayCheck(String dayCheck) {
        this.dayCheck = dayCheck;
    }

    public int getStatusCheck() {
        return statusCheck;
    }

    public void setStatusCheck(int statusCheck) {
        this.statusCheck = statusCheck;
    }
}
