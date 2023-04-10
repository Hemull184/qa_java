package ru.yandex.praktikum;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Feline realFeline = new Feline();
    Lion lionMale = new Lion("Самец", realFeline);
    Lion lionFemale = new Lion("Самка", realFeline);

    public LionTest() throws Exception {
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void test() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void getKittensForMaleLionTest() {
        int actual = lionMale.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensForFemaleLionTest() {
        int actual = lionFemale.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }
}