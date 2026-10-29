package enacapsulation;

import java.util.ArrayList;
import java.util.Iterator;

public class HasnextDemo {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("arati");
		names.add("santu");
		
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		}

}
