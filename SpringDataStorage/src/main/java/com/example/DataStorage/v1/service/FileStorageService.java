package com.example.DataStorage.v1.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

import com.example.DataStorage.v1.model.FileDB;





public interface FileStorageService {
	FileDB store(MultipartFile file) throws IOException;
	
	FileDB getFile(String id);
	
	Stream<FileDB> getAllFiles();
}
