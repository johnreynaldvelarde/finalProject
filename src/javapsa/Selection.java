
package javapsa;
import java.util.Scanner;
public class Selection {
    
    Scanner sc = new Scanner(System.in);
    Overall_Information over = new Overall_Information();
  
       
    
    public void selectMethod(){
        
        String ch;
        
        try{
            do{
                
                System.out.println("");
                System.out.println("\t===========================================================================\t");
                System.out.println("\t|                                                                         |\t");
                System.out.println("\t|        Press [1] to create new PSA birth certificate                    |\t");
                System.out.println("\t|        Press [2] to view the new created PSA birth certificate          |\t");
                System.out.println("\t|        Press [3] to show the list of existing PSA birth certificate     |\t");
                System.out.println("\t|        Press [4] to search a certain the birth certificate              |\t");
                System.out.println("\t|        Press [0] to exit the program                                    |\t");
                System.out.println("\t|                                                                         |\t");
                System.out.println("\t===========================================================================\t");
                System.out.println("");
                
                System.out.print("\tPress a number: ");
                ch = sc.nextLine();
                
                if(ch.equals("1")){
                    
                    over.show_Onego(); // create psa birth certificate
                
                }
                else if(ch.equals("2")){
                    
                   
                    over.getNew(); // show new created psa birth certificate
                   
                    
                }
                else if(ch.equals("3")){
                   
                    over.getShowList(); // show the list of psa birth certificate using hashmap
                    
                }
                else if (ch.equals("4")){
                    
                      over.getSearch(); // search a certain record the using for loop
                
                }
                else if(ch.equals("0")){
                    
                    System.out.println("");
                    System.out.println("\t        ~o~o~o~o~o Thank you for your time and cooperation ~o~o~o~o~o      \t");
                    break;
                
                }
                else{
                    
                    System.out.println("");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("\t|                    Invalid selection --- Try Again!!!                   |\t");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("");
                }
                
                
                      
            }while(ch!="0");
         
        }catch(Exception e){
              
                
            System.out.println("Message: " + e);
        }
    }
    
}
