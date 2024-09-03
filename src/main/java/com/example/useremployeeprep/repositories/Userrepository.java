package com.example.useremployeeprep.repositories;


import com.example.useremployeeprep.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User, Integer> {

}