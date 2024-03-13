package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.Kinopoisk;
import static org.junit.jupiter.api.Assertions.*;
public class KinopoiskTest {
    @Test
    public void testFindAll() {
        Kinopoisk kinopoisk = new Kinopoisk();
        String movie1 = "Легенда 1";
        String movie2 = "Легенда 2";
        String movie3 = "Легенда 3";

        kinopoisk.add(movie1);
        kinopoisk.add(movie2);
        kinopoisk.add(movie3);
        String[] actual = kinopoisk.findAll();
        String[] expected = {movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLast1() {
        Kinopoisk kinopoisk = new Kinopoisk();
        String movie1 = "Легенда 1";
        String movie2 = "Легенда 2";
        String movie3 = "Легенда 3";

        kinopoisk.add(movie1);
        kinopoisk.add(movie2);
        kinopoisk.add(movie3);
        String[] actual = kinopoisk.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLast2() {
        Kinopoisk kinopoisk = new Kinopoisk(12);
        String movie1 = "Легенда 1";
        String movie2 = "Легенда 2";
        String movie3 = "Легенда 3";

        kinopoisk.add(movie1);
        kinopoisk.add(movie2);
        kinopoisk.add(movie3);
        String[] actual = kinopoisk.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLast3() {
        Kinopoisk kinopoisk = new Kinopoisk();
        String movie1 = "Легенда 1";
        String movie2 = "Легенда 2";
        String movie3 = "Легенда 3";
        String movie4 = "Легенда 4";
        String movie5 = "Легенда 5";
        String movie6 = "Легенда 6";
        String movie7 = "Легенда 7";


        kinopoisk.add(movie1);
        kinopoisk.add(movie2);
        kinopoisk.add(movie3);
        kinopoisk.add(movie4);
        kinopoisk.add(movie5);
        kinopoisk.add(movie6);
        kinopoisk.add(movie7);
        String[] actual = kinopoisk.findLast();
        String[] expected = {movie7, movie6, movie5,movie4, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLast4() {
        Kinopoisk kinopoisk = new Kinopoisk(6);
        String movie1 = "Легенда 1";
        String movie2 = "Легенда 2";
        String movie3 = "Легенда 3";
        String movie4 = "Легенда 4";
        String movie5 = "Легенда 5";
        String movie6 = "Легенда 6";
        String movie7 = "Легенда 7";


        kinopoisk.add(movie1);
        kinopoisk.add(movie2);
        kinopoisk.add(movie3);
        kinopoisk.add(movie4);
        kinopoisk.add(movie5);
        kinopoisk.add(movie6);
        kinopoisk.add(movie7);
        String[] actual = kinopoisk.findLast();
        String[] expected = {movie7, movie6, movie5,movie4, movie3,movie2};

        Assertions.assertArrayEquals(expected, actual);
    }

}