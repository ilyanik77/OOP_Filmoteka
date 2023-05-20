package model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//import view.InputData;


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

    public void writeListUsersToFile(ArrayList<User> users, String fileName) throws IOException {

        FileWriter writer = new FileWriter("ListUsers.txt"); 
        for(User user : users) {
            writer.write(user + System.lineSeparator());
        }
        writer.close();
    }

    public void addUserInList() {

        Scanner sc = new Scanner(System.in);
        
        String name =  new InputData().inputName();

        System.out.println("Введите роль: ");
        String role = sc.nextLine();
        
        System.out.println("Кол-во фильмов: ");  
        Integer countFilms = Integer.parseInt(sc.nextLine());
        System.out.println("Ваш баланс: ");
        Double balance = Double.parseDouble(sc.nextLine());
        
        users.add(new User(name, role, balance, countFilms));
        sc.close();
    }

    public void writeUsersInFile() {
        
        File file = new File("dbUsers.txt");

        try (FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw))
        {
            for (User user : users) {
                bw.write(user.toString());
                System.out.println("Запись завершена!");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    



    

    

    

}
