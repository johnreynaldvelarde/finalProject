
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
        // System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t                         CERTIFICATE OF LIVE BIRTH                           \t");
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t Province: "+d.getFrontProvince() +"    \t\t\t  Registry No. "  + d.getNumber());
         System.out.println("\t City/Municipality: "+d.getFrontCityMuni()+"                                 \t");
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");                                                             
         System.out.println("\t  1. CHILD NAME       (First)            (Middle)            (Last)       \t");
         System.out.println("\t");
         System.out.println("\t                  "+d.getcName()+"           "+d.getcMiddle()+"              "+d.getcLast()   );
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");   
         System.out.println("\t  2. SEX: " +d.getChildSex() + "\t\t 3. DATE OF BIRTH\t(day)\t(month)\t(year)"    );
         System.out.println("\t");
         System.out.println("\t                                       \t"+"\t"+ d.getDay()+"\t"+ d.getMonth()+"\t"+ d.getYear());
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");   
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
                    System.out.println("\t|                   Plss only select the avaiable number                  |\t");
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
                    System.out.println("\t|                   Plss only select the avaiable number                  |\t");
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
                    System.out.println("\t|                   Plss only select the avaiable number                  |\t");
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
        
        do{
            System.out.println("");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                          7. CITIZENSHIP                                 |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            System.out.print("\tEnter Citizenship: ");
            d.setmCitizenship(sc.nextLine());
            
            if(d.getmCitizenship().isEmpty() || d.getmCitizenship().equals("")){
                
                System.out.println("");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("\t|       Please, don't input space or enter only in names... Thank you     |\t");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("");
                
                answer01 = "1";
            }
            else{
                
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
        
        }while(answer01.equals("1"));
        
        // mother religion
        
          
        do{
            System.out.println("");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                              8. RELIGION                                |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            System.out.print("\tEnter Religion: ");
            d.setmReligion(sc.nextLine());
            
            if(d.getmReligion().isEmpty() || d.getmReligion().equals("")){
                
                System.out.println("");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("\t|       Please, don't input space or enter only in names... Thank you     |\t");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("");
                
                answer01 = "1";
            }
            else{
                
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
        
        }while(answer01.equals("1"));
        
        // mother A.total number of children  born alive
        do{
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                 9. A TOTAL NUMBER OF CHILDREN BORN ALIVE                |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.print("\tEnter the total: ");
               
                try{
                      int alive = Integer.parseInt(sc.nextLine());
                      d.setAlive(alive);
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
        
        // mother B. No of children still living including this birth
        do{
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|           B.  NO OF CHILDREN STILL LIVING INCLUDING THIS BIRTH          |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.print("\tEnter the total: ");
               
                try{
                      int living = Integer.parseInt(sc.nextLine());
                      d.setLiving(living);
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
        
        // mother C. No of children born alive but are now dead
         do{
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|             C.  NO OF CHILDREN BORN ALIVE BUT ARE NOW DEAD              |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.print("\tEnter the total: ");
               
                try{
                      int dead = Integer.parseInt(sc.nextLine());
                      d.setDead(dead);
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
        
        // mother occupation
        do{
            System.out.println("");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                             10. OCCUPATION                              |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            System.out.print("\tEnter Occupation (Leave blank if none): ");
            d.setmOccupation(sc.nextLine());
            
            if(d.getmOccupation().isEmpty() || d.getmOccupation().equals("")){
                
                d.setmReligion("None");
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
            else{
                
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
        
        }while(answer01.equals("1"));
        
        // mother age
         do{
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                     11. AGE AT THE TIME OF THIS BIRTH                   |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.print("\tEnter age: ");
               
                try{
                      int age = Integer.parseInt(sc.nextLine());
                      d.setMotherAge(age);
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
        
        // mother residence
        do {
            System.out.println("\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                            12. RESIDENCE                                |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            sc.nextLine();
            System.out.println("");
            System.out.print("\tEnter ( House No, Street, Barangay): ");
            d.setMhouseNo(sc.nextLine());
           
            System.out.print("\tEnter City/Municipality: ");
            d.setmCityMuni(sc.nextLine());
         
            System.out.print("\tEnter Province: ");
            d.setmProvince(sc.nextLine());
           
            //checks if the user tried to enter or space only
            if ( d.getMhouseNo().isEmpty() || d.getMhouseNo().equals(" ") || d.getmCityMuni().isEmpty() || d.getmCityMuni().equals(" ")
                || d.getmProvince().isEmpty() || d.getmProvince().equals(" ")) 
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
        
        // === father part == 
        // father name info
            
        do{
            System.out.println("");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                            13. FATHER NAME                              |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            
            System.out.print("\tEnter First Name: ");
            d.setfName(sc.nextLine());
            System.out.print("\tEnter Middle Name: ");
            d.setfMiddle(sc.nextLine());
            System.out.print("\tEnter Last Name: ");
            d.setfLast(sc.nextLine());
            
             //checks if the user tried to enter or space only
            if(d.getfName().isEmpty() || d.getfName().equals(" ") ||  d.getfLast().isEmpty() || d.getfLast().equals(" ")) 
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
        
        // father citizenship
        do{
            System.out.println("");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                            14. CITIZENSHIP                              |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            System.out.print("\tEnter Citizenship: ");
            d.setfCitizenship(sc.nextLine());
            
            if(d.getfCitizenship().isEmpty() || d.getfCitizenship().equals("")){
                
                System.out.println("");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("\t|       Please, don't input space or enter only in names... Thank you     |\t");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("");
                
                answer01 = "1";
            }
            else{
                
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
        
        }while(answer01.equals("1"));
        
        // father religion
        do{
            System.out.println("");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                             15. RELIGION                                |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            System.out.print("\tEnter Religion: ");
            d.setfReligion(sc.nextLine());
            
            if(d.getfReligion().isEmpty() || d.getfReligion().equals("")){
                
                System.out.println("");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("\t|       Please, don't input space or enter only in names... Thank you     |\t");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("");
                
                answer01 = "1";
            }
            else{
                
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
        
        }while(answer01.equals("1"));
        
        // father occupation
          do{
            System.out.println("");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                            16. OCCUPATION                               |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            System.out.print("\tEnter Occupation (Leave blank if none): ");
            d.setfOccupation(sc.nextLine());
            
            if(d.getfOccupation().isEmpty() || d.getfOccupation().equals("")){
                
                d.setmReligion("None");
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
            else{
                
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            }
        
        }while(answer01.equals("1"));
        
        // father age
         do{
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                     17. AGE AT THE TIME OF THIS BIRTH                   |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.print("\tEnter age: ");
               
                try{
                      int age = Integer.parseInt(sc.nextLine());
                      d.setFatherAge(age);
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
        
        
        // == another info part ==
        // 18 part
        do{
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                18. DATE AND PLACE OF MARRIAGE OF THE PARENTS            |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.print("\tEnter date and place: ");
                d.setPlaceanddateOfMarriage(sc.nextLine());
                
                if(d.getPlaceanddateOfMarriage().isEmpty() || d.getPlaceanddateOfMarriage().equals("")){
                    
                       
                    System.out.println("");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("\t|       Please, don't input space or enter only in names... Thank you     |\t");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("");
                    answer01 = "1";
                }
                else{
                    
                     askUserAgain();
                     System.out.print("\tEnter: ");
                     answer01 = sc.nextLine();
                }
        
        
        }while(answer01.equals("1"));
                
        // 19 part
        
        do{
                System.out.println("\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
                System.out.println("\t|                          19. A.  ATTENDANT                              |\t");
                System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t"); 
                System.out.println("\t");
                System.out.println("\t+-------------------------------------------------------------------------+\t");
                System.out.println("\t|                         [1] --> Physician                               |\t");
                System.out.println("\t|                         [2] --> Nurse                                   |\t");
                System.out.println("\t|                         [3] --> Midwife                                 |\t");
                System.out.println("\t|                         [4] --> Hilot(Traditonal Midwife)               |\t");
                System.out.println("\t                          [5] --> Others, Specify                         |\t");
                System.out.println("\t+-------------------------------------------------------------------------+\t");
                System.out.println("");
                System.out.print("\tPress a number: ");
                ch = sc.nextLine();
                
                if(ch.equalsIgnoreCase("1")){
                    
                    d.setAttendant("Physician");
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                }
                else if(ch.equalsIgnoreCase("2")){
                    
                    d.setAttendant("Nurse");
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                    
                }
                else if(ch.equalsIgnoreCase("3")){
                    
                    d.setAttendant("Midwife");
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                    
                }
                else if(ch.equalsIgnoreCase("4")){
                    
                    d.setAttendant("Hilot(Traditonal Midwife)");
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                    
                }
                else if(ch.equalsIgnoreCase("5")){
                    
                    System.out.print("\tSpecify: ");
                    d.setAttendant(sc.nextLine());
                    answer01 = "0";
                    askUserAgain();
                    System.out.print("\tEnter: ");
                    answer01 = sc.nextLine();
                }
                else{
                    
                    System.out.println("");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("\t|                   Plss only select the avaiable number                  |\t");
                    System.out.println("\t---------------------------------------------------------------------------\t");
                    System.out.println("");
                    answer01 = "1";
                }
            
        }while(answer01.equals("1"));
        
        // 19 B
        do{
            System.out.println("");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                        B. CERTIFICATION OF BIRTH                        |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            System.out.print("\tI hereby that i attended the birth of the child who  was born alive at () o clock am/pm on the date stated about: ");
            d.setTime(sc.nextLine());
            System.out.print("\tEnter Name in print (ALL CAPITAL): ");
            d.setNamePrint(sc.nextLine());
            System.out.print("\tEnter Title or Positon: ");
            d.setTitlePosition(sc.nextLine());
            System.out.print("\tEnter Address: ");
            d.setAddress(sc.nextLine());
            System.out.print("\tEnter Date: ");
            d.setDate(sc.nextLine());
            
            if(d.getTime().isEmpty() || d.getTime().equals(" ") || d.getNamePrint().isEmpty() ||  d.getNamePrint().equals(" ") 
                || d.getTitlePosition().isEmpty() || d.getTitlePosition().equals(" ") || d.getAddress().isEmpty() || d.getAddress().equals(" ") 
                    || d.getDate().isEmpty() ||  d.getDate().equals(" ")){
                
                System.out.println("");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("\t|       Please, don't input space or enter only in names... Thank you     |\t");
                System.out.println("\t---------------------------------------------------------------------------\t");
                System.out.println("");
                answer01 = "1";
            
            }
            else{
                
                askUserAgain();
                System.out.print("\tEnter: ");
                answer01 = sc.nextLine();
            
            }
        
        }while(answer01.equals("1"));
        
        // 20 part
        do{
            System.out.println("\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                             20. INFORMANT                               |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
        
        
        }while(answer01.equals("1"));
        
        
        
        // 21 part
        do{
            System.out.println("\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                            21. PREPARED BY                              |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
        
        
        }while(answer01.equals("1"));
        
        
        
        // 22 part
        do{
            System.out.println("\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|               22. RECEIVED AT THE OFFICE OF  CIVIL REGISTRAR            |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
        
        
        }while(answer01.equals("1"));
        
                
        
        
        
        
          // invoke this method to collect the data
         getMap();
          
    }
    
}
