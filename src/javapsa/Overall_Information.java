
package javapsa;

import java.util.*;


public class Overall_Information {
    
    Scanner sc = new Scanner(System.in);
    Calendar calndr = Calendar.getInstance();
    Random id = new Random();
    Data d = new Data();
    HashMap<Integer,ArrayList> map = new  HashMap<Integer,ArrayList>();
    
    public void show_Onego(){
    
       generateID();
       getchildInfo();
   
    }
    
    // method generating the unique id
    public void generateID(){
       
       d.setNumber( id.nextInt(10000));
    }
   
    
     // asking user again to repeat again
     public void askUserAgain() {
        
        System.out.println("");
        System.out.println("\txoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxox\t");
        System.out.println("\t|           Press [1] to try again / Press any key to continue            |\t");
        System.out.println("\txoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxoxox\t");
        System.out.println("");

    }
     
     // show list of existing birth certificate
     public void getShowList(){
            
              System.out.println("");
              System.out.println("\t===========================================================================\t");
              System.out.println("\t             Registry No" + "        |      " + "     List Of Names        \t");
              System.out.println("\t===========================================================================\t");
              for(Integer key : map.keySet()){
              ArrayList value = map.get(key);
              System.out.println("\t               "+key + "             |       " + value.get(0)+", "+ value.get(1)+" "+ value.get(2)+"\t");
              
              
              }
              System.out.println("");
              System.out.println("\t===========================================================================\t");
              System.out.println("");
              System.out.println("");
    }
     
     
    // method putting all data in hashmap   
    public void getMap(){
    
       map.put(d.getNumber(), new ArrayList(Arrays.asList(d.getcLast(), d.getcName(), d.getcMiddle())));
    
    
    }
    
    // method to show the new created psa birth certificate
    
    public void getNew(){
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("\t=========================================================================\t");
         System.out.println("                          CERTIFICATE OF LIVE BIRTH                        \t");
         System.out.println("\t=========================================================================\t");
         System.out.println("\t Registry No: "+d.getNumber()                                             );
         System.out.println("\t=========================================================================\t");
         System.out.println("\t-------------------------------------------------------------------------\t");
         System.out.println("\t 1. CHILD NAME       (First)            (Middle)            (Last)       \t");
         System.out.println("\t-------------------------------------------------------------------------\t");
         System.out.println("\t                  "+d.getcName()+"           "+d.getcMiddle()+"              "+d.getcLast()   );
         System.out.println("\t--------------------------------------------------------------------------\t");
         System.out.println("\t 2. SEX " +d.getChildSex() +""                                  );
         System.out.println("\t--------------------------------------------------------------------------\t");
         System.out.println("\t 3. Day " +d.getDay()+d.getMonth()+d.getYear()+"                         ");
         System.out.println("\t=========================================================================");
    
    }
    
