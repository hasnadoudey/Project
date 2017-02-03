package tn.cni.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "etat", schema = "cniproject")
@Entity
public class Etat implements Serializable {

	
	private static final long serialVersionUID = 2084431399638991456L;
	
	private Integer id_etat;
	private String ref;
	private Double mnt_initial;
	private Double mnt_act;
	private Date dat_act;
	private Etat selectedEtat;
	
	private String operation;
	private String projetList;
	
	
	@Column(name="projet_id")
	private Long projetId;

	
	@ManyToOne
	@JoinColumn(name="projet_id",referencedColumnName="id",insertable=false,updatable=false)
	private Projet projet;
	
	
	
	
	
	
	
	
	public Etat() {
		
	}
	
	
	

	public Date getDat_act() {
		return dat_act;
	}


	public void setDat_act(Date dat_act) {
		this.dat_act = dat_act;
	}



	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Etat getSelectedEtat() {
		return selectedEtat;
	}
	public void setSelectedEtat(Etat selectedEtat) {
		this.selectedEtat = selectedEtat;
	}




	public Double getMnt_initial() {
		return mnt_initial;
	}




	public void setMnt_initial(Double mnt_initial) {
		this.mnt_initial = mnt_initial;
	}




	public Double getMnt_act() {
		return mnt_act;
	}




	public void setMnt_act(Double mnt_act) {
		this.mnt_act = mnt_act;
	}




	public void setOperation(String operation) {
		this.operation = operation;
	}




	public String getOperation() {
		return operation;
	}




	public void setProjetId(Long projetId) {
		this.projetId = projetId;
	}




	public Long getProjetId() {
		return projetId;
	}




	public void setProjet(Projet projet) {
		this.projet = projet;
	}




	public Projet getProjet() {
		return projet;
	}




	public void setId_etat(Integer id_etat) {
		this.id_etat = id_etat;
	}



	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
	 @Column(name="id")
	public Integer getId_etat() {
		return id_etat;
	}




	public void setProjetList(String projetList) {
		this.projetList = projetList;
	}




	public String getProjetList() {
		return projetList;
	}




	


	
	
}
