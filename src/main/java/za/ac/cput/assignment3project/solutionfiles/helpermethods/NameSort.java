/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project.solutionfiles.helpermethods;

import java.util.Comparator;
import za.ac.cput.assignment3project.Supplier;

/**
 *
 * @author Ongezwa Gwaza 211272183
 */
public class NameSort implements Comparator<Supplier>{
    @Override
    public int compare(Supplier s1, Supplier s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}
    
