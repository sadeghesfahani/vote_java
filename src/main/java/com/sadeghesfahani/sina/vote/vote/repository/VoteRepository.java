package com.sadeghesfahani.sina.vote.vote.repository;

import com.sadeghesfahani.sina.vote.vote.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
