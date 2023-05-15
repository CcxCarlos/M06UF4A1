package com.example.cursmvc.repository;


import com.example.cursmvc.model.Curs;
import com.example.cursmvc.model.Estudiant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class EstudiantRepository implements CrudRepository<Estudiant> {
    private List<Estudiant> students;
    private final String[] names = {"Juan", "María", "Pedro", "Luisa", "Carlos", "Ana"};
    private final String[] surnames = {"González", "Rodríguez", "López", "Martínez", "Pérez", "García"};
    private final int NUM_STUDENTS = names.length;
    private final Random rnd = new Random();
    private final List<Curs> courses = new CursRepository().findAll();
    private final int NUM_COURSES = courses.size();

    public EstudiantRepository() {
        students = new ArrayList<>();
        generateStudents();
    }

    private void generateStudents() {
        for (int i = 0; i < NUM_STUDENTS; i++) {
            students.add(new Estudiant(i, names[rnd.nextInt(NUM_STUDENTS)], surnames[rnd.nextInt(NUM_STUDENTS)],
                    courses.get(rnd.nextInt(NUM_COURSES))));
        }
    }

    @Override
    public List<Estudiant> findAll() {
        return students;
    }
    public List<Estudiant> getEstudiantsPerCurs(int cursId) {
        return filterStudentsByCurs(cursId);
    }

    private List<Estudiant> filterStudentsByCurs(int id){
        List<Estudiant> newListStudents = new ArrayList<>();

        for (Estudiant student : students) {
            if (student.getCurs().getCursId()==id) newListStudents.add(student);
        }
        return newListStudents;
    }
}