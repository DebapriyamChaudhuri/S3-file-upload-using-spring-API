package com.example.aws.service;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	String uploadFile(MultipartFile file);

}
