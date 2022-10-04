package studentdb;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void tobiasOut() {
        //given
        String name;
        //when
        String actual = StudentDB.test();
        //then
        assert name.equals("tobias");
    }

}