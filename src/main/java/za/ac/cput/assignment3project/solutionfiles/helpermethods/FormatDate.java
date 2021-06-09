/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project.solutionfiles.helpermethods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ongezwa Gwaza 21127218
 */
public class FormatDate {
    //format date
    public static String formatDate(String date) {

        DateTimeFormatter stringDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(date, stringDateFormatter);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDateString = localDate.format(formatter);

        return formattedDateString;
    }

    
}
