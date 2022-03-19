package co.edu.umanizales.students_room_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //Para crear getter and setter automaticamente
@AllArgsConstructor //para cada objeto creara una instancia, y va a exigir un atributo para cada objeto creado
public class Student {
    private String identification;
    private String name;
    private double salary;
    private char gender;
    private boolean job;
    private String phone;
    //Atributos de clase
    private static String UNIVERSITY;
}
