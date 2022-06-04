package br.com.caiocv18.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        List list = new ArrayList<Student>();
        list.add(new Student(1L, "Caio", "caioviniciuscv18@gmail.com", LocalDate.of(2000, Month.APRIL,18),22));
        return list;
    }
}
