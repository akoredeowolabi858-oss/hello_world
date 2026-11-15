import java.util.Scanner;
public class Nokia{
  public static void main(String...args){
  Scanner input = new Scanner(System.in);
  
  int choice;
  System.out.println("""
  =========NOKIA 5510==========
  1. PHONE BOOK
  2. MESSAGES
  3. CHAT 
  4. CALL REGISTER 
  5. TONES
  6. SETTINGS
  7. CALL DIVERT
  8. MUSIC
  9. GAMES
  10. CALCULATOR
  11. REMINDERS
  12. CLOCK
  13. PROFILES
  14. WAP SERVICES
  15. SIM SERVICES
  """);
  
  System.out.print("Select an option : ");
  choice = input.nextInt();
  
  
  switch (choice){
    case 1:
        System.out.println("""
        ======Phone Book=====
        1. Search contact
        2. Services Nos.
        3. Add name
        4. Erase
        5. Edit
        6. Copy
        7. Assign tone
        8. Send b'card 
        9. options
            1. memory in use
            2. Type of view
            3. Memory Status
        10. Speed dials
        11. Voice tags
        0. Previous
        """);
        
        
         String name = "";
        String number = "";
        
        System.out.print("enter phone book choice  : ");
        int phoneChoice = input.nextInt();
        input.nextLine();
        
       
        
          switch (phoneChoice){
            case 0:
            mainMenu();
            break;
            case 1:
            System.out.println("Enter name: ");
            name = input.nextLine();
            
            System.out.println("Enter number : ");
            number = input.nextLine();
            
            System.out.println("Contact saved");
            break;
            
            case 2:
            System.out.println("Name: " + name);
            System.out.println("Number: " + number);
            
            
            
           
            break;
            default:
            System.out.println("invalid choice");
            
            
        
              
            
          }
          
        break;
        
     case 2:
          System.out.println("""
          ======Message=====
          1. write messages
          2. inbox
          3. Outbox
          4. picture Messages
          5. Templates
          6. Smileys
          7. messages
            1. set 1
              1. message centre number
              2. mesaages sent as
              3. Message Validty
              
            2. common
              1. Delivery reports
              2.Reply via same centre
              3. character support 
          8. info Service
          9. voice mailbox number
          10. Services command editor
          """);
            break;
          
          
        case 3:
          System.out.println("chat");
           break;
           
           
           
         case 4:
          System.out.println("""
          call register
          1. missed call
          2. Received calls
          3. Dialled numbers
          4. Erase recent call
          5. show call duration
              1. Last call duration
              2. All call's duration
              3. Recieved calls duration
              4. Dialled calls duration
              5. Clear timers
          6. Show all costs
              1. last call cost
              2. All calls cost
              3. clear counters
          7. call cost settings
             1. call cost limit
             2. show cost in
          8. prepaid credit
          """);
            break;
          
          
          
          
          case 5:
            System.out.println("""
            Tones
          1. Ringing tone
          2. Ringing volume
          3. Incoming call alert
          4. message alert tone
          5. Keypad tones
          6. Warning tones
          7. vibrating alert
          8. Screen saver
          """);
             
                System.out.print("Enter Tone choices: ");
                int option = input.nextInt();
           if(option == 1){
           System.out.println("1. sunshine");
             System.out.println("2. Arise");
             System.out.println("3. Sunny");
             }else{
                          System.out.println("Invalid option");
           }
           System.out.println("Enter Tone choices: ");
                int sound = input.nextInt();   
             
             switch(sound){
             
             
             case 1: 
             System.out.println("you picked Sunshine");
             break;
             case 2:
             System.out.println("you picked Arise");
             break;
             case 3:
             System.out.println("you picked sunny");
             break;
             default:
             System.out.println("invalid choice");
             }
             break;
            
            
            
            case 6:
              System.out.println("""
              Settings
            1. call Settings
                1. Automatic redial
                2. Speed dialling
                3. call waiting options
                4. Own number sending
                5. phone line in use 
                6. Automatic answer
            2. Phone settings 
                1. Language
                2. cell info display
                3. welcome note
                4. Network Selection
                5. confirm Sim services actions
            3. Security setting
                1. Pin code request
                2. call barring service
                  3. fixed dialling
                 4. Closed user group
                  5. Security level
                  6. Change access codes
            4. Restore factory Settings
            """);
                break;
              
            
            
            case 7:
              System.out.println("Call divert");
               break;
              
            case 8:  
              System.out.println("""
              Music
           1. Music player
           2. Radio
           3. Recoder
           4. Track list
           """);
                break;
            
            
            case 9:
              System.out.println("Games");
                break;
              
              
            case 10:
              System.out.println("Calculator");
                break;
            
            case 11:
              System.out.println("Reminders");
                break;
                
             
             case 12:
              System.out.println("""
              Clock
             1. Alarm clock
             2. Clock settings
             3. Date setting
             4. Stopwatch
             5. Countdown timer
             6. Auto update of date and time
             """);
                break;
                
              case 13:
                System.out.println("Profile");
                  break;
                 
                 
              case 14:
                System.out.println("Services");
                    break;
                 
                 
               case 15:
                System.out.println("SIM services");
                  break;

            
  
  }
  
  }


public static void mainMenu(){
  System.out.println("""
  =========NOKIA 5510==========
  1. PHONE BOOK
  2. MESSAGES
  3. CHAT 
  4. CALL REGISTER 
  5. TONES
  6. SETTINGS
  7. CALL DIVERT
  8. MUSIC
  9. GAMES
  10. CALCULATOR
  11. REMINDERS
  12. CLOCK
  13. PROFILES
  14. WAP SERVICES
  15. SIM SERVICES
  """);
  
  

  }
}
import java.util.Scanner;
public class Nokia{
  public static void main(String...args){
  Scanner input = new Scanner(System.in);
  
  int choice;
  System.out.println("""
  =========NOKIA 5510==========
  1. PHONE BOOK
  2. MESSAGES
  3. CHAT 
  4. CALL REGISTER 
  5. TONES
  6. SETTINGS
  7. CALL DIVERT
  8. MUSIC
  9. GAMES
  10. CALCULATOR
  11. REMINDERS
  12. CLOCK
  13. PROFILES
  14. WAP SERVICES
  15. SIM SERVICES
  """);
  
  System.out.print("Select an option : ");
  choice = input.nextInt();
  
  
  switch (choice){
    case 1:
        System.out.println("""
        ======Phone Book=====
        1. Search contact
        2. Services Nos.
        3. Add name
        4. Erase
        5. Edit
        6. Copy
        7. Assign tone
        8. Send b'card 
        9. options
            1. memory in use
            2. Type of view
            3. Memory Status
        10. Speed dials
        11. Voice tags
        0. Previous
        """);
        
        
         String name = "";
        String number = "";
        
        System.out.print("enter phone book choice  : ");
        int phoneChoice = input.nextInt();
        input.nextLine();
        
       
        
          switch (phoneChoice){
            case 0:
            mainMenu();
            break;
            case 1:
            System.out.println("Enter name: ");
            name = input.nextLine();
            
            System.out.println("Enter number : ");
            number = input.nextLine();
            
            System.out.println("Contact saved");
            break;
            
            case 2:
            System.out.println("Name: " + name);
            System.out.println("Number: " + number);
            
            
            
           
            break;
            default:
            System.out.println("invalid choice");
            
            
        
              
            
          }
          
        break;
        
     case 2:
          System.out.println("""
          ======Message=====
          1. write messages
          2. inbox
          3. Outbox
          4. picture Messages
          5. Templates
          6. Smileys
          7. messages
            1. set 1
              1. message centre number
              2. mesaages sent as
              3. Message Validty
              
            2. common
              1. Delivery reports
              2.Reply via same centre
              3. character support 
          8. info Service
          9. voice mailbox number
          10. Services command editor
          """);
            break;
          
          
        case 3:
          System.out.println("chat");
           break;
           
           
           
         case 4:
          System.out.println("""
          call register
          1. missed call
          2. Received calls
          3. Dialled numbers
          4. Erase recent call
          5. show call duration
              1. Last call duration
              2. All call's duration
              3. Recieved calls duration
              4. Dialled calls duration
              5. Clear timers
          6. Show all costs
              1. last call cost
              2. All calls cost
              3. clear counters
          7. call cost settings
             1. call cost limit
             2. show cost in
          8. prepaid credit
          """);
            break;
          
          
          
          
          case 5:
            System.out.println("""
            Tones
          1. Ringing tone
          2. Ringing volume
          3. Incoming call alert
          4. message alert tone
          5. Keypad tones
          6. Warning tones
          7. vibrating alert
          8. Screen saver
          """);
             
                System.out.print("Enter Tone choices: ");
                int option = input.nextInt();
           if(option == 1){
           System.out.println("1. sunshine");
             System.out.println("2. Arise");
             System.out.println("3. Sunny");
             }else{
                          System.out.println("Invalid option");
           }
           System.out.println("Enter Tone choices: ");
                int sound = input.nextInt();   
             
             switch(sound){
             
             
             case 1: 
             System.out.println("you picked Sunshine");
             break;
             case 2:
             System.out.println("you picked Arise");
             break;
             case 3:
             System.out.println("you picked sunny");
             break;
             default:
             System.out.println("invalid choice");
             }
             break;
            
            
            
            case 6:
              System.out.println("""
              Settings
            1. call Settings
                1. Automatic redial
                2. Speed dialling
                3. call waiting options
                4. Own number sending
                5. phone line in use 
                6. Automatic answer
            2. Phone settings 
                1. Language
                2. cell info display
                3. welcome note
                4. Network Selection
                5. confirm Sim services actions
            3. Security setting
                1. Pin code request
                2. call barring service
                  3. fixed dialling
                 4. Closed user group
                  5. Security level
                  6. Change access codes
            4. Restore factory Settings
            """);
                break;
              
            
            
            case 7:
              System.out.println("Call divert");
               break;
              
            case 8:  
              System.out.println("""
              Music
           1. Music player
           2. Radio
           3. Recoder
           4. Track list
           """);
                break;
            
            
            case 9:
              System.out.println("Games");
                break;
              
              
            case 10:
              System.out.println("Calculator");
                break;
            
            case 11:
              System.out.println("Reminders");
                break;
                
             
             case 12:
              System.out.println("""
              Clock
             1. Alarm clock
             2. Clock settings
             3. Date setting
             4. Stopwatch
             5. Countdown timer
             6. Auto update of date and time
             """);
                break;
                
              case 13:
                System.out.println("Profile");
                  break;
                 
                 
              case 14:
                System.out.println("Services");
                    break;
                 
                 
               case 15:
                System.out.println("SIM services");
                  break;

            
  
  }
  
  }


public static void mainMenu(){
  System.out.println("""
  =========NOKIA 5510==========
  1. PHONE BOOK
  2. MESSAGES
  3. CHAT 
  4. CALL REGISTER 
  5. TONES
  6. SETTINGS
  7. CALL DIVERT
  8. MUSIC
  9. GAMES
  10. CALCULATOR
  11. REMINDERS
  12. CLOCK
  13. PROFILES
  14. WAP SERVICES
  15. SIM SERVICES
  """);
  
  

  }
}
import java.util.Scanner;
public class Nokia{
  public static void main(String...args){
  Scanner input = new Scanner(System.in);
  
  int choice;
  System.out.println("""
  =========NOKIA 5510==========
  1. PHONE BOOK
  2. MESSAGES
  3. CHAT 
  4. CALL REGISTER 
  5. TONES
  6. SETTINGS
  7. CALL DIVERT
  8. MUSIC
  9. GAMES
  10. CALCULATOR
  11. REMINDERS
  12. CLOCK
  13. PROFILES
  14. WAP SERVICES
  15. SIM SERVICES
  """);
  
  System.out.print("Select an option : ");
  choice = input.nextInt();
  
  
  switch (choice){
    case 1:
        System.out.println("""
        ======Phone Book=====
        1. Search contact
        2. Services Nos.
        3. Add name
        4. Erase
        5. Edit
        6. Copy
        7. Assign tone
        8. Send b'card 
        9. options
            1. memory in use
            2. Type of view
            3. Memory Status
        10. Speed dials
        11. Voice tags
        0. Previous
        """);
        
        
         String name = "";
        String number = "";
        
        System.out.print("enter phone book choice  : ");
        int phoneChoice = input.nextInt();
        input.nextLine();
        
       
        
          switch (phoneChoice){
            case 0:
            mainMenu();
            break;
            case 1:
            System.out.println("Enter name: ");
            name = input.nextLine();
            
            System.out.println("Enter number : ");
            number = input.nextLine();
            
            System.out.println("Contact saved");
            break;
            
            case 2:
            System.out.println("Name: " + name);
            System.out.println("Number: " + number);
            
            
            
           
            break;
            default:
            System.out.println("invalid choice");
            
            
        
              
            
          }
          
        break;
        
     case 2:
          System.out.println("""
          ======Message=====
          1. write messages
          2. inbox
          3. Outbox
          4. picture Messages
          5. Templates
          6. Smileys
          7. messages
            1. set 1
              1. message centre number
              2. mesaages sent as
              3. Message Validty
              
            2. common
              1. Delivery reports
              2.Reply via same centre
              3. character support 
          8. info Service
          9. voice mailbox number
          10. Services command editor
          """);
            break;
          
          
        case 3:
          System.out.println("chat");
           break;
           
           
           
         case 4:
          System.out.println("""
          call register
          1. missed call
          2. Received calls
          3. Dialled numbers
          4. Erase recent call
          5. show call duration
              1. Last call duration
              2. All call's duration
              3. Recieved calls duration
              4. Dialled calls duration
              5. Clear timers
          6. Show all costs
              1. last call cost
              2. All calls cost
              3. clear counters
          7. call cost settings
             1. call cost limit
             2. show cost in
          8. prepaid credit
          """);
            break;
          
          
          
          
          case 5:
            System.out.println("""
            Tones
          1. Ringing tone
          2. Ringing volume
          3. Incoming call alert
          4. message alert tone
          5. Keypad tones
          6. Warning tones
          7. vibrating alert
          8. Screen saver
          """);
             
                System.out.print("Enter Tone choices: ");
                int option = input.nextInt();
           if(option == 1){
           System.out.println("1. sunshine");
             System.out.println("2. Arise");
             System.out.println("3. Sunny");
             }else{
                          System.out.println("Invalid option");
           }
           System.out.println("Enter Tone choices: ");
                int sound = input.nextInt();   
             
             switch(sound){
             
             
             case 1: 
             System.out.println("you picked Sunshine");
             break;
             case 2:
             System.out.println("you picked Arise");
             break;
             case 3:
             System.out.println("you picked sunny");
             break;
             default:
             System.out.println("invalid choice");
             }
             break;
            
            
            
            case 6:
              System.out.println("""
              Settings
            1. call Settings
                1. Automatic redial
                2. Speed dialling
                3. call waiting options
                4. Own number sending
                5. phone line in use 
                6. Automatic answer
            2. Phone settings 
                1. Language
                2. cell info display
                3. welcome note
                4. Network Selection
                5. confirm Sim services actions
            3. Security setting
                1. Pin code request
                2. call barring service
                  3. fixed dialling
                 4. Closed user group
                  5. Security level
                  6. Change access codes
            4. Restore factory Settings
            """);
                break;
              
            
            
            case 7:
              System.out.println("Call divert");
               break;
              
            case 8:  
              System.out.println("""
              Music
           1. Music player
           2. Radio
           3. Recoder
           4. Track list
           """);
                break;
            
            
            case 9:
              System.out.println("Games");
                break;
              
              
            case 10:
              System.out.println("Calculator");
                break;
            
            case 11:
              System.out.println("Reminders");
                break;
                
             
             case 12:
              System.out.println("""
              Clock
             1. Alarm clock
             2. Clock settings
             3. Date setting
             4. Stopwatch
             5. Countdown timer
             6. Auto update of date and time
             """);
                break;
                
              case 13:
                System.out.println("Profile");
                  break;
                 
                 
              case 14:
                System.out.println("Services");
                    break;
                 
                 
               case 15:
                System.out.println("SIM services");
                  break;

            
  
  }
  
  }


public static void mainMenu(){
  System.out.println("""
  =========NOKIA 5510==========
  1. PHONE BOOK
  2. MESSAGES
  3. CHAT 
  4. CALL REGISTER 
  5. TONES
  6. SETTINGS
  7. CALL DIVERT
  8. MUSIC
  9. GAMES
  10. CALCULATOR
  11. REMINDERS
  12. CLOCK
  13. PROFILES
  14. WAP SERVICES
  15. SIM SERVICES
  """);
  
  

  }
}
