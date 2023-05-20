package model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMovies {

    private String name;
    public ArrayList<Movie> movies = new ArrayList<>();

    public ListMovies(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public String printListMovies() {
        StringBuilder sb = new StringBuilder();
        for (Movie movie : movies) {
            sb.append(movie).append("\n");
        }
        return sb.toString();
    }

    public void addMovieInList() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название фильма: ");
        String name = sc.nextLine();
        System.out.println("Введите год релиза: ");
        String yearRelease = sc.nextLine();
        
        System.out.println("Цена фильма: ");  
        Double priceFilm = Double.parseDouble(sc.nextLine());
        
        movies.add(new Movie(name, yearRelease, priceFilm));
        sc.close();
    }

    public void writeMoviesInFile() {
        
        File file = new File("dbMovies.txt");

        try (FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw))
        {
            for (Movie movie : movies) {
                bw.write(movie.toString());
                System.out.println("Запись завершена!");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
