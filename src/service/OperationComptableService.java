package service;

import bean.OperationComptable;
import bean.TypeOperationComptable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class OperationComptableService {

    public ArrayList<OperationComptable> findByClasseComptable(String classeCompables, ArrayList<OperationComptable> operations) {
        return null; // TO DO: oumaima
    }

    public ArrayList<OperationComptable> findByCompteComptable(String classeCompables, ArrayList<OperationComptable> operations) {
        return null; // TO DO: oumaima
    }

    public OperationComptable findById(ArrayList<OperationComptable> operations, Long id) {
        for (int i = 0; i < operations.size(); i++) {
            OperationComptable o = operations.get(i);
            if (id.equals(o.getId())) {
                return o;
            }
        }
        return null;
    }

    private ArrayList<OperationComptable> findByType(TypeOperationComptable typeOperationComptable, ArrayList<OperationComptable> operations) {
        ArrayList<OperationComptable> operationDebit = new ArrayList<>();
        for (OperationComptable oc : operations) {
            if (oc.getTypeOperationComptble().equals(typeOperationComptable)) {
                operationDebit.add(oc);
            }
        }
        return operationDebit;
    }

    public ArrayList<OperationComptable> findByDebiter(ArrayList<OperationComptable> operations) {
        return findByType(TypeOperationComptable.DEBIT, operations);
    }

    public ArrayList<OperationComptable> findByCredit(ArrayList<OperationComptable> operations) {
        return findByType(TypeOperationComptable.CREDIT, operations);

    }

    public ArrayList<OperationComptable> findByCompteCode(ArrayList<OperationComptable> operations, String code) {
        ArrayList<OperationComptable> operationscompte = new ArrayList<>();
        for (OperationComptable oc : operations) {
            if (oc.getCompteCmptable().getCode().equals(code)) {
                operationscompte.add(oc);
            }
        }
        return operationscompte;
    }

    private int exec(OperationComptable operationcomptable, TypeOperationComptable typeOperationComptable, ArrayList<OperationComptable> operations) {
        OperationComptable loadedComptable = findById(operations, operationcomptable.getId());
        if (loadedComptable != null) {
            return -1;
        }
        operationcomptable.setTypeOperationComptble(typeOperationComptable);
        operations.add(operationcomptable);
        return 1;

    }

    public int debiter(OperationComptable operationcomptable, ArrayList<OperationComptable> operations) {
        return exec(operationcomptable, TypeOperationComptable.DEBIT, operations);
    }

    public int crediter(OperationComptable operationcomptable, ArrayList<OperationComptable> operations) {
        return exec(operationcomptable, TypeOperationComptable.CREDIT, operations);
    }

}
