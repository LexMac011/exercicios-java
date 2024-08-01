package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramElection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> candidates = new HashMap<>();
		
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
			
				
				if (candidates.containsKey(name)){
					int aux = candidates.get(name);
					candidates.put(name, count + aux);
				}
				else {
					candidates.put(name, count);
				}
				
				line = br.readLine();
			}
			for (String key : candidates.keySet()) {
				System.out.println(key +  ": " + candidates.get(key));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
