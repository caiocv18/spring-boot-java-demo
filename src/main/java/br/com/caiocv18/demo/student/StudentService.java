package br.com.caiocv18.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        List list = new ArrayList<Student>();
        list.add(new Student(1L, "Caio", "caioviniciuscv18@gmail.com", LocalDate.of(2000, Month.APRIL,18),22));
        return list;
    }
}
