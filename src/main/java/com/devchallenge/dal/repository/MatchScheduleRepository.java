package com.devchallenge.dal.repository;

import com.devchallenge.dal.entity.MatchScheduleEntity;
import com.devchallenge.dal.entity.TournamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchScheduleRepository extends JpaRepository<MatchScheduleEntity, String> {
    Optional<MatchScheduleEntity> findByTournamentAndTeamAndOpponent(TournamentEntity tournamentEntity,
                                                                     String team, String opponent);
}
