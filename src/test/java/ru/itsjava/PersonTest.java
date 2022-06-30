package ru.itsjava;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("PersonTest должен:")
public class PersonTest {

    public static final String NAME = "Petr";
    public static final int AGE = 38;
    public static final int NEW_AGE = 44;

    @DisplayName("корректно создавать конструктор")
    @Test
    public void shouldHaveCorrectConstructor(){
        Person actualPerson = new Person("Petr", 38);

        assertAll("actualPerson", () -> assertEquals(NAME, actualPerson.getName()),
                                          () -> assertEquals(AGE, actualPerson.getAge()));
    }

    @DisplayName("корректно изменять возраст")
    @Test
    public void shouldHaveCorrectUpdatePerson(){
        Person actualPerson = new Person("Petr", 38);
        actualPerson.setAge(NEW_AGE);

        assertEquals(NEW_AGE, actualPerson.getAge());
    }

    @DisplayName("корректно применять метод birthday")
    @Test
    public void shouldHaveCorrectBirthday(){
        Person actualPerson = new Person("Petr", 38);

        actualPerson.birthday();

        assertEquals(AGE + 1, actualPerson.getAge());
    }

    @DisplayName("корректно применять метод takeBeer")
    @Test
    public void shouldHaveCorrectTakBeer(){
        Person actualPerson = new Person("Petr", 27);

//        if (actualPerson.getAge() >= 18){
//            assertEquals(true, actualPerson.takeBeer());
//        } else{
//            assertEquals(false, actualPerson.takeBeer());
//        }
        assertTrue(actualPerson.takeBeer());
    }
}
