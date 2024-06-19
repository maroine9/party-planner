package com.example.party_planner.repository;

import com.example.party_planner.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    // Custom query methods can be added here
}
