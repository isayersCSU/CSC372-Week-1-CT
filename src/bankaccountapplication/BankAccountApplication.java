package bankaccountapplication;

import java.awt.EventQueue;


public class BankAccountApplication {

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
        new EntryScreen().setVisible(true);
   });
        
    
    
}
}