package com.scrum.team.repository;

import com.scrum.team.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