     // search a certain record  
     public void getSearch(){
        
        boolean found = false;
        System.out.println("");
        System.out.print("\tEnter the registry number: ");
        String search = sc.nextLine();
        
        int key = Integer.parseInt(search);
        
        ArrayList record = map.get(key);
        if(record!=null) {
            found = true;
            
            System.out.println("");
            System.out.println("\t    ~o~o~o~o~o Congratulations!! You're Record has been found ~o~o~o~o~o   \t");
            System.out.println("");
            System.out.println("="+"=================================================");
            System.out.println("|  \tFirst Name         :       " + record.get(1) + " \t |");
            System.out.println("|  \tMiddle Name        :       " + record.get(2) + "  \t |");
            System.out.println("|  \tLast Name          :       " + record.get(0) + " \t |");
            System.out.println("="+"=================================================");
        }
        else{
             System.out.println("");
             System.out.println("\t      ~o~o~o~o~o  Ooops!! The Record has not been found   ~o~o~o~o~o       \t");
             System.out.println("");
        }
        
    }
     
     
    public void getchildInfo(){
        
        int askUser = 0;
        String ch;
        char sex;
        
        System.out.println("");
        System.out.print("\tRegistry No: " + d.getNumber());
        System.out.println("");
        
        String answer01;
        
        // get the child name
        do {
           
            System.out.println("");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                             1. CHILD NAME                               |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
           
            System.out.print("\tEnter First Name: ");
            d.setcName(sc.nextLine());
            System.out.print("\tEnter Middle Name: ");
            d.setcMiddle(sc.nextLine());
            System.out.print("\tEnter Last Name: ");
            d.setcLast(sc.nextLine());
            
            //checks if the user tried to enter or space only
            if(d.getcName().isEmpty() || d.getcName().equals(" ") ||  d.getcLast().isEmpty() || d.getcLast().equals(" ")) 
            {
                System.out.println("");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("\t|       Please, don't input space or enter only in names... Thank you     |\t");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("");
                
                answer01 = "1";
                
            } else {
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
        } while (answer01.equals("1")); // propmts user again if the input is 1
         
        // child sex info
         do {
            try {
                System.out.println("");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                               2. SEX                                    |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("");
                System.out.println("\tPress [F] for Female, Press [M] for Male\t");
                System.out.println("");
                System.out.print("\tEnter Sex: ");
                sex = sc.next().charAt(0);
                // askUserAgain();
                // System.out.print("Enter: ");
                // askUser = s.nextInt();

                if( sex == 'M' || sex == 'm'){
                    
                    d.setChildSex("Male");
                   
                    askUser = 0;
                }
                else if(sex == 'f' || sex == 'F' ){
                    
                    d.setChildSex("Female");
                   
                    askUser = 0;
                    
                }
                else{
                    
                    System.out.println("");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("\t|                        Plss input [M] or [F] only                       |\t");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("");
                    askUser = 1;
                }
                
            } catch (InputMismatchException e) {
                
                System.out.println("");
                System.out.println("\t          ~o~o~o~o~o Invalid Input String... ~o~o~o~o~o     \t");
                System.out.println("");
                askUser = 1;
            }
        } while (askUser == 1);
        
        // chid birth date
        
                System.out.println("");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                          3. DATE OF BIRTH                               |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("");
                System.out.println("\t                  ~o~o~o~o~o Example: dd/mm/yyyy ~o~o~o~o~o                \t");
                System.out.println("");
        
                boolean inputValid = false;
                while (!inputValid) {
                try {
                        // enter day
                        System.out.print("\tEnter Day: ");
                        int inputDay = sc.nextInt();
                        d.setDay(inputDay);
                        sc.nextLine();
                        
                        if(inputDay < 31 && inputDay >= 1) {
                            calndr.set(Calendar.DAY_OF_MONTH, inputDay);
                            System.out.println("");
                            System.out.println("\t                    ~o~o~o~o~o Day has been set ~o~o~o~o~o                 \t");
                        }else{
                            System.out.println("");
                            System.out.println("\t   ~o~o~o~o~o Invalid Input. Day should be between 1 and 31. ~o~o~o~o~o    \t");
                            System.out.println("");
                            inputValid = false;
                            sc.nextLine();
                        }
                        
                        // enter month
                        System.out.println("");
                        System.out.print("\tEnter Month: "); 
                        int inputMonth = sc.nextInt();
                        d.setMonth(inputMonth); 
                        
                        if (inputMonth <= 12 && inputMonth >= 1) {
                            calndr.set(Calendar.MONTH, inputMonth - 1);
                            System.out.println("");
                            System.out.println("\t                    ~o~o~o~o~o Month has been set ~o~o~o~o~o               \t");
                        }else {
                            System.out.println("");
                            System.out.println("\t   ~o~o~o~o~o Invalid Input. Month should be between 1 and 12. ~o~o~o~o~o  \t");
                            System.out.println("");
                            inputValid = false;
                        }
                        
                         // enter year
                        System.out.println("");
                        System.out.print("\tEnter Year: ");
                        int inputYear = sc.nextInt();
                        d.setYear(inputYear);
                        
                        if(inputYear >= 0 && inputYear <= 9999) {
                            calndr.set(Calendar.YEAR, inputYear);
                            System.out.println("");
                            System.out.println("\t                    ~o~o~o~o~o Year has been set ~o~o~o~o~o                \t");
                        }else{
                            System.out.println("");
                            System.out.println("\t  ~o~o~o~o~o Invalid Input. Year should be between 0 and 9999. ~o~o~o~o~o  \t");
                            System.out.println("");
                            inputValid = false;
                        }

                    
                        inputValid = true;
                } catch (InputMismatchException e) {
                            System.out.println("");
                            System.out.println("\t     ~o~o~o~o~o Wrong input, please enter a valid number. ~o~o~o~o~o       \t");
                            System.out.println("");   
                            inputValid = false;
                            sc.nextLine();
                 }
             }
                
        // child place birth
        
        do {
            System.out.println("\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                          4. PLACE OF BIRTH                              |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            sc.nextLine();
            System.out.println("");
            System.out.print("\tEnter Name of Hospital/Clinic/Institution/House No. Street Barangay: ");
            d.setPlaceOfBirth(sc.nextLine());
           
            System.out.print("\tEnter City/Municipality: ");
            d.setChildcityMuni(sc.nextLine());
         
            System.out.print("\tEnter Province: ");
            d.setChildProvince(sc.nextLine());
           
            //checks if the user tried to enter or space only
            if ( d.getPlaceOfBirth().isEmpty() || d.getPlaceOfBirth().equals(" ") || d.getChildcityMuni().isEmpty() || d.getChildcityMuni().equals(" ")
                || d.getChildProvince().isEmpty() || d.getChildProvince().equals(" ")) 
            {
                System.out.println("");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("\t|      Please, don't input space or enter only in names... Thank you      |\t");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("");
                answer01 = "1";
                
            } else {
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
        } while(answer01.equals("1")); // propmts user again if the input is 1
        
        
        
        // child type of birth
        
        
        do{
             try {
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                         5. A. TYPE OF BIRTH                             |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.println("\t+-------------------------------------------------------------------------+\t");
                System.out.println("\t|                           [1] --> Single                                |\t");
                System.out.println("\t|                           [2] --> Twin                                  |\t");
                System.out.println("\t|                           [3] --> Triplet,etc                           |\t");
                System.out.println("\t+-------------------------------------------------------------------------+\t");
                 System.out.println("");
                System.out.print("\tPress a number: ");
                ch = sc.nextLine();

                if(ch.equalsIgnoreCase("1")){
                    
                    d.setTypeOfBirth("Single");
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                }
                else if(ch.equalsIgnoreCase("2")){
                    
                    d.setTypeOfBirth("Twin");
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                    
                }else if(ch.equalsIgnoreCase("3")){
                    
                    d.setTypeOfBirth("Triplet");
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                }
                else{
                    System.out.println("");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("\t|                   Plss only selected the avaiable number                |\t");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("");
                    answer01 = "1";
                }
                
              
                
            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("\t|                        Invalid Input Try Again!!!                       |\t");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("");
                answer01 = "1";
            }
             
        }while(answer01.equals("1"));
        
        
        // child if multiple birth
        
        do{
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                       B. IF MULTIPLE BIRTH, CHILD WAS                   |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.println("\t+-------------------------------------------------------------------------+\t");
                System.out.println("\t|                         [1] --> First                                   |\t");
                System.out.println("\t|                         [2] --> Second                                  |\t");
                System.out.println("\t|                         [3] --> Others, Specify                         |\t");
                System.out.println("\t                          [4] --> If not multiple birth                   |\t");
                System.out.println("\t+-------------------------------------------------------------------------+\t");
                System.out.println("");
                System.out.print("\tPress a number: ");
                ch = sc.nextLine();
                
                if(ch.equalsIgnoreCase("1")){
                    
                    d.setMultipleBirth("First");
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                }
                else if(ch.equalsIgnoreCase("2")){
                    
                    d.setMultipleBirth("Second");
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                    
                }else if(ch.equalsIgnoreCase("3")){
                    
                    System.out.print("\tSpecify: ");
                    d.setMultipleBirth(sc.nextLine());
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                }
                else if(ch.equalsIgnoreCase("4")){
                    
                    d.setMultipleBirth("Not multiple birth");
                    askUser = 0;
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                }
                else{
                    
                    System.out.println("");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("\t|                   Plss only selected the avaiable number                |\t");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("");
                    answer01 = "1";
                }
                
        }while(answer01.equals("1"));
        
        // child birth order
        
        do{
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                            C. BIRTH ORDER                               |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.println("\t+-------------------------------------------------------------------------+\t");
                System.out.println("\t|                         [1] --> First                                   |\t");
                System.out.println("\t|                         [2] --> Second                                  |\t");
                System.out.println("\t|                         [3] --> Third, etc                              |\t");
                System.out.println("\t                          [4] --> Others, Specify                         |\t");
                System.out.println("\t+-------------------------------------------------------------------------+\t");
                System.out.println("");
                System.out.print("\tPress a number: ");
                ch = sc.nextLine();
                
                if(ch.equalsIgnoreCase("1")){
                    
                     d.setBirthOrder("First");
                     answer01 = "0";
                     askUserAgain();
                     System.out.print("\tEnter: ");
                     answer01 = sc.nextLine();
                 
                }
                else if(ch.equalsIgnoreCase("2")){
                    
                     d.setBirthOrder("Second");
                     answer01 = "0";
                     askUserAgain();
                     System.out.print("\tEnter: ");
                     answer01 = sc.nextLine();
                
                }
                else if(ch.equalsIgnoreCase("3")){
                    
                     d.setBirthOrder("Third");
                     answer01 = "0";
                     askUserAgain();
                     System.out.print("\tEnter: ");
                     answer01 = sc.nextLine();
                
                }
                else if(ch.equalsIgnoreCase("4")){
                    
                     System.out.print("\tSpecify: ");
                     d.setBirthOrder(sc.nextLine());
                     answer01 = "0";
                     askUserAgain();
                     System.out.print("\tEnter: ");
                     answer01 = sc.nextLine();
                }
                else{
                    
                    System.out.println("");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("\t|                   Plss only selected the avaiable number                |\t");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("");
                    answer01 = "1";
                }
                
        
        }while(answer01.equals("1"));
        
        
        // child weight
       
       
        do{
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                           D. WEIGHT AT BIRTH                            |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.print("\tEnter Grams: ");
               
                try{
                      double weight = Double.parseDouble(sc.nextLine());
                      d.setBabyWeight(weight);
                      answer01 = "0";
                      askUserAgain();
                      System.out.print("\tEnter: ");
                      answer01 = sc.nextLine();
                      
                }catch(NumberFormatException e){
                    
                      System.out.println("");
                      System.out.println("\t---------------------------------------------------------------------------\t");
                      System.out.println("\t|               Please, wrong input, Try Again!!! ... Thank you           |\t");
                      System.out.println("\t---------------------------------------------------------------------------\t");
                      System.out.println("");
                      answer01 = "1";
                }
              
            
        }while(answer01.equals("1"));
        
        // === mother part ==
        
        // mother name info
        
        do{
            System.out.println("");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                            6. MOTHER NAME                               |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            
            System.out.print("\tEnter First Name: ");
            d.setmName(sc.nextLine());
            System.out.print("\tEnter Middle Name: ");
            d.setmMiddle(sc.nextLine());
            System.out.print("\tEnter Last Name: ");
            d.setmLast(sc.nextLine());
            
             //checks if the user tried to enter or space only
            if(d.getmName().isEmpty() || d.getmName().equals(" ") ||  d.getmLast().isEmpty() || d.getmLast().equals(" ")) 
            {
                System.out.println("");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("\t|       Please, don't input space or enter only in names... Thank you     |\t");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("");
                
                answer01 = "1";
                
            } else {
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
        
        }while(answer01.equals("1"));
        
        // mother citizenship
        
        // mother religion
        
        // mother A.total number of children  born alive
        
        // mother B. No of children still living including this birth
        
        // mother C. No of children born alive but are now dead
        
        // mother occupation
        
        // mother age
        
        // mother residence
        
        // === father part == 
        // father name info
        
        
        // == another info part ==
                
                
                
        
        
        
        
        
        
          // invoke this method to collect the data
         getMap();
          
    }
    
}
