package enacapsulation;

import java.util.ArrayList;

public class Iteration {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("arati");
		names.add("santu");
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}

