package textExcel;
import java.util.Scanner;

// Anselme Sorin
// TextExel: Client Class
// -> Object: Superclass
// Where everything begins, the Client :o

public class TextExcel
{

	// main, where everything starts :o
	// Makes a new Spreadsheet, makes a Scanner and gives the empty grid, then asks for commands until quit is written
	public static void main(String[] args)
	{
	    Spreadsheet Spreadsheet = new Spreadsheet();
	    Scanner input = new Scanner(System.in);
	    System.out.println(Spreadsheet.getGridText());
	    
	    String command = input.nextLine();
	    while (!command.equalsIgnoreCase("quit")) {
	    	System.out.println(Spreadsheet.processCommand(command) + "\n");
	    	command = input.nextLine();
	    }
	    
	    System.out.println("You lost everything, noooo"); // That's sad
	    input.close();
	}
	
}
