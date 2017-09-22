package camt.cbsd.lab05.dao;

import camt.cbsd.lab05.entity.Student;

import java.util.List;

public class AbstractStudentDao implements StudentDao {
    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Student findById(long id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    List<Student> students;
    String baseUrl;
    String imageUrl;

    public void setBaseUrl(String baseUrl){
        this.baseUrl = baseUrl;

    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
    String imageBaseUrl;
}
