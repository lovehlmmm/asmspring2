package com.asm.fpt.asm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student_Class {
    @Id
    private  int studentId;
    private String classId;
    private long createdTime;
    private int status;

     public Student_Class() {
     }

     public Student_Class(int studentId, String classId,   int status) {
         this.studentId = studentId;
         this.classId = classId;
         this.createdTime = System.currentTimeMillis();
         this.status = status;
     }

     public int getStudentId() {
         return studentId;
     }

     public void setStudentId(int studentId) {
         this.studentId = studentId;
     }

     public String getClassId() {
         return classId;
     }

     public void setClassId(String classId) {
         this.classId = classId;
     }

     public long getCreatedTime() {
         return createdTime;
     }

     public void setCreatedTime(long createdTime) {
         this.createdTime = createdTime;
     }

     public int getStatus() {
         return status;
     }

     public void setStatus(int status) {
         this.status = status;
     }
 }
