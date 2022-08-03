package ru.netology.qamid.javaQamid40Dz12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void shouldAdd() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public  void shouldShowAllFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.findAll();

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsIfAboveLimit() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] expected = {"film12", "film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsIfUnderLimit() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");


        String[] expected = {"film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsIfEqualsToLimit() {
        FilmsManager manager = new FilmsManager(12);

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] expected = {"film12", "film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}