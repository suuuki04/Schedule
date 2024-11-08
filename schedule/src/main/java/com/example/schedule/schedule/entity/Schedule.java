package com.example.schedule.schedule.entity;

import lombok.Data;

@Data
public class Schedule {
    Integer id;
    String username;
    String password;
    String title;
    String content;
    Integer createAt;
    Integer updateAt;
}
