/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import bean.CompteComptable;
import bean.OperationComptable;
import bean.Societe;
import bean.TypeOperationComptable;
import java.util.ArrayList;
import service.OperationComptableService;

/**
 *
 * @author hp
 */
public class OperationComptableTest {

    private OperationComptableService operationcomptableservice = new OperationComptableService();
    private ArrayList<OperationComptable> operations = new ArrayList<>();
    private ArrayList<Societe> societe = new ArrayList<>();

    public void init() {
        CompteComptable compte1 = new CompteComptable((long) 1, "Achat de marchandises", "6111", "COMPTES DE CHARGES");
        CompteComptable compte2 = new CompteComptable((long) 2, "Intérets des emprunts et dettes", "6311", "COMPTE DE CHARGE");
        CompteComptable compte3 = new CompteComptable((long) 3, "Vente de marchandises", "7111", "COMPTE De Produit");

        Societe societe1 = new Societe(1L, "ice1", "rs1");
        Societe societe2 = new Societe(2L, "ice2", "rs2");
        Societe societe3 = new Societe(3L, "ice3", "rs3");

        operations.add(new OperationComptable((long) 1, "libelle1", 10000D, TypeOperationComptable.CREDIT, compte1, societe1));
        operations.add(new OperationComptable((long) 2, "libelle2", 14000D, TypeOperationComptable.DEBIT, compte2, societe2));
        operations.add(new OperationComptable((long) 3, "libelle3", 10006D, TypeOperationComptable.CREDIT, compte3, societe3));

    }

    public void findByIdtest() {
        OperationComptable res = operationcomptableservice.findById(operations, 1L);
        System.out.println("res=" + res);

    }

    public void findByDebitertest() {
        ArrayList<OperationComptable> res1 = operationcomptableservice.findByDebiter(operations);
        System.out.println("res1" + res1);
    }

    public void findbycredittest() {
        ArrayList<OperationComptable> res2 = operationcomptableservice.findByCredit(operations);
        System.out.println("res2" + res2);

    }

    public void findByCompteCodetest() {
        String code = "EE1";
        ArrayList<OperationComptable> res3 = operationcomptableservice.findByCompteCode(operations, code);
        System.out.println("res3" + res3);
    }

    public void debitertest() {
        OperationComptable operationComptable = operations.get(0);
        int d = operationcomptableservice.debiter(operationComptable, operations);
        System.out.println("d" + d);

    }

    public void creditertest() {
        OperationComptable operationComptable = operations.get(1);
        int c = operationcomptableservice.crediter(operationComptable, operations);
        System.out.println("c" + c);
    }

    public static void main(String[] args) {
        OperationComptableTest oct = new OperationComptableTest();
        oct.creditertest();
        oct.findByCompteCodetest();
        oct.findByDebitertest();
        oct.findbycredittest();
        oct.debitertest();
        oct.init();
    }

}
