package com.workintech.S17Challenge.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class CourseException extends RuntimeException {
    public CourseException(String message) {
        super(message);
    }

}
