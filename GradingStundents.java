import java.util.*;
public class Grade {
	public static void main(String [] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the amount");
		int len= read.nextInt();
		ArrayList<Integer> G= new ArrayList<Integer>(len);
		System.out.println("Enter all of the grades");
		for(int i=0; i<len;i++) {
			int g= read.nextInt();
			G.add(g);
		}
		Iterator<Integer> it =G.iterator();
		int x=0;
		while ( G.size() > x) {
			if(G.get(x)>=33) {
				if(G.get(x)<38) {
					System.out.println(G.get(x));
				}
				else if(G.get(x)%5==4) {
					System.out.println(G.get(x)+1);
				}
				else if(G.get(x)%5==3) {
					System.out.println(G.get(x)+2);
				}
				else {
					System.out.println(G.get(x));
				}
			}
			else {
				it.next();
			}
			x++;
		}
	}

}
