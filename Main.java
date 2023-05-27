
import model.ListMovies;
//import model.Movie;
//import model.User;
import java.io.IOException;

import model.ListUsers;


public class Main {
    
    public static void main(String[] args) throws IOException {

        //ListMovies listMovies = new ListMovies("bbb");
        //Movie movie1 = new Movie("Aaaaa", "2000", 8.5);
        //Movie movie2 = new Movie("Bbbbb", "1995", 9.0);
        //listMovies.movies.add(movie1);
        //listMovies.movies.add(movie2);
        //listMovies.addMovieInList();
        //System.out.println(listMovies.printListMovies());
        
        ListMovies listMovies = new ListMovies("Список фильмов", "dbMovies.csv");
        ListUsers listUsers = new ListUsers("Список пользователей", "dbUsers.csv");
        
    
        //listMovies.addMovieInList();
        //System.out.println(listMovies.printListMovies());
        //listUsers.addUserInList(User.getNewUser());
        //System.out.println(listUsers.printListUsers());
        //listUsers.writeUserInFile();
        //System.out.println(listUsers.printDbUsers());
        //listMovies.writeMovieInFile();
        listUsers.writeUserInFile();
        //listMovies.printDbMovies();
        listUsers.printDbUsers();
    
        //listMovies.deleteMovieByName();
        //listMovies.printDbMovies();
        //listUsers.deleteUserByName();
        //listUsers.printDbUsers();
        
        
    }


    
}
