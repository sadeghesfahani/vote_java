package com.sadeghesfahani.sina.vote.question.entity.repository;

import com.sadeghesfahani.sina.vote.question.entity.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
