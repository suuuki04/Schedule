package com.example.schedule.schedule.controller;

import com.example.schedule.schedule.entity.Schedule;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ScheduleController {
    List<Schedule> scheduleList = new ArrayList<>();

    //전체 일정 조회
    @GetMapping("/schedules")
    public List<Schedule> readSchedules() {
        return scheduleList;
    }

    @GetMapping("/schedules/scheduled")
    public Schedule readSchedule(@PathVariable Integer scheduled) {
        return this.scheduleList.get(scheduled);
    }

    //일정 생성
    @PostMapping("/schedule")
    public Schedule addSchedule(@RequestBody Schedule schedule) {
        this.scheduleList.add(schedule);

        return schedule;
    }

    //제거 및 수정
    @PutMapping("/schedule/{scheduled}")
    public Schedule updateSchedule(@PathVariable Integer scheduled, @RequestBody Schedule title, @RequestBody schedule username) {
        this.scheduleList.remove(scheduled.intValue());
        this.scheduleList.add(scheduled, title, username);

        return this.scheduleList.get(scheduled.intValue());
    }



}
