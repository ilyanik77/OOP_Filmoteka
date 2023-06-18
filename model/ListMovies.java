package model;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import view.InputData;


public class ListMovies {

    private String name;
    private String filePath;

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ListMovies(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
    }
    
    public String getName(){
        return name;
    }

    public void writeMovieInFile() {

        Movie movie = Movie.getNewMovie();
        File file = new File(filePath);

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

    public void printDbMovies() throws IOException {

        File file = new File(filePath);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = null; 
            
        while ((line = br.readLine()) != null) {
            System.out.println(line);

        }
          
        br.close();
    }

    public void deleteMovieByName() {
        
        String name =  new InputData().inputFilmName();

        File file = new File(filePath);
        
        try {
            
            File tempFile = new File("temp.csv");
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                
                String[] x = line.split(";");
                if (!x[0].equals(name)) {

                    writer.write(line + "\r\n");

                }
                
            }
            System.out.println("Фильм удален.");
            
            reader.close();
            writer.close();

            file.delete();
            tempFile.renameTo(file);
        
        } catch (IOException e) {
        
            e.printStackTrace();
        }
        
        

        
    }
    
}
