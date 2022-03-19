package co.edu.umanizales.students_room_api.service;

import co.edu.umanizales.students_room_api.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // Estereotipo de springboot
public class StudentService {
    private List<Student> students;

    public List<Student> getAllStudents()
    {
        students = new ArrayList<>();
        students.add(new Student("1002652860",
                "Sergio Bermudez",
                200000,
                'M',
                true,
                "3115284307"));
        students.add(new Student("1002652860",
                "Sergio Bermudez",
                200000,
                'M',
                true,
                "3115284307"));
        students.add(new Student("1002652860",
                "Sergio Bermudez",
                200090,
                'M',
                true,
                "3115284307"));

        return students;
    }
}
