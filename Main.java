import java.util.*;
public class Main {
		public static void main(String [] args){	
			Scanner key= new Scanner(System.in);
			int i;
			Employe A=new Employe();
			EmployePleinTemps B=new EmployePleinTemps();
			EmployeTempsPartiel C=new EmployeTempsPartiel();
			System.out.println("|*********Bienvenue dans la Gestion d'Employer de RABAH IMED*********| \n----------------------------------------------------------------------");
			System.out.println("Combiens d'Employer avez vous ?!");
			i=key.nextInt();
			for(int j=1;j<=i;j++){
								System.out.println("-------------------------------- \nChoisir le Genre d'employer :");
								System.out.println("1-Employer Simple \n2-Employer Plein Temps \n3-Employer Temps Partiel ");
								int choix =key.nextInt();
			switch(choix){
			
			case 1: System.out.println("--------------------------------");A.jeSuis();
			System.out.println(A.ChequePaie());
		    System.out.println("-------------------------------------------------");
		    break;
			case 2:System.out.println("--------------------------------"); B.jeSuis();
			System.out.println(B.ChequePaie());
			System.out.println("-------------------------------------------------");
			break;
			case 3: System.out.println("--------------------------------");C.jeSuis();
			System.out.println(C.ChequePaie());
			System.out.println("--------------------------------");break;
			default : System.out.println("Vueillez choisir l'un des Trois Mode d'Employer");
			choix = key.nextInt();
			}
			}
			System.out.println("END !");
		}
}
