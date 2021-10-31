package com.arnowa.entities;

import org.springframework.data.mongodb.repository.MongoRepository;

//import com.arnowa.entities.User;

public interface UserRepo extends MongoRepository<User, String> {

	

}
