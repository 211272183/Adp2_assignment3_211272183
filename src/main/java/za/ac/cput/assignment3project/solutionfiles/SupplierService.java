/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project.solutionfiles;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import za.ac.cput.assignment3project.solutionfiles.helpermethods.NameSort;
import za.ac.cput.assignment3project.Supplier;

/**
 *
 * @author Ongezwa Gwaza 211272183
 */
public class SupplierService {
   
    //save on text file
    public void saveToTextFile(ArrayList<Supplier> suppliers) throws IOException{
            try {

            // open the file
            FileWriter fw = new FileWriter("supplierOutFile.txt", false);
            PrintWriter out = new PrintWriter(fw);

            String format = "%-5s %-20s %-10s %-10s";
            // heading
            out.println("================================== SUPPLIERS ==============================");
             out.println(String.format(format,"ID","Name", "Prod Type", "Description"));
            out.println("===========================================================================");
           for (Supplier sup: suppliers) {
              
                out.println(String.format(format,sup.getStHolderId(),sup.getName(), sup.getProductType(), sup.getProductDescription()));
        
           }

            out.println("\n");
           
            // Close the file.
            out.close();
 

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
      //sort suppliers 
    public ArrayList<Supplier> sort(ArrayList<Supplier> suppliers) {
        suppliers.sort(new NameSort());
        return suppliers;

    }

    
}
