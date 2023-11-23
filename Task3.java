import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Введите длинну массива: ");
	    int L = scan.nextInt();
	    System.out.println("Введите значения массива: ");
	    int[] task = new int [L];
	    for(int i = 0; i < L; i++){
	       task[i] = scan.nextInt();
	    }
	    System.out.print("Числа кратные трём: ");
	    for(int j = 0; j < L; j++){
	        if(task[j] % 3 == 0){
	            System.out.print(task[j] + " ");
	        }
	    }
	}
}
