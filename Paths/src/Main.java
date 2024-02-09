import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {

        try {

//            Path fileToCreate = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Files.createFile(fileToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","dir4");
//            Files.createDirectory(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","dir5/dir6/dir7/dir8");
//            Files.createDirectories(dirToCreate);

//            Path fileTodelete = FileSystems.getDefault().getPath("Examples/dir1/file1copy.txt");
//            Files.delete(fileTodelete);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples","file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","file2.txt");
//            Files.move(fileToMove,destination);

//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples","dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples","dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

            Path filePath = FileSystems.getDefault().getPath("Examples","dir1/file1.txt");
            long size = Files.size(filePath);
            System.out.println(size);
            System.out.println(Files.getLastModifiedTime(filePath));


            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println(attrs.size());
            System.out.println(attrs.lastModifiedTime());
            System.out.println(attrs.creationTime());
            System.out.println(attrs.isDirectory());
            System.out.println(attrs.isRegularFile());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
////        Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//        Path filePath = Paths.get("./files/SubdirectoryFile.txt");
//        printFile(filePath);
//        filePath = Paths.get("C:\\Users\\sanskar\\Desktop\\Java\\OutThere.txt");
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".","files","..","files","SubdirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3 = FileSystems.getDefault().getPath("thisFileDoesntExist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("C:\\Users\\sanska\\Desktop\\Java\\OutThere.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        System.out.println("Exists = " + Files.exists(path2));
//        System.out.println("Exists = " + Files.exists(path4));
    }

    private static void printFile(Path path) {
        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}