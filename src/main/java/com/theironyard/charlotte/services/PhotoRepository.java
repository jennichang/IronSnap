package com.theironyard.charlotte.services;

import com.theironyard.charlotte.entities.Photo;
import com.theironyard.charlotte.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhotoRepository extends CrudRepository<Photo, Integer> {

    List<Photo> findByRecipient(User recipient);

    @Query("SELECT p FROM Photo p WHERE p.recipient = ?1 AND p.id = ?2")
    Photo findByRecipientPhoto(String recipient, Integer id); //can have customized queries.

    @Query("SELECT max(p.id) FROM Photo p WHERE p.recipient = ?1")
    Integer findByMaxId(String recipient); //can have customized queries.


}
