//import model.ListMovies;
//import model.ListUsers;
//import model.ListUsers;
import model.ListMovies;
import model.ListUsers;
//import model.Movie;
import model.User;


public class Main {
    
    public static void main(String[] args) {

        //ListMovies listMovies = new ListMovies("bbb");
        //Movie movie1 = new Movie("Aaaaa", "2000", 8.5);
        //Movie movie2 = new Movie("Bbbbb", "1995", 9.0);
        //listMovies.movies.add(movie1);
        //listMovies.movies.add(movie2);
        //listMovies.addMovieInList();
        //System.out.println(listMovies.printListMovies());
        //
        ListMovies listMovies = new ListMovies("Список фильмов");
        ListUsers listUsers = new ListUsers("Список пользователей");
        //User user1 = new User("Ilya", "admin", 100.2, 0);
        //User user2 = new User("Kolya", "user", 80.4, 0);
        //User user3 = new User("Petr", "user", 65.5, 0);
        //listUsers.users.add(user1);
        //listUsers.users.add(user2);
        //listUsers.users.add(user3);
        //System.out.println(listUsers.printListUsers());
        //listUsers.addUserInList(user1);
        //System.out.println(listUsers.printListUsers());
        //listUsers.writeListUsersToFile(users, "ListUsers.txt" );
    
        //listMovies.addMovieInList();
        //System.out.println(listMovies.printListMovies());
        //listUsers.addUserInList(User.getNewUser());
        //System.out.println(listUsers.printListUsers());
        //listUsers.writeUsersInFile();
        //System.out.println(listUsers.printListUsers());
        listMovies.writeMoviesInFile();
        
    }


    
}
