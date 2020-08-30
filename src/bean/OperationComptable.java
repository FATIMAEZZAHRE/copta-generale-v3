/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author hp
 */
public class OperationComptable {

    private Long id;
    private String libelle;
    private Double montant;
    private TypeOperationComptable typeOperationComptble;
    private TypeOperationCommerciale typeOperationCommerciale;
    private CompteComptable compteCmptable;
    private Societe soiete;

    public OperationComptable() {

    }

    public OperationComptable(Long id, String libelle, Double montant, TypeOperationComptable typeOperationComptble, CompteComptable compteCmptable, Societe soiete) {
        this.id = id;
        this.libelle = libelle;
        this.montant = montant;
        this.typeOperationComptble = typeOperationComptble;
        this.compteCmptable = compteCmptable;
        this.soiete = soiete;

    }

    public TypeOperationCommerciale getTypeOperationCommerciale() {
        return typeOperationCommerciale;
    }

    public void setTypeOperationCommerciale(TypeOperationCommerciale typeOperationCommerciale) {
        this.typeOperationCommerciale = typeOperationCommerciale;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public TypeOperationComptable getTypeOperationComptble() {
        return typeOperationComptble;
    }

    public void setTypeOperationComptble(TypeOperationComptable typeOperationComptble) {
        this.typeOperationComptble = typeOperationComptble;
    }

    public CompteComptable getCompteCmptable() {
        return compteCmptable;
    }

    public void setCompteCmptable(CompteComptable compteCmptable) {
        this.compteCmptable = compteCmptable;
    }

    public Societe getSoiete() {
        return soiete;
    }

    public void setSoiete(Societe soiete) {
        this.soiete = soiete;
    }

    @Override
    public String toString() {
        return "OperationComptable{" + "id=" + id + ", libelle=" + libelle + ", montant=" + montant + ", soiete=" + soiete + '}';
    }

}
