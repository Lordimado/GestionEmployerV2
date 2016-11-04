import java.util.*;
public class EmployePleinTemps extends Employe {
	Scanner key=new Scanner(System.in);
	
					private double prime;
					private double SalaireParSemaine;
					
					/*---------------------------------Constructeur------------------------------------*/
					public EmployePleinTemps(){
						this.prime=0;
						this.SalaireParSemaine=0;
					}
					/*----------------------------------------------------------------------------------*/
					
					
					public double getPrime(){
						return prime;
					}
					
					public double getSalaireSemaine(){
						return SalaireParSemaine;
					}
					

					public double getSalairePS(){
						return super.salaire;
					}
					
					/*--------------------Setters----------------------------------------------------------*/
					
					public void setPrime(double prime){
						this.prime=prime;
					}
					
					public void setSalairePS(double SalaireParSemaine){
						this.SalaireParSemaine=SalaireParSemaine;
					}
					
					
					/*-----------------------------------------------------------------------------------*/
					
					public void jeSuis(){
						super.jeSuis();
						this.CalculeSalaire();
						
					}
					
					/*---------------------------------------------------------------------------------------*/
					
					public void CalculeSalaire(){
						System.out.println("Est ce que cette employer travail la nuit ou le week end ?(O/N)");
						char rep=key.nextLine().charAt(0) ;
						if(rep == 'O'){
							System.out.println("Donner la somme de la prime ajoutée a cette employer :");
							this.prime=key.nextDouble();
							super.salaire=this.getSalairePS()*4+this.getPrime();}else{
								super.salaire=this.getSalairePS()*4;
							}
							
							
							
					}
					
					/*------------------------------------------------------------------------------------------*/
					
					public String ChequePaie(){
					        return "Payer a l'ordre de "+this.getNom()+" ("+this.getFonction()+") ***"+this.getSalairePS()+" DA"+"// Employe Plein temps";
					}
}
