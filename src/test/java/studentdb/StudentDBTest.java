package studentdb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void tobiasOut() {
        //given
        StudentDB testDB = new StudentDB();

        //when
        Student actual = testDB.getAllStudents()[0];

        //then
        assertEquals("tobias", actual.getName());
    }
}