package com.sadeghesfahani.sina.vote.question.entity.services;

import com.sadeghesfahani.sina.vote.question.entity.repository.AnswerRepository;
import com.sadeghesfahani.sina.vote.question.entity.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;
    private final QuestionRepository questionRepository;

    public AnswerService(AnswerRepository answerRepository, QuestionRepository questionRepository) {

        this.answerRepository = answerRepository;
        this.questionRepository = questionRepository;
    }


}
