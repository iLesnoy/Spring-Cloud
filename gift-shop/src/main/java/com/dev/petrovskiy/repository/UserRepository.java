package com.dev.petrovskiy.repository;

import com.dev.petrovskiy.repository.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

    public List<User>findBySurname(String surname);
    /*@Autowired
    private MongoTemplate mongoTemplate;

    public List<User>findAll(){
        return mongoTemplate.findAll(User.class);
    }*/

}
