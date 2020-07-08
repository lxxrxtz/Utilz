import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    
    int onoff = 1;
    
while (onoff == 1) {
  
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  
    System.out.print("\n \nPlease enter a command: ");
    String cmd = null;
    
    try {
        cmd = reader.readLine();
        if (cmd.equalsIgnoreCase("new")) {
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
        } else if (cmd.equalsIgnoreCase("help")) {
          System.out.println("\n \n———————————————————————————— \n Help-Menu \n———————————————————————————— \n new - Generates a Password \n help - Shows this menu \n reload - Reloads the script \n stop - Stops the script \n————————————————————————————");
        } else if (cmd.equalsIgnoreCase("stop")) {
        System.out.println("Powered off.");
         onoff = 0;
        } else if (cmd.equalsIgnoreCase("reload")) {
          System.out.println("\n \nReloading...");
          onoff = 2;
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