package com.sadeghesfahani.sina.vote.question.entity.entity;

import com.sadeghesfahani.sina.vote.shared_library.entity.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Answers extends BaseEntity<Integer> {

    String answer;

    @ManyToOne
    Question question;
}
