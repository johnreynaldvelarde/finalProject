
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
    
    // method to show the new created psa birth certificate
    
    public void getNew(){
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("");
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t                         CERTIFICATE OF LIVE BIRTH                           \t");
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t Province: "+d.getFrontProvince() +"    \t\t\t  Registry No. "  + d.getNumber() );
         System.out.println("\t City/Municipality: "+d.getFrontCityMuni()+"                                 \t");
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t                            CHILD INFORMATION                                \t");
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t  1. CHILD NAME: \t(First) \t"+ d.getcName()                                    );
         System.out.println("\t                 \t(Middle) \t"+ d.getcMiddle()                                 );
         System.out.println("\t                 \t(Last) \t\t"+ d.getcLast()                                   );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  2. SEX: \t"+ d.getChildSex()                                                  );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  3. DATE OF BIRTH:  \t(Day) \t\t"+ d.getDay()                                  );
         System.out.println("\t                     \t(Month) \t"+ d.getMonth()                                );
         System.out.println("\t                     \t(Year) \t\t"+ d.getYear()                                );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  4. PLACE OF BIRTH: \t(Name of Hospital) \t"+d.getPlaceOfBirth()               );
         System.out.println("\t                     \t(City/Municipality)\t"+d.getChildcityMuni()              );
         System.out.println("\t                     \t(Province)         \t"+d.getChildProvince()              );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  5. A. TYPE OF BIRTH:                \t\t"+d.getTypeOfBirth()                  );
         System.out.println("\t     B. IF MULTIPLE BIRTH, CHILD WAS: \t\t"+d.getMultipleBirth()                );
         System.out.println("\t     C. BIRTH ORDER:                  \t\t"+d.getBirthOrder()                   );
         System.out.println("\t     D. WEIGHT AT BIRTH:              \t\t"+d.getBabyWeight()                   );
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t                            MOTHER INFORMATION                               \t");
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t  6. MOTHER NAME: \t(First) \t"+ d.getmName()                                   );
         System.out.println("\t                  \t(Middle) \t"+ d.getmMiddle()                                  );
         System.out.println("\t                  \t(Last) \t\t"+ d.getmLast()                                  );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  7. CITIZENSHIP: \t"+ d.getmCitizenship()                                      );
         System.out.println("\t  8. RELIGION:    \t"+ d.getmReligion()                                         );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  9. A. TOTAL NUMBER OF CHILDBORN ALIVE:                  \t"+d.getAlive()      );
         System.out.println("\t     B. NO OF CHILDREN STILL LIVING INCLUDING THIS BRITH: \t"+d.getLiving()     );
         System.out.println("\t     C. NO OF CHILDREN BORN ALIVE BUT ARE NOT DEAD:       \t"+d.getDead()       );
         System.out.println("\t---------------------------------------------------------------------------"    );               
         System.out.println("\t  10. OCCUPATION:                     \t"+ d.getmOccupation()                   );
         System.out.println("\t  11. AGE AT THE TIME OF THIS BIRTH:  \t"+ d.getMotherAge()                     );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  12. RESIDENCE:     \t(House No)         \t"+d.getMhouseNo()                   );
         System.out.println("\t                     \t(City/Municipality)\t"+d.getmCityMuni()                  );
         System.out.println("\t                     \t(Province)         \t"+d.getmProvince()                  );
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t                            FATHER INFORMATION                               \t");
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t  13. FATHER NAME: \t(First) \t"+ d.getfName()                                  );
         System.out.println("\t                   \t(Middle) \t"+ d.getfMiddle()                               );
         System.out.println("\t                   \t(Last) \t\t"+ d.getfLast()                                 );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  14. CITIZENSHIP:                    \t"+ d.getfCitizenship()                  );
         System.out.println("\t  15. RELIGION:                       \t"+ d.getfReligion()                     );
         System.out.println("\t  16. OCCUPATION:                     \t"+ d.getfOccupation()                   );
         System.out.println("\t  17. AGE AT THE TIME OF THIS BIRTH:  \t"+ d.getFatherAge()                     );
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t                            ANOTHER INFORMATION                              \t");
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t  18. DATE AND PLACE OF                                                        ");  
         System.out.println("\t      MARRIAGE OF THE PARENTS:  \t"+ d.getPlaceanddateOfMarriage()              );                                                 
         System.out.println("\t  19. A. ATTENDANT:             \t"+ d.getAttendant()                           );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t      B. CERTIFICATION OF BIRTH:                                               ");
         System.out.println("\t      I hereby that I attended the birth of the child who was born"             );
         System.out.println("\t      alive at()   "+d.getTime()+"   o clock am/pm on the date stated above    ");
         System.out.println("\t                                                                               ");
         System.out.println("\t      (Name in print)      \t"+d.getNamePrint()                                 );
         System.out.println("\t      (Title or Position)  \t"+d.getTitlePosition()                             );
         System.out.println("\t      (Address)            \t"+d.getAddress()                                   );
         System.out.println("\t      (Date)               \t"+d.getDate()                                      );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  20. INFORMANT:  \t(Name in print)               \t"+ d.getNamePrint2()        );
         System.out.println("\t                  \t(Relationship of the child)   \t"+ d.getRelationToChild()   );
         System.out.println("\t                  \t(Address)                     \t"+ d.getAddress2()          );
         System.out.println("\t                  \t(Date)                        \t"+ d.getDate2()             );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  21. PREPARED BY: \t(Name in print)       \t"+ d.getNamePrint3()               );
         System.out.println("\t                   \t(Title or Position)   \t"+ d.getTitlePosition3()           );
         System.out.println("\t                   \t(Date)                \t"+ d.getDate3()                    );
         System.out.println("\t---------------------------------------------------------------------------"    );
         System.out.println("\t  22. RECEIVED AT THE OFFICE OF CIVIL REGISTRAR :                              ");
         System.out.println("\t                   \t(Name in print)       \t"+ d.getNamePrint4()               );
         System.out.println("\t                   \t(Title or Position)   \t"+ d.getTitlePosition4()           );
         System.out.println("\t                   \t(Date)                \t"+ d.getDate4()                    );
         System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
         System.out.println("\t");
         System.out.println("\t");
         
    }
    
     // search a certain record  
     public void getSearch(){
        
        String answer01 = "";
        boolean found = false;
        
        do{
            System.out.println("");
            System.out.print("\tEnter the registry number: ");
            try{
            
            int key = Integer.parseInt(sc.nextLine());
             
            ArrayList record = map.get(key);
            
            if(record!=null) {
            found = true;
            
            System.out.println("\t");
            System.out.println("\t    ~o~o~o~o~o Congratulations!! You're Record has been found ~o~o~o~o~o   \t");
            System.out.println("\t");
            System.out.println("\t");
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t                         CERTIFICATE OF LIVE BIRTH                           \t");
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t Province: "+d.getFrontProvince() +"    \t\t\t  Registry No. "  + key           );
            System.out.println("\t City/Municipality: "+d.getFrontCityMuni()+"                                 \t");
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t                            CHILD INFORMATION                                \t");
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t  1. CHILD NAME: \t(First) \t"+ record.get(1)                                   );
            System.out.println("\t                 \t(Middle) \t"+ record.get(2)                                  );
            System.out.println("\t                 \t(Last) \t\t"+ record.get(0)                                  );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  2. SEX: \t"+ record.get(3)                                                    );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  3. DATE OF BIRTH:  \t(Day) \t\t"+ record.get(4)                               );
            System.out.println("\t                     \t(Month) \t"+ record.get(5)                               );
            System.out.println("\t                     \t(Year) \t\t"+ record.get(6)                              );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  4. PLACE OF BIRTH: \t(Name of Hospital) \t"+record.get(7)                     );
            System.out.println("\t                     \t(City/Municipality)\t"+record.get(8)                     );
            System.out.println("\t                     \t(Province)         \t"+record.get(9)                     );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  5. A. TYPE OF BIRTH:                \t\t"+record.get(10)                      );
            System.out.println("\t     B. IF MULTIPLE BIRTH, CHILD WAS: \t\t"+record.get(11)                      );
            System.out.println("\t     C. BIRTH ORDER:                  \t\t"+record.get(12)                      );
            System.out.println("\t     D. WEIGHT AT BIRTH:              \t\t"+record.get(13)                      );
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t                            MOTHER INFORMATION                               \t");
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t  6. MOTHER NAME: \t(First)  \t"+ record.get(14)                                );
            System.out.println("\t                  \t(Middle) \t"+ record.get(15)                                );
            System.out.println("\t                  \t(Last) \t\t"+ record.get(16)                                );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  7. CITIZENSHIP: \t"+ record.get(17)                                           );
            System.out.println("\t  8. RELIGION:    \t"+ record.get(18)                                           );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  9. A. TOTAL NUMBER OF CHILDBORN ALIVE:                  \t"+record.get(19)    );
            System.out.println("\t     B. NO OF CHILDREN STILL LIVING INCLUDING THIS BRITH: \t"+record.get(20)    );
            System.out.println("\t     C. NO OF CHILDREN BORN ALIVE BUT ARE NOT DEAD:       \t"+record.get(21)    );
            System.out.println("\t---------------------------------------------------------------------------"    );               
            System.out.println("\t  10. OCCUPATION:                     \t"+ record.get(22)                       );
            System.out.println("\t  11. AGE AT THE TIME OF THIS BIRTH:  \t"+ record.get(23)                       );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  12. RESIDENCE:     \t(House No)         \t"+ record.get(24)                   );
            System.out.println("\t                     \t(City/Municipality)\t"+ record.get(25)                   );
            System.out.println("\t                     \t(Province)         \t"+ record.get(26)                   );
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t                            FATHER INFORMATION                               \t");
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t  13. FATHER NAME: \t(First)  \t"+ record.get(27)                               );
            System.out.println("\t                   \t(Middle) \t"+ record.get(28)                               );
            System.out.println("\t                   \t(Last) \t\t"+ record.get(29)                               );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  14. CITIZENSHIP:                    \t"+ record.get(30)                       );
            System.out.println("\t  15. RELIGION:                       \t"+ record.get(31)                       );
            System.out.println("\t  16. OCCUPATION:                     \t"+ record.get(32)                       );
            System.out.println("\t  17. AGE AT THE TIME OF THIS BIRTH:  \t"+ record.get(33)                       );
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t                            ANOTHER INFORMATION                              \t");
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t  18. DATE AND PLACE OF                                                        ");  
            System.out.println("\t      MARRIAGE OF THE PARENTS:  \t"+ record.get(34)                             );                                                 
            System.out.println("\t  19. A. ATTENDANT:             \t"+ record.get(35)                             );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t      B. CERTIFICATION OF BIRTH:                                               ");
            System.out.println("\t      I hereby that I attended the birth of the child who was born"             );
            System.out.println("\t      alive at()   "+ record.get(36) +"  o clock am/pm on the date stated above");
            System.out.println("\t                                                                               ");
            System.out.println("\t      (Name in print)      \t"+record.get(37)                                   );
            System.out.println("\t      (Title or Position)  \t"+record.get(38)                                   );
            System.out.println("\t      (Address)            \t"+record.get(39)                                   );
            System.out.println("\t      (Date)               \t"+record.get(40)                                   );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  20. INFORMANT:  \t(Name in print)               \t"+ record.get(41)           );
            System.out.println("\t                  \t(Relationship of the child)   \t"+ record.get(42)           );
            System.out.println("\t                  \t(Address)                     \t"+ record.get(43)           );
            System.out.println("\t                  \t(Date)                        \t"+ record.get(44)           );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  21. PREPARED BY: \t(Name in print)       \t"+ record.get(45)                  );
            System.out.println("\t                   \t(Title or Position)   \t"+ record.get(46)                  );
            System.out.println("\t                   \t(Date)                \t"+ record.get(47)                  );
            System.out.println("\t---------------------------------------------------------------------------"    );
            System.out.println("\t  22. RECEIVED AT THE OFFICE OF CIVIL REGISTRAR :                              ");
            System.out.println("\t                   \t(Name in print)       \t"+ record.get(48)                  );
            System.out.println("\t                   \t(Title or Position)   \t"+ record.get(49)                  );
            System.out.println("\t                   \t(Date)                \t"+ record.get(50)                  );
            System.out.println("\t━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\t");
            System.out.println("\t");
            System.out.println("\t");
            
       
            
        }
        else{
             System.out.println("");
             System.out.println("\t      ~o~o~o~o~o  Ooops!! The Record has not been found   ~o~o~o~o~o       \t");
             System.out.println("");
        }
             //answer01 = sc.nextLine();
             
            }catch(NumberFormatException e){
            
                      System.out.println("");
                      System.out.println("\t---------------------------------------------------------------------------\t");
                      System.out.println("\t|               Please, wrong input, Try Again!!! ... Thank you           |\t");
                      System.out.println("\t---------------------------------------------------------------------------\t");
                      System.out.println("");
                      answer01 = "1";
            }
      
        }while(answer01.equals("1"));
    }
     
     
    public void getchildInfo(){
        
        String answer01;
        int askUser = 0;
        String ch;
        char sex;
        
        System.out.println("");
        System.out.print("\tRegistry No: " + d.getNumber());
        System.out.println("");
        
      
        
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
                    System.out.println("\t|                  Plss only select the available number                  |\t");
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
                    System.out.println("\t|                  Plss only select the available number                  |\t");
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
                    System.out.println("\t|                  Plss only select the available number                  |\t");
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
                
                d.setmOccupation("None");
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
                
                d.setfOccupation("None");
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
                System.out.println("\t|                         [5] --> Others, Specify                         |\t");
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
                    System.out.println("\t|                  Plss only select the available number                  |\t");
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
            System.out.print("\tEnter Name in print: ");
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
            System.out.print("\tEnter Name in print: ");
            d.setNamePrint2(sc.nextLine());
            System.out.print("\tEnter relationship to child: ");
            d.setRelationToChild(sc.nextLine());
            System.out.print("\tEnter Address: ");
            d.setAddress2(sc.nextLine());
            System.out.print("\tEnter Date: ");
            d.setDate2(sc.nextLine());
            
            if(d.getNamePrint2().isEmpty() ||  d.getNamePrint2().equals(" ") || d.getRelationToChild().isEmpty() || d.getRelationToChild().equals("")
                    || d.getAddress2().isEmpty() || d.getAddress2().equals(" ")|| d.getDate2().isEmpty() ||  d.getDate2().equals(" ")) { 
                   
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
        
        
        
        // 21 part
        do{
            System.out.println("\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|                            21. PREPARED BY                              |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            System.out.print("\tEnter Name in print: ");
            d.setNamePrint3(sc.nextLine());
            System.out.print("\tEnter Title or position: ");
            d.setTitlePosition3(sc.nextLine());
            System.out.print("\tEnter Date: ");
            d.setDate3(sc.nextLine());
            
            if(d.getNamePrint3().isEmpty() ||  d.getNamePrint3().equals(" ") || d.getTitlePosition3().isEmpty() || d.getTitlePosition3().equals("")
                   || d.getDate3().isEmpty() ||  d.getDate3().equals(" ")) { 
                   
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
        
        
        
        // 22 part
        do{
            System.out.println("\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("\t|               22. RECEIVED AT THE OFFICE OF  CIVIL REGISTRAR            |\t");
            System.out.println("\t+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+\t");
            System.out.println("");
            System.out.print("\tEnter Name in print: ");
            d.setNamePrint4(sc.nextLine());
            System.out.print("\tEnter Title or position: ");
            d.setTitlePosition4(sc.nextLine());
            System.out.print("\tEnter Date: ");
            d.setDate4(sc.nextLine());
            
            if(d.getNamePrint4().isEmpty() ||  d.getNamePrint4().equals(" ") || d.getTitlePosition4().isEmpty() || d.getTitlePosition4().equals("")
                   || d.getDate4().isEmpty() ||  d.getDate4().equals(" ")) { 
                   
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
        
        
          // invoke this method to collect the data
         getMap();
          
    }
      // method putting all data in hashmap   
    public void getMap(){
    
       map.put(d.getNumber(), new ArrayList(Arrays.asList(d.getcLast(), d.getcName(), d.getcMiddle(), d.getChildSex(), d.getDay(), d.getMonth(),
               d.getYear(),d.getPlaceOfBirth(), d.getChildcityMuni(), d.getChildProvince(), d.getTypeOfBirth(), d.getMultipleBirth(), d.getBirthOrder(), 
               d.getBabyWeight(), d.getmName(), d.getmMiddle(), d.getcLast(), d.getmCitizenship(), d.getmReligion(), d.getAlive(), d.getLiving(),
               d.getDead(), d.getmOccupation(), d.getMotherAge(), d.getMhouseNo(), d.getmCityMuni(), d.getmProvince(), d.getfName(),
               d.getfMiddle(), d.getfLast(), d.getfCitizenship(), d.getfReligion(), d.getfOccupation(), d.getFatherAge(), d.getPlaceanddateOfMarriage(),
               d.getAttendant(), d.getTime(), d.getNamePrint(), d.getTitlePosition(), d.getAddress(), d.getDate(), d.getNamePrint2(),
               d.getRelationToChild(), d.getAddress2(), d.getDate2(), d.getNamePrint3(), d.getTitlePosition3(), d.getDate3(), d.getNamePrint4(),
               d.getTitlePosition4(), d.getDate4() )));
               
    
    }
    
}
