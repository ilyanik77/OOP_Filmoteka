package model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;




public class ListUsers {

    private String name;
    public ArrayList<User> users = new ArrayList<>();


    public ListUsers(String name) {
        this.name = name;
    } 

    public String getName() {
        return name;
    }

    public String printListUsers() {
        StringBuilder sb = new StringBuilder();
        for (User user : users) {
            sb.append(user).append("\n");
        }
        return sb.toString();
    }


    public void addUserInList(User user) {
        
        users.add(user);
        
    }

    public void writeUsersInFile() {

        User user = User.getNewUser();
        File file = new File("dbUsers.txt");

        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw))
        {
            
            bw.write(user.toString());
            System.out.println("Запись завершена!");

            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    



    

    

    

}
