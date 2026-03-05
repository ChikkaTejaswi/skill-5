package com.klu;

import org.springframework.stereotype.Component;

@Component
public class Course {

    private int id = 263;
    private String course = "Spring Core";
    private String dateOfCompletion = "13-04-2026";

    @Override
    public String toString() {
        return "Course [id=" + id +
               ", course=" + course +
               ", dateOfCompletion=" + dateOfCompletion + "]";
    }
}