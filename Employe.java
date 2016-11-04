import java.util.*;
public class Employe {
	Scanner key=new Scanner(System.in);
			protected String nom;
			protected String fonction;
			protected double salaire;
			
			public Employe(){
				this.nom="Inconnu";
				this.fonction="Inconnu";
				this.salaire=0;
			}
			
			public void jeSuis(){
				System.out.println("Donner le nom de l'employer");
				this.nom=key.nextLine();
				System.out.println("Donner la fonction de l'employer");
				this.fonction=key.nextLine();
				System.out.println("Donner le Montant de l'employer");
				this.salaire=key.nextDouble();
				
			}
			//*********Getters***********
			public String getNom(){
				return nom;
			}
			
			public String getFonction(){
				return fonction;
			}
			
			public double getSalaire(){
				return salaire;
			}
			//********Setters************
			public void setNom(String nom){
				this.nom=nom;
			}
			
			public void setFonction(String fonction){
				this.fonction=fonction;
			}
			
			public void setSalaire(double salaire){
				this.salaire=salaire;
			}
			
			public String ChequePaie(){
				return "Payer a l'ordre de "+this.getNom()+" ("+this.getFonction()+") ***"+this.getSalaire()+" DA //Employe";
			}
			
			
			
}
