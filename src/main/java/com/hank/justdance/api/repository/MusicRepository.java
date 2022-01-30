package com.hank.justdance.api.repository;

import com.hank.justdance.api.models.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MusicRepository extends MongoRepository<Music, String> {
    Page<Music> findByUser(String user);
}
