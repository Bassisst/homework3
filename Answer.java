package sample;

import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("input the height of the rectangle: ");
        int height = sc.nextInt();
        System.out.print("input the width of the rectangle: ");
        int width = sc.nextInt();
		
						             
        if (height > 0 && width > 0) {
            
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    
                    if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                
                System.out.println();
            }
        } 

	}

}
