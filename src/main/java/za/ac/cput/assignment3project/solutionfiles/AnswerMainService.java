/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3project.solutionfiles;



/**
 *
 * @author Ongezwa Gwaza 211272183
 */
public class AnswerMainService {

  
    
    public void runStart(){
       ReadAndSave mainClass = new ReadAndSave();
       mainClass.writeFiles();
       
    }

    public static void main(String[] args) {

        AnswerMainService answer = new AnswerMainService();       
        answer.runStart();
        
        

    }
}
