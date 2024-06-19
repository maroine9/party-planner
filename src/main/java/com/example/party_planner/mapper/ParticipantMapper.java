package com.example.party_planner.mapper;

import com.example.party_planner.dto.ParticipantDto;
import com.example.party_planner.entity.Participant;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParticipantMapper {
    ParticipantDto toDto(Participant participant);
    Participant toEntity(ParticipantDto participantDto);
    List<ParticipantDto> toDtos(List<Participant> participants);
    List<Participant> toEntities(List<ParticipantDto> participantDtos);
}
