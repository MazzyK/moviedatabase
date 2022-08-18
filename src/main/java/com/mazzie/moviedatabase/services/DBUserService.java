package com.mazzie.moviedatabase.services;

import com.mazzie.moviedatabase.repositories.DBUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DBUserService {
    @Autowired
    private DBUserRepository dbuserRepository;
}
