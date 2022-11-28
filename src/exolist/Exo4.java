package exolist;

import java.util.ArrayList;
import java.util.List;

public class Exo4 {
	public static void main(String[] args) {
		List<String> languages = new ArrayList<String>();
		languages.add("PHP");
		languages.add("Java");
		languages.add("C++");
		languages.add("Python");
		String l = languages.get(2);
		
		System.out.println("Le troisième élément: "+ l);
	}

}
