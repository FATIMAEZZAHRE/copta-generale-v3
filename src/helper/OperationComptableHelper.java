/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;
import bean.OperationComptable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
/**
 *
 * @author Dell
 */
public class OperationComptableHelper {
    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("id", "id"),
            new AbstractHelperItem("libelle", "libelle"),
            new AbstractHelperItem("montant", "montant"),
            new AbstractHelperItem("TypeOperationComptable", "TypeOperationComptable"),
            new AbstractHelperItem("TypeOperationCommerciale", "TypeOperationCommerciale"),
            new AbstractHelperItem("compteComptable", "compteComptable"),
            new AbstractHelperItem("Societe","Societe")
        };
    }

    public OperationComptableHelper(JTable jTable, List<OperationComptable> list) {
        super(titres, jTable, list);
    }

    public OperationComptableHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public OperationComptableHelper(JTable jtable) {
        super(titres, jtable);
    }

    public OperationComptableHelper(JTable jTable1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(ArrayList<OperationComptable> societeOperations) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void remove(OperationComptable selected) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
