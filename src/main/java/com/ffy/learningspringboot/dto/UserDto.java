package com.ffy.learningspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

  private String name;

  private Integer age;
}
