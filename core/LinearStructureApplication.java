package core;

import java.io.*;

public class LinearStructureApplication {
	public static void main(String[] args){
		LinearStructure database = new LinearStructureArray();

        try{
            readDatabaseFromFile(database, "data.txt");
        } catch (FileNotFoundException e) {
            System.err.println("File not found, exiting.");
            System.exit(1);
        }

        // print the database
		System.out.println(database.toString());
	}

	private static void readDatabaseFromFile(LinearStructure database, String file) throws FileNotFoundException{
        BufferedReader reader = new BufferedReader(new FileReader(file));

        // stream the file contents into a Consumer type method reference
        reader.lines().forEach(database::add);
    }
}
