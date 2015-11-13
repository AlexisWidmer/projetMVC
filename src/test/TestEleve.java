package test;
import classes.division;
import classes.eleve;

public class TestEleve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eleve test1 = new eleve();
		eleve test2 = new eleve(1, "Accuracy", "Les moches", "06/10/1996", new division());
		
		System.out.println(test1.getPrenom());
		test1.setDateNaiss("16/56/9458");
		System.out.println(test1.getDateNaiss());
		
		System.out.println(test2.toString());
	}

}
