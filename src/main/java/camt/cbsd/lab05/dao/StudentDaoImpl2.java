package camt.cbsd.lab05.dao;

import camt.cbsd.lab05.entity.Student;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Profile("secondDataSource")
@ConfigurationProperties(prefix = "server")
@Repository
public class StudentDaoImpl2 extends AbstractStudentDao implements StudentDao {
    @PostConstruct
    private void init(){
        imageBaseUrl = baseUrl+imageUrl;
        students = new ArrayList<>();

        Student student = new Student(5,"SE-005","Mitsuha","Miyamizu",2.15,imageBaseUrl+"mitsuha.gif",
                true,0,"The most beloved one");
        students.add(student);

        student = new Student(6,"SE-006","Prayuth","?????????",3.99,imageBaseUrl+"tu.jpg",
                false,15,"The great man ever!!!");
        students.add(student);

        student = new Student(7,"SE-007","Jurgen","LOLOLOL",2.15,imageBaseUrl+"Kloop.gif",
                true,2,"The man for the Kop!!!");
        students.add(student);
    }

}
