package ecole.suptech.entities;

public class Employe {
	
	Long id;
	String name;
	double salaire;
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employe(Long id, String name, double salaire) {
		super();
		this.id = id;
		this.name = name;
		this.salaire = salaire;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	

}
