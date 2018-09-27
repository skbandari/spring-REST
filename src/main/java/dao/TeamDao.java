package dao;

import model.Team;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class TeamDao {

    private List<Team> teams;

    public TeamDao() {
        teams = new ArrayList<>();
        teams.add(new Team("Dolphins", 2014));
        teams.add(new Team("Avengers", 2015));
        teams.add(new Team("Spartans", 2010));
        teams.add(new Team("Orion", 2017));
        teams.add(new Team("Genesis", 2016));
        teams.add(new Team("Falcons", 2009));

    }

    public List<Team> getAll() {
        return new ArrayList<>(teams);
    }

    public Team getTeambyId(int id) {
        return teams.get(id);
    }

    public void addTeam(String team, int yearEst){
        teams.add(new Team(team,yearEst));
    }

    public void addTeam(Team team){
        teams.add(team);
    }

}
