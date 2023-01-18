
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
                System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
                System.out.println("                                                                         ");
                System.out.println("        Press [1] to create new PSA birth certificate                    ");
                System.out.println("        Press [2] to view the new created PSA birth certificate          ");
                System.out.println("        Press [3] to show the list of existing PSA birth certificate     ");
                System.out.println("        Press [4] to delete the birth certificate                        ");
                System.out.println("        [0] === Back to the past module                                  ");
                System.out.println("                                                                         ");
                System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=++=+=+=+=+=+=");
                System.out.println("");
               
                System.out.print("Enter the selected number: ");
                ch = sc.nextLine();
                
                if(ch.equals("1")){
                    
                    over.show_Onego(); // create psa birth certificate
                
                }
                else if(ch.equals("2")){
                    
                   
                    over.getSearch();
                   
                    
                }
                else if(ch.equals("3")){
                   
                    over.getShowList();
                    
                }
                else if(ch.equals("0")){
                
                    break;
                
                }
                else{
                   
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("                    Invalid selection --- Try Again!!!                   ");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("");
                }
                
                
                      
            }while(ch!="0");
         
        }catch(Exception e){
              
                
            System.out.println("Message: " + e);
        }
    }
    
}
