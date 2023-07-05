package com.sadeghesfahani.sina.vote.question.entity.repository;

import com.sadeghesfahani.sina.vote.question.entity.entity.Answers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answers, Integer> {

}
