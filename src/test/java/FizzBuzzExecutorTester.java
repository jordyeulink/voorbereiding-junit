import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nl.han.ica.oose.dea.testedfizzbuzz.FizzBuzzExecutor;
import org.junit.jupiter.api.Assertions;


public class FizzBuzzExecutorTester {

    private FizzBuzzExecutor sut;
    @BeforeEach
    public void setup(){
        sut = new FizzBuzzExecutor();
    }

    @Test
    void executeWithValidIntTest(){
            var testValue = sut.execute(37);
            Assertions.assertEquals("37", testValue);
    }

    @Test
    void executeWithValidfizzTest(){
        var testValue = sut.execute(3);
        Assertions.assertEquals("fizz", testValue);
    }

    @Test
    void executeWithValidbuzzTest(){
        var testValue = sut.execute(5);
        Assertions.assertEquals("buzz", testValue);
    }

    @Test
    void executeWithValidfizzbuzzTest(){
        var testValue = sut.execute(45);
        Assertions.assertEquals("fizzbuzz", testValue);
    }
}
