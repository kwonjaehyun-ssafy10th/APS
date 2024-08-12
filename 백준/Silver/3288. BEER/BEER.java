import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Character> dir = new ArrayList<>();
		dir.add('U');
		dir.add('L');
		dir.add('D');
		dir.add('R');
		int N = sc.nextInt();
		List<List<Beer>> beers = new ArrayList<>();
		for (int n = 0; n < N; n++) {
			List<Beer> row = new ArrayList<>();
			for (int c = 0; c < N - n; c++) {
				row.add(new Beer());
			}
			beers.add(row);
		}
		for (int r = 0; r < N; r++) {
			String s = sc.next();
			for (int c = 0; c < r + 1; c++) {
				beers.get(N - r - 1).get(c).dir = dir.indexOf(s.charAt(c));
			}
		}
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < N - r; c++) {
				Beer beer = beers.get(r).get(c);
				int cnt = beer.dir;
				for (int k = 0; k < cnt; k++) {
					System.out.println(String.format("%d %d", r + 1, c + 1));
					beer.turn1();
					if (r + 1 < N) {
						if (0 <= c - 1) beers.get(r + 1).get(c - 1).turn2();
						if (c < N - r - 1) beers.get(r + 1).get(c).turn2();
					}
				}
			}
		}
		
		sc.close();
	}

}

class Beer {
	Beer() {}
	int dir = 0;
	
	void turn1() {
		this.dir--;
		if (this.dir < 0) this.dir += 4;
	}
	
	void turn2() {
		this.dir = (this.dir + 1) % 4;
	}
	
}