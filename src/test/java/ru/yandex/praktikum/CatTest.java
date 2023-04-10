package ru.yandex.praktikum;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Feline realFeline = new Feline();

    @Mock
    Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(realFeline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }
}