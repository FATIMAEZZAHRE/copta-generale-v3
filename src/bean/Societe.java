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
public class Societe {

    private long id;
    private String ice;
    private String raisonSocial; //LE NOM

    public Societe() {
    }

    public Societe(long id, String ice, String raisonSocial) {
        this.id = id;
        this.ice = ice;
        this.raisonSocial = raisonSocial;
    }

    @Override
    public String toString() {
        return "Societe{" + "id=" + id + ", ice=" + ice + ", raisonSocial=" + raisonSocial + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIce() {
        return ice;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

}
