package com.nathan.twitterclone.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tweet")
public class TweetsController {

    @PostMapping(path="/create")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public String createTweet(@RequestBody String sampleTweet) {
        return "Your Tweet was created";
    }
}
