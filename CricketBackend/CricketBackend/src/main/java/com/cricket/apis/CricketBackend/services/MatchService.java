package com.cricket.apis.CricketBackend.services;

import com.cricket.apis.CricketBackend.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    //get all matches
    List<Match> getAllMatches();
    //get live matches
    List<Match> getLiveMatches();
    //get cwc2023 point tables
    //List<Map<String,String>> getPointTable();
}
