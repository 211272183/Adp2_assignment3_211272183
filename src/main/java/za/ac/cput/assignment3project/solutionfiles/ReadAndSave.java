/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project.solutionfiles;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import za.ac.cput.assignment3project.Customer;
import za.ac.cput.assignment3project.Supplier;

/**
 *
 * @author Ongezwa Gwaza 21127218
 */
public class ReadAndSave {

    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Supplier> suppliers = new ArrayList<>();
    List<Object> objectList = new ArrayList<>();

    //read inputFile
    public List<Object> getFileContents(String inputFile) {
        ObjectInputStream objectInputStream = null;
        List<Object> objects = new ArrayList();
        try {
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            objectInputStream = new ObjectInputStream(bufferedInputStream);
            while (true) {

                objects.add(objectInputStream.readObject());
            }

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException ioException) {
                System.out.println(ioException);
            }
        }

        return objects;

    }

    //store values
    public void saveToList(List<Object> objects) {
        objects.forEach(object -> {
            if (object instanceof Customer) {
                customers.add((Customer) object);
            } else {
                suppliers.add((Supplier) object);
            }
        });
    }

    public void readAndSave() {
        objectList = getFileContents("stakeholder.ser");
        saveToList(objectList);
    }

    public void writeFiles() {
        try {
            readAndSave();
            //print customers list to file
            CustomerService customerService = new CustomerService();
            ArrayList<Customer> customerList = customerService.sortCustomers(customers);
            customerService.writeToFile(customerList);

            SupplierService supplierService = new SupplierService();
            ArrayList<Supplier> supplierList = supplierService.sort(suppliers);
            supplierService.saveToTextFile(supplierList);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
