package arithmeticCoding;

import java.util.Scanner;

public class driver {
	public static void main(String args[]) {
		String[] string1 = {"a","b","c","d"};
		System.out.println("�����뷢�͵����У�");
		Scanner scanner = new Scanner(System.in);
		String string2 = scanner.nextLine();
		String[] string3 = string2.split(" ");
		code code1 = new code();
		decode decode1 = new decode();
		double C = code1.coding(string3, string1);
	    String [] strings = decode1.decoding(C);
	    System.out.print("�������������Ϊ��");
	    for(int i = 0 ; i < strings.length ; i++){
	    	System.out.print(strings[i]+" ");
	    }
	}
}
