package ru.netology.javaqa.Homework11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void newFilmTest() {

        FilmManager manager = new FilmManager();

        String[] expected = {};

        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");

        String[] expected = {"Film 1"};

        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilms() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};

        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsNewLimit() {

        FilmManager manager = new FilmManager(7);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7"};

        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilm() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1",};

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmLowerLimit() {

        FilmManager manager = new FilmManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1",};

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
