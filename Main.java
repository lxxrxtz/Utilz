import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    
    boolean run = false;
    boolean login = false;
    boolean pwc = false;
    String user1 = "admin";
    String pswd1 = "password";
    int onoff = 1;
    
while (onoff == 1) {
  
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
  if (run == false) {
    System.out.print("\n \nPlease enter a command: ");
  }
    String cmd = null;
  
    
    try {
        cmd = reader.readLine();
        if (cmd.equalsIgnoreCase("new") && run == false) {
            int n1 = (int) (101*Math.random());
            int n2 = (int) (101*Math.random());
            int n3 = (int) (101*Math.random());
            String chars = "abcxyz";
            Random rnd = new Random();
            char c1 = chars.charAt(rnd.nextInt(chars.length()));
            char c2 = chars.charAt(rnd.nextInt(chars.length()));
            char c3 = chars.charAt(rnd.nextInt(chars.length()));
            int cu = (int) (2*Math.random());
            int pos = (int) (3*Math.random());

            int sz = (int) (3*Math.random());
          
          if (sz == 0) {
            String s11 = "";
            int s1 = (int) (4*Math.random());
            
            if (s1 == 0) {
             s11 = "!";
            } 
            
            else if (s1 == 1) {
             s11 = "#";
            }
            
            else if (s1 == 2) { 
             s11 = "&";
            }
            
            else if (s1 == 3) {
             s11 = "?";
            }
              System.out.println("\n \n" + n1 + "" + c1 + n2 + c2 + n3 + c3 + s11);
          }
          
          else if (sz == 1) {
            String s22 = "";
            int s2 = (int) (4*Math.random());
            
            if (s2 == 0) {
             s22 = "!";
            } 
            
            else if (s2 == 1) {
             s22 = "#";
            }
            
            else if (s2 == 2) { 
             s22 = "&";
            }
            
            else if (s2 == 3) {
             s22 = "?";
            }
            
              System.out.println("\n \n" + n1 + "" + c1 + s22 + n2 + c2 + n3 +c3);
          } 
          
          else if (sz == 2) {
            String s33 = "";
            int s3 = (int) (4*Math.random());
            
            if (s3 == 0) {
             s33 = "!";
            } 
            
            else if (s3 == 1) {
             s33 = "#";
            }
            
            else if (s3 == 2) { 
             s33 = "&";
            }
            
            else if (s3 == 3) {
             s33 = "?";
            }
            
              System.out.println("\n \n" + n1 + "" + c1 + n2 + c2 + s33 + n3 + c3);
          }
        } else if (cmd.equalsIgnoreCase("help") && run == false) {
          System.out.println("\n \n———————————————————————————— \n Help-Menu \n———————————————————————————— \n new - Generates a Password \n \n random - Shows you a random \n screenshot someone took\n \n help - Shows this menu \n \n reload - Reloads the script \n \n stop - Stops the script \n————————————————————————————");
        } else if (cmd.equalsIgnoreCase("login") && login == false && run == false) {
          run = true;
          System.out.println("\n \nUsername: ");
        } else if (cmd.equalsIgnoreCase("login") && login == true) {
          System.out.println("\n \nYou're already logged in.");
        }
         else if (cmd.equalsIgnoreCase(user1) && run == true) {
           pwc = true;
            System.out.println("\n \nPassword: ");
         } else if (run == true && !cmd.equalsIgnoreCase(user1) && pwc == false) {
           System.out.println("\nThis user doesn't exist.\n \nUsername: ");
         }
            else if (cmd.equalsIgnoreCase(pswd1) && run == true && pwc == true) {
              System.out.println("\n \nLogin successfull!");
              pwc = false;
              login = true;
              run = false;
        } else if (run == true && !cmd.equalsIgnoreCase(pswd1) && pwc == true) {
          System.out.println("\nIncorrect password. Try again. \n \nPassword: ");
        }
        
        else if (cmd.equalsIgnoreCase("stop") && login == true && run == false) {
        System.out.println("\n \nPowered off.");
         onoff = 0;
        } else if (cmd.equalsIgnoreCase("stop") && login == false && run == false) {
        System.out.println("\n \nPlease login using command 'login' in order to execute this command.");
        }
        
        else if (cmd.equalsIgnoreCase("reload") && login == true && run == false) {
          System.out.println("\n \nReloading...");
          onoff = 2;
        } else if (cmd.equalsIgnoreCase("reload") && login == false && run == false) {
          System.out.println("\n \nPlease login using command 'login' in order to execute this command.");
        } else if (cmd.equalsIgnoreCase("random") && run == false) {
          int z1 = (int) (10*Math.random());
          int z2 = (int) (10*Math.random());
          int z3 = (int) (10*Math.random());
          int z4 = (int) (10*Math.random());
          Random rnd = new Random();
          char b1 = (char) (rnd.nextInt(26) + 'a');
          char b2 = (char) (rnd.nextInt(26) + 'a');

          System.out.println("\n \nhttps://prnt.sc/" + b1 + b2 + z1 + z2 + z3 + z4);
        }
          
  if (onoff == 2) {
      System.out.println("Reload completed");
      onoff = 1;
    }
  
    } catch (IOException e) {
        e.printStackTrace();
    }
   // System.out.println("You entered command: " + cmd);
  }
  
 }
}