package com.asm.fpt.asm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance_details {
    @Id
    private int id;
    private int slotId;
    private String studentId;
    private String dayCheck;
    private int timeCheck;

    public Attendance_details() {

    }

    public Attendance_details(int id, int slotId, String studentId, String dayCheck, int timeCheck) {
        this.id = id;
        this.slotId = slotId;
        this.studentId = studentId;
        this.dayCheck = dayCheck;
        this.timeCheck = timeCheck;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDayCheck() {
        return dayCheck;
    }

    public void setDayCheck(String dayCheck) {
        this.dayCheck = dayCheck;
    }

    public int getTimeCheck() {
        return timeCheck;
    }

    public void setTimeCheck(int timeCheck) {
        this.timeCheck = timeCheck;
    }
}

