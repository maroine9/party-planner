package com.example.party_planner.dto;

import lombok.Data;

@Data
public class ParticipantDto {
    private Long id;
    private UserDto user;
    private EventDto event;
}

