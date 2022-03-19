package co.edu.umanizales.students_room_api.controller;

import co.edu.umanizales.students_room_api.model.Student;
import co.edu.umanizales.students_room_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }
}
