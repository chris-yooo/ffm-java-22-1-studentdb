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


    public String randomStudent() {
        double randomNumber =  Math.random() * studentDB.length;
        int i = (int) randomNumber;
        return studentDB[i].toString();
    }
}
