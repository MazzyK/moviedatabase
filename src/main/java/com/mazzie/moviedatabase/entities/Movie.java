package com.mazzie.moviedatabase.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="movieID")
    private Integer movieID;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="date")
    private Date date;

    @Column(name="likes")
    private Integer likes;

    @Column(name="hates")
    private Integer hates;


    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getHates() {
        return hates;
    }

    public void setHates(Integer hates) {
        this.hates = hates;
    }
}

