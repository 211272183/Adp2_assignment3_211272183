/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project.solutionfiles.helpermethods;

import java.util.Comparator;
import za.ac.cput.assignment3project.Customer;

/**
 *
 * @author Ongezwa Gwaza 21127218
 */
public class IdSort implements Comparator<Customer> 
{
    @Override
    public int compare(Customer customer1, Customer customer2) {
        return customer1.getStHolderId().compareTo(customer2.getStHolderId());
    }
}