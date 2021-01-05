package com.couseapi.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.couseapi.data.domain.FacebookUser;

public interface FacebookRepository extends CrudRepository<FacebookUser, String>{

}
