package com.Final.May.repository;

import org.springframework.data.repository.CrudRepository;

import com.Final.May.model.W_User;

public interface UserBaseRepository <T extends W_User> extends CrudRepository <T, Long> {

}
