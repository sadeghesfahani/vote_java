package com.sadeghesfahani.sina.vote.user.entity;

import com.sadeghesfahani.sina.vote.shared_library.entity.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User extends BaseEntity<Long> {
    String username;
    String password;

}
