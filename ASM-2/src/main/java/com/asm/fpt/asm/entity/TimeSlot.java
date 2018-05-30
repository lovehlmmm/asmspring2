package com.asm.fpt.asm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TimeSlot {
    @Id
    private int slotId;
    private String time;

    public TimeSlot() {
    }

    public TimeSlot(int slotId, String time) {
        this.slotId = slotId;
        this.time = time;
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
}
