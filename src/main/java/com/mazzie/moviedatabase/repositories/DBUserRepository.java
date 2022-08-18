package com.mazzie.moviedatabase.repositories;

import com.mazzie.moviedatabase.entities.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBUserRepository extends JpaRepository<DBUser, Integer> {
}
