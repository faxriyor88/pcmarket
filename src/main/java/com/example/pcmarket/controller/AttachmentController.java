package com.example.pcmarket.controller;

import com.example.pcmarket.service.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;


    @GetMapping("/attachment/{id}")
    public void getAttachment(@PathVariable Integer id, HttpServletResponse response) throws IOException {
        attachmentService.getDbId(id,response);
    }
    @PostMapping("/attachment")
    public ResponseEntity<String> insert(MultipartHttpServletRequest request){
        String s = attachmentService.uploadDb(request);
        return ResponseEntity.status(200).body(s);
    }

    @DeleteMapping("/attachment/{id}")
    public ResponseEntity<String> delete(Integer id){
        String s = attachmentService.deleteAttachment(id);
        if (s.contains("O'chirildi")) {
            return ResponseEntity.status(200).body(s);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(s);
        }
    }
}
