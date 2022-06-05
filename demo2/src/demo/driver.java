package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class driver {
	


	public static void main(String[] args) {
		
		Cylinder c = new Cylinder(32.5,5.6);
		double result = c.calcVolume();
		System.out.println(result);
		
		double[] arr = new double[20237];
		ArrayList<shape> li = new ArrayList<shape>();

		
		try {
			BufferedReader fin = new BufferedReader(new FileReader("res/polyfor1.txt"));
			String line = fin.readLine();
			

			StringTokenizer st = new StringTokenizer(line," ");
			while(st.hasMoreTokens()) {
				String tokenName = st.nextToken();
				if(tokenName.equals("Cylinder")) {
					Cylinder c1 = new Cylinder(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
					li.add((shape)c1);
				}
				else if(tokenName.equals("Cone")) {
					Cone c2 = new Cone(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
					li.add((shape)c2);
				}
				else if(tokenName.equals("SquarePrism")) {
					SquarePrism p1 = new SquarePrism(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
					li.add((shape)p1);
				}
				else if(tokenName.equals("OctagonalPrism")) {
					OctagonalPrism p2 = new OctagonalPrism(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
					li.add((shape)p2);
				}
				else if(tokenName.equals("PentagonalPrism")) {
					PentagonalPrism p3 = new PentagonalPrism(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
					li.add((shape)p3);
				}
				else if(tokenName.equals("TriangularPrism")) {
					TriangularPrism p4 = new TriangularPrism(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
					li.add((shape)p4);
				}
				else if(tokenName.equals("Pyramid")) {
					Pyramid p5 = new Pyramid(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
					li.add((shape)p5);
					
				}
				line = fin.readLine();
			}
			fin.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Hello");
		
		Iterator<shape> it = li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getHeight());
		}
		
	}

}
