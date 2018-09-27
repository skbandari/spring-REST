package controller;

import dao.TeamDao;
import model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/")
public class TeamController {

        @Autowired
        private TeamDao teamDao;


        @RequestMapping(value = "/teams",method = RequestMethod.GET)
        public List<Team> getAllTeams() {
            List<Team> teams = teamDao.getAll();
            return teams;
        }

        @RequestMapping(value = "/teams/{id}", method = RequestMethod.GET)
        public Team getTeambyId(@PathVariable  int id) {
            Team team = teamDao.getTeambyId(id);
            return team;
        }
    }

