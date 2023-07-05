package com.sadeghesfahani.sina.vote.question.entity.entity;

import com.sadeghesfahani.sina.vote.shared_library.entity.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class Question extends BaseEntity<Long> {

    String question;

    @OneToMany
    List<Answers> answers;


}
