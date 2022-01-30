package com.hank.justdance.api.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@Document(collection = "musics")
public class Music {
    @Id
    private String id;
    private String title;
    private String author;
    private String genre;
    private Date publicationDate;
    private String difficulty;
}
