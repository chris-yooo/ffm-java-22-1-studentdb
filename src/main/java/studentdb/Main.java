package studentdb;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        StudentDB studentDB = new StudentDB();

        System.out.println(studentDB.getAllStudents()[0]);
        System.out.println(studentDB.getAllStudents()[1]);

        System.out.println(studentDB);

        System.out.println(studentDB.randomStudent());
    }
}