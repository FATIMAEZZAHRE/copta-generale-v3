/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.CompteComptable;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Dell
 */
public class CompteComptableHelper extends AbstractHelper<CompteComptable> {

    private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("id", "id"),
            new AbstractHelperItem("libelle", "libelle"),
            new AbstractHelperItem("code", "code"),
            new AbstractHelperItem("ClasseComptable", "ClasseComptable")
        };
    }

    public CompteComptableHelper(JTable jTable, List<CompteComptable> list) {
        super(titres, jTable, list);
    }

    public CompteComptableHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public CompteComptableHelper(JTable jtable) {
        super(titres, jtable);
    }
}
