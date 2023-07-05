package com.sadeghesfahani.sina.vote.vote.entity;

import com.sadeghesfahani.sina.vote.question.entity.entity.Answers;
import com.sadeghesfahani.sina.vote.question.entity.entity.Question;
import com.sadeghesfahani.sina.vote.shared_library.entity.entity.BaseEntity;
import com.sadeghesfahani.sina.vote.user.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Vote extends BaseEntity<Long> {

    @ManyToOne
    User user;

    @OneToOne
    Question question;

    @ManyToMany
    List<Answers> answers;

}
