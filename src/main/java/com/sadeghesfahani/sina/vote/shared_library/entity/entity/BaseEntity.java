package com.sadeghesfahani.sina.vote.shared_library.entity.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serializable;

@MappedSuperclass
@Getter
public class BaseEntity<ID extends Serializable> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    ID id;
}
