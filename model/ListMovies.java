package model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

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

    public void addMovieInList(Movie movie) {

        movies.add(movie); 

    }

    public void writeMoviesInFile() {

        Movie movie = Movie.getNewMovie();
        File file = new File("dbMovies.txt");

        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw))
        {
            
            bw.write(movie.toString());
            System.out.println("Запись завершена!");

                bw.close();
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
