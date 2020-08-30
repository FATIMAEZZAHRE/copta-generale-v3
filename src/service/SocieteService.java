/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Societe;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class SocieteService {

    public Societe findById(long id, ArrayList<Societe> societees) {
        for (int i = 0; i < societees.size(); i++) {
            Societe societe = societees.get(i);
            if (societe.getId() == id) {
                return societe;
            }

        }
        return null;
    }

    public int save(long id, String ice, String raisonSocial, ArrayList<Societe> societees) {
        if (findById(id, societees) != null) {
            return -1;
        } else {
            Societe societe1 = new Societe(id, ice, raisonSocial);
            societees.add(societe1);
            return 1;
        }
    }
}
