package com.example.party_planner.service;

import com.example.party_planner.entity.Participant;
import com.example.party_planner.repository.ParticipantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ParticipantService {
    private final ParticipantRepository participantRepository;

    public Participant addParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    public List<Participant> findAllParticipants() {
        return participantRepository.findAll();
    }

    public void removeParticipant(Long id) {
        participantRepository.deleteById(id);
    }
}
