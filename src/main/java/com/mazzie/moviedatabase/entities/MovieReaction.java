package com.mazzie.moviedatabase.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "moviereaction")
@IdClass(MovieReactionId.class)

public class MovieReaction {
    @Id
    @Column(name="movieID")
    private Integer movieID;

    @Id
    @Column(name="userID")
    private Integer userID;

    @Column(name="reaction")
    private Integer reaction;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="reactTimestamp")
    private Date reactTimestamp;

   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="movieID")
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userID")
    private MVUser user;*/

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getReaction() {
        return reaction;
    }

    public void setReaction(Integer reaction) {
        this.reaction = reaction;
    }

    public Date getReactTimestamp() {
        return reactTimestamp;
    }

    public void setReactTimestamp(Date reactTimestamp) {
        this.reactTimestamp = reactTimestamp;
    }
}

