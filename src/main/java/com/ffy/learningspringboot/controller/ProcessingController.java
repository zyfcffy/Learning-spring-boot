package com.ffy.learningspringboot.controller;

import com.ffy.learningspringboot.dto.UserDto;
import com.ffy.learningspringboot.service.ProcessingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProcessingController {
  private final ProcessingService processingService;

  @PostMapping("/user")
  @ResponseStatus(HttpStatus.CREATED)
  public UserDto createUser(@RequestBody UserDto userDto) {
    processingService.process(userDto);
    return userDto;
  }
}
