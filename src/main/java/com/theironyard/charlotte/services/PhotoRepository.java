package com.theironyard.charlotte.services;

import com.theironyard.charlotte.entities.Photo;
import com.theironyard.charlotte.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhotoRepository extends CrudRepository<Photo, Integer> {

    List<Photo> findByRecipient(User recipient);
    List<Photo> findBySender(User sender);

//    @Query("SELECT p FROM Photo p WHERE p.id = ?1")
//    Photo findByRecipientPhoto(int id);
//
//    @Query("SELECT max(p.id) FROM Photo p WHERE p.recipient = ?1")
//    int findMaxIdByRecipient(String recipient);


}
