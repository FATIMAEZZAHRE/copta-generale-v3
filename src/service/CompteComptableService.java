package service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.CompteComptable;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class CompteComptableService {

    CompteComptable findByLibelle(String  libelle, ArrayList<CompteComptable> comptes) {
        for (int i = 0; i < comptes.size(); i++) {
            CompteComptable compte = comptes.get(i);
            if (compte.getLibelle().equals(libelle)) {
                return compte;
            }
        }
        return null;
    }


    public int add(CompteComptable compteComptable, ArrayList<CompteComptable> compteComptables) {
        if (findByLibelle(compteComptable.getLibelle(), compteComptables) != null) {
            return -1;
        } else {
            compteComptables.add(compteComptable);
            return 1;
        }

    }

}
