import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("student.txt"); 
        if (file.delete()) { 
            System.out.println("Deleted Sccessfully: " + file.getName());
        } else {
            System.out.println("Error......");
        } 
    }
}