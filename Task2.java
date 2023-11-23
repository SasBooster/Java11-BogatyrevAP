import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
      System.out.print("Введите имя: ");
	    String name = scan.nextLine();
	    if (name.equals("Vlad")){
	        System.out.println("Привет, " + name);
	    }
	    else{
	        System.out.println("Нет такого имени");
	    }
	}
}
