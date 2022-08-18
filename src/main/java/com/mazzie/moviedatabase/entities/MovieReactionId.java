package com.mazzie.moviedatabase.entities;

import java.io.Serializable;

public class MovieReactionId implements Serializable {
    private Integer movieID;

    private Integer userID;

    // default constructor

    public MovieReactionId(Integer movieID, Integer userID) {
        this.movieID =  movieID;
        this.userID = userID;
    }

}