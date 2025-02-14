package com.fileOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SymbolicLinkCreation {
    public static void main(String[] args) {
        Path existingFilePath = Paths.get("D:\\sem 6 notes\\oose\\OOSE Book 5 Units.pdf");
        Path symbolicLinkPath = Paths.get("D:\\OOSE Book 5 Units.pdf");

        try {
            Files.createSymbolicLink(symbolicLinkPath, existingFilePath);
            System.out.println("Symbolic link created successfully!");
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        
         //   catch (IOException e) {
//            System.out.println("IOException: " + e.getMessage());
//        } catch (UnsupportedOperationException e) {
//            System.out.println("Symbolic Links are not supported: " + e.getMessage());
//        }
    }
}
