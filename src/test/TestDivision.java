package test;
import classes.division;

public class TestDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division test1 = new division();
		division test2 = new division(1, "Les pompiers");
		
		System.out.println(test1.getCodeDivision());
		test1.setLibelle("La classe de débile");
		System.out.println(test1.getLibelle());
		
		System.out.println(test2.toString());
	}
}
