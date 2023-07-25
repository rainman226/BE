package com.group.controllers;

import com.group.entities.Session;
import com.group.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/session")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @PostMapping(value = "/newSession")
    public ResponseEntity<Session> addSession(@RequestBody Session session){
        Session result = sessionService.addSession(session);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @GetMapping(value = "/allSession")
    public List<Session> getAllSessions(){
        return sessionService.getAllSessions();
    }
}