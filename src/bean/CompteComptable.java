/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Dell
 */
public class CompteComptable {
    private long id;
    private String libelle;
    private String code;
   private  String casseComptable;
   //14
   // 14, 16, 17
      
    public CompteComptable() {
    }

    public CompteComptable(long id, String libelle, String code, String casseComptable) {
        this.id = id;
        this.libelle = libelle;
        this.code = code;
        this.casseComptable = casseComptable;
    }

    
    public CompteComptable( String libelle, String ClasseComptable) {
        this.libelle = libelle;
        this.casseComptable = ClasseComptable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCasseComptable() {
        return casseComptable;
    }

    public void setCasseComptable(String casseComptable) {
        this.casseComptable = casseComptable;
    }

    @Override
    public String toString() {
        return "CompteComptable{" + "id=" + id + ", libelle=" + libelle + ", code=" + code + ", ClasseComptable=" + casseComptable + '}';
    }
    
    
}
