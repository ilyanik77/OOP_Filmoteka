package model;

import view.InputData;

public class Movie {
    private String name;
    private String yearRelease;
    private Double priceFilm;
    
    public Movie(String name, String yearRelease, Double priceFilm) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.priceFilm = priceFilm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(String yearRelease) {
        this.yearRelease = yearRelease;
    }

    public Double getPriceFilm() {
        return priceFilm;
    }

    public void setPriceFilm(Double priceFilm) {
        this.priceFilm = priceFilm;
    }

    public String toString() {
        return "Название фильма :" + name + "; Год релиза :" + yearRelease + "; Цена фильма :" + priceFilm + "\n";

    }

    public static Movie getNewMovie() {

        String name =  new InputData().inputFilmName();
        String yearRelease =  new InputData().inputYearRelease();
        Double priceFilm = new InputData().inputPriceFilm();
        
        return new Movie(name, yearRelease, priceFilm);

    }
    
}
