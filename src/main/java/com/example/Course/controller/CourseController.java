package com.example.Course.controller;

import com.example.Course.entity.Course;
import com.example.Course.repo.Courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bs")
public class CourseController {
    @Autowired
    private Courserepo courserepo;
    @PostMapping("/hd")
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
       Course course1= courserepo.save(course);
        return ResponseEntity.ok().body(course1);
    }
    @GetMapping("/h")
    public ResponseEntity<List<Course>> getCourse(){
      List <Course> course= courserepo.findAll();
        return ResponseEntity.ok().body(course);
    }
    @GetMapping("/hj")
    public ResponseEntity<Course> getCourse(@PathVariable Long id){
        Optional<Course> course=courserepo.findById(id);
        return ResponseEntity.ok().body(course.get());
    }
    @PutMapping("/ss")
    public ResponseEntity<Void> updateCourse(@RequestBody Course course){
        courserepo.save(course);
        return ResponseEntity.ok().build();
    }
    /*@PutMapping("/gh")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course){
        Course course1=courserepo.save(course);
        return ResponseEntity.ok().body(course1);
    }
    /*@DeleteMapping("/yh")
    public ResponseEntity<Boolean> deleteCourse(@PathVariable Long id){
         courserepo.deleteById(id);
        return ResponseEntity.ok().body(true);

    }*/
    @DeleteMapping("/")
    public ResponseEntity<Boolean> deleteCourse(@PathVariable Long id){
        courserepo.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
