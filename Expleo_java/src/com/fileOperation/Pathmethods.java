package com.fileOperation;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathmethods {
public static void main(String []args) {
	Path p1=Paths.get("D:\\SDE  MODULE 2\\Problem_solvind_8\\Saranya_Sorting_Selfpractice\\\\Saranya_Problem solving 8 Self Study.docx\\");
	Path normalizedPath=p1.normalize();
	Path p2=Paths.get("day1\\Introduction to Data Structures.pptx");
	System.out.println("nORMALIZED PATH: "+normalizedPath);
	Path subpath=p1.subpath(0, 2);
	System.out.println("SUBPATH: "+subpath);
	System.out.println("SUBPATH: "+p1.getFileName());
	System.out.println("SUBPATH: "+p1.getParent());
	System.out.println("SUBPATH: "+p1.getNameCount());
	System.out.println("SUBPATH: "+p1.getRoot());
	System.out.println("SUBPATH: "+p1.isAbsolute());
	System.out.println("SUBPATH: "+p2.toAbsolutePath());
	
	
	
}
}
