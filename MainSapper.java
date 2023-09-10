import java.util.Scanner;

public class MainSapper {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int len = 0, wid = 0;
		System.out.println("Please, enter field length: ");
		len = scan.nextInt();
		System.out.println("Please, enter field width: ");
		wid = scan.nextInt();
		
				
		int[][] field = new int[wid][len];

		// nested loop
		
		for(int j = 0; j < field.length; j++) {
			for(int i = 0; i < field[j].length; i++) {
				field[j][i] = (int)(Math.random()*2) ; // double [0,1) >=0 && <1
				System.out.print(field[j][i] + " ");
			}
			System.out.println();
		}
		int x = 0, y = 0, count = 0;
		while (count <3) {
			System.out.println("Please, enter x: (beginning with 0 and finishing " + (len-1) + ")");
			x = scan.nextInt();
			if (x>=len) {
				System.out.println("Please, enter x not more length");
				System.out.println("Please, enter x: ");
				x = scan.nextInt();
			}
			System.out.println("Please, enter y: (beginning with 0 and finishing " + (wid-1) + ")");
			y = scan.nextInt();
			if (y>=wid) {
				System.out.println("Please, enter y not more width");
				System.out.println("Please, enter y: ");
				y = scan.nextInt();
			}
			if(field[y][x]==1) {
				System.out.println("Boom!!!");
				break;
			}
			else {
				count ++;
				if(count<3)System.out.println("Go ahead!");
			}
		}
		if(count==3) System.out.println("You won!");
		scan.close();
	}

}




/*

x ->                i 0  1  2  3  4   0  1  2  3  4   0  1  2  3  4   0  1  2  3  4   0  1  2  3  4
y	0 1 1 0 1		{{0, 1, 1, 0, 1},{1, 0, 1, 0, 1},{0, 1, 1, 1, 0},{1, 0, 0, 1, 0},{0, 0, 1, 1, 0}}
|	1 0 1 0 1		j       0               1               2               3               4
	0 1 1 1 0		
	1 0 0 1 0		int[][] ar = [5][5]
	0 0 1 1 0
	
					{{'H','i'},{'h','e','l','l','o'},{'b','y,'e'}} = String[]
	
	* * * * *
	* * * * *
	* * * * * 
	* * * * *
	* * * * *



*/