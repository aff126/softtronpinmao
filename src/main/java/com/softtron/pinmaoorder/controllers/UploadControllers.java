package com.softtron.pinmaoorder.controllers;

import java.io.File;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.softtron.pinmaoorder.util.ExceptionUtil;
@RestController
public class UploadControllers extends CommonControllers{
	@RequestMapping(path = "uploadfile")
	public Map uploadfile(MultipartFile file) throws Exception {
		if(file==null) {
			throw ExceptionUtil.NOTFILEEXCEPTION;
		}
		String fileName =UUID.randomUUID().toString() + file.getOriginalFilename();
		File dest = new File(filePath + fileName);
		file.transferTo(dest);
		return resultMap;
	}
}
