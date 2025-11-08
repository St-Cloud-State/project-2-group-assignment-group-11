import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.io.*;


public class WarehouseContext{
  
//Prompts the user and retrieves their input
public String getToken(String prompt){ 
  do {
      try {
        System.out.println(prompt);
        String line = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(line,"\n\r\f");
        if (tokenizer.hasMoreTokens()) {
          return tokenizer.nextToken();
        }
      } catch (IOException ioe) {
        System.exit(0);
      }
    } while (true);
} 
  
//Prompts the user with yes or no and returns bool
private boolean yesOrNo(String prompt){
   String more = getToken(prompt + " (Y|y)[es] or anything else for no");
    if (more.charAt(0) != 'y' && more.charAt(0) != 'Y') {
      return false;
    }
    return true;
}

//Stores user type (clerk/manager/client)
public void setLogin(int code){
  
} 
//Returns user type
public int getLogin(){
  
} 
 //Stores user login ID
public void setUser(String uID){
  
}
public String getUser(){
  
}
//Initiates the change of state based on current and ddesired state
public void changeState(int transition){
  
} 

//Exits the program
private void terminate(){
  
} 

//Runs the state
public void process(){
  
}

//Creates the singleton instance of the class
public static WarehouseContext instance(){
  
}

}
