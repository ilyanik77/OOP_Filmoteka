package model;

import view.InputData;

public class Movie {
    public String name;
    public String yearRelease;
    public Double priceFilm;
    
    public Movie(String name, String yearRelease, double d) {
        this.name = name;
        this.yearRelease = yearRelease;
        this.priceFilm = d;
    }

    public Movie() {
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
        return  name + ";" + yearRelease + ";" + priceFilm + "\n";

    }

    public static Movie getNewMovie() {

        String name =  new InputData().inputFilmName();
        String yearRelease =  new InputData().inputYearRelease();
        Double priceFilm = new InputData().inputPriceFilm();
        
        return new Movie(name, yearRelease, priceFilm);

    }
    
}
