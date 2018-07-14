import java.util.Scanner;
public class Alphabet {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char n1;
		n1=sc.next().charAt(0);
		if((n1>=97&&n1<=122)||(n1>=65&&n1<=97)){
			System.out.println("Alphabet");
		}
		else{
			System.out.println("no");
		}
	}

}
