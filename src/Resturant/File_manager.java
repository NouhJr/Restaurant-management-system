package Resturant;

import java.io.*;
/**
 *
 * @author a7med
 */
public class File_manager implements Serializable{
    String logFileName = "log.bin";
    public boolean write(String FilePath, Object data){
        try {
            System.out.print("\nwritting in ! \n" + FilePath);

            ObjectOutputStream writter = new ObjectOutputStream(new FileOutputStream(FilePath));

            writter.writeObject(data);

            System.out.println(" ... Done ! \n");
            writter.close();
            return true;

        } 
        catch (IOException e) {
            System.out.println("Can't write ...!\n" + e);
        }

        return false;
    }

    public Object read(String FilePath) {

        Object Result = null;

        try {
            System.out.println("Reading ! From " + FilePath);

            ObjectInputStream Reader = new ObjectInputStream(new FileInputStream(FilePath));

            Result = Reader.readObject();

        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return Result;

    }

}
