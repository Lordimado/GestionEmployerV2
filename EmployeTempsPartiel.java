import java.util.*;
public class EmployeTempsPartiel extends Employe {
Scanner key=new Scanner(System.in);
			private int Heures;
			private double SalaireParHeures;
			
			public EmployeTempsPartiel(){
				this.Heures=0;
				this.SalaireParHeures=0;
			}
			public int getHeures(){
				return Heures;
			}
			public double getSalaireHeures(){
				return SalaireParHeures;
			}
			
			public double getSalairePH(){
				return super.salaire;
			}
			public void setHeures(int Heures){
				this.Heures=Heures;
			}
			public void setSalaireHeures(double SalaireParHeures){
				this.SalaireParHeures=SalaireParHeures;
			}
			
			public void jeSuis(){
				super.jeSuis();	
				this.CalculeSalaire();
			}
			
			public void CalculeSalaire(){
				System.out.println("Combiens d'Heures cette employer travail ?");
				this.Heures=key.nextInt();
				super.salaire=this.getSalairePH()*this.getHeures();
		     }
			
			public String ChequePaie(){
		        return "Payer a l'ordre de "+this.getNom()+" ("+this.getFonction()+") ***"+this.getSalairePH()+" DA"+"// Employe temps Partiel";
		}
	
}
