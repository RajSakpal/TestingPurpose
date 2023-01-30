package com.example.DataStorage.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DataStorage.v1.model.FileDB;



public interface FileDBRepository extends JpaRepository<FileDB, String>{

}
