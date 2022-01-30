package com.hank.justdance.api.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Document(collection = "playlists")
public class Playlist {
    @Id
    private String id;
    private String name;
    private String user;
    private Date created;
    private List <Music> musics;
}
