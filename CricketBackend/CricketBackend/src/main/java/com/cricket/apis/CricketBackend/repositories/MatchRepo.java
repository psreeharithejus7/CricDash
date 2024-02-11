package com.cricket.apis.CricketBackend.repositories;

import com.cricket.apis.CricketBackend.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {

    //Fetching match
    //provide --> teamHeading
    Optional<Match> findByTeamHeading(String teamHeading);
}
