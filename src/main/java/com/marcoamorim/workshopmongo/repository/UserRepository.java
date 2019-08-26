package com.marcoamorim.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marcoamorim.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
