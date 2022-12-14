package ru.netology.qamid.javaQamid40Dz12;

public class FilmsManager {
    private String[] films = new String[0];
    private int limit;

    public FilmsManager() {
        this.limit = 10;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public String[] getFilms() {
        return films;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (limit <= films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}