
package javapsa;

import java.util.*;


public class Overall_Information {
    
    Scanner sc = new Scanner(System.in);
    Random id = new Random();
    Data d = new Data();
    HashMap<Integer,ArrayList> map = new  HashMap<Integer,ArrayList>();
    
    public void show_Onego(){
    
       generateID();
       getchildInfo();
   
    }
    
  
    // ako
    
    
    // method generating the unique id
    public void generateID(){
       
       d.setNumber( id.nextInt(10000));
    }
    
    public void getchildInfo(){
        
        System.out.println("");
        System.out.print("Registry No: " + d.getNumber());
        System.out.println("");
        
        String answer01;
        
        // get the child name
        do {
            System.out.println("");
            System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
            System.out.println("                           1. CHILD NAME                                 ");
            System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=++=+=+=+=+=+=");
            System.out.println("");
           
            System.out.print("Enter First Name: ");
            d.setcName(sc.nextLine());
            System.out.print("Enter Middle Name: ");
            d.setcMiddle(sc.nextLine());
            System.out.print("Enter Last Name: ");
            d.setcLast(sc.nextLine());
            
            //checks if the user tried to enter or space only
            if(d.getcName().isEmpty() || d.getcName().equals(" ") ||  d.getcLast().isEmpty() || d.getcLast().equals(" ")) 
            {
                System.out.println("");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("       Please, don't input space or enter only in names... Thank you     ");
                System.out.println("-------------------------------------------------------------------------");

                answer01 = "1";
                
            } else {
                askUserAgain();
                System.out.print("Enter: ");
                answer01 = sc.nextLine();
            }
        } while (answer01.equals("1")); // propmts user again if the input is 1
          
        
        
        
          // invoke this method to collect the data
         getMap();
          
    }
    
     // asking user again to repeat again
     public void askUserAgain() {
        
        System.out.println("");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("           Press [1] to try again \\nPress any key to continue           ");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=++=+=+=+=+=+=");
        System.out.println("");

    }
     
     // show list of existing birth certificate
     public void getShowList(){
         
              System.out.println("");
              System.out.println("=========================================================================");
              System.out.println("              Registry No                  List of Name                  ");
              System.out.println("=========================================================================");
              for(Integer key : map.keySet()){
              ArrayList value = map.get(key);
              System.out.println("                "+key + "                 " + value.get(0)+", "+ value.get(1)+" "+ value.get(2));
              }
              System.out.println("");
              System.out.println("=========================================================================");
              System.out.println("");
              System.out.println("");
    }
     
     
    // method putting all data in hashmap   
    public void getMap(){
    
       map.put(d.getNumber(), new ArrayList(Arrays.asList(d.getcLast(), d.getcName(), d.getcMiddle())));
    
    
    }
    
     // search a certain record  
     public void getSearch(){
        
        boolean found = false;
        System.out.print("Enter the registry number: ");
        String search = sc.nextLine();
        
        int key = Integer.parseInt(search);
        
        ArrayList record = map.get(key);
        if(record!=null) {
            found = true;
            System.out.println("Record found ");
            System.out.println("First Name " + record.get(1));
            System.out.println("Middle Name " + record.get(2));
            System.out.println("Last Name " + record.get(0));
        }
        else{
             System.out.println("Record not found.");
        }
        
    } 
    
}
