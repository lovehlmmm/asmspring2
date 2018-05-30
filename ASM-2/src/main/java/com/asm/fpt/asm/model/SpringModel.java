package com.asm.fpt.asm.model;

import com.asm.fpt.asm.entity.Attendance_Slots;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SpringModel extends PagingAndSortingRepository<Attendance_Slots, Integer> {


}
