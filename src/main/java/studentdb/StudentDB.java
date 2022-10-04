package studentdb;

import java.util.Arrays;

public class StudentDB {

    Student tobias = new Student("tobias", 1);
    Student chris = new Student("chris", 2);

    Student[] studentDB = new Student[] {
        tobias, chris
    };

    public Student[] getAllStudents() {
        return studentDB;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentDB=" + Arrays.toString(studentDB) +
                '}';
    }

    //leeres array
    //bauenen der studenten reinstopfen

    //oder direkt im array die stundenten stopfen

}
