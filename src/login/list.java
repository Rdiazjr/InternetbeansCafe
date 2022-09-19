/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Rogelio
 */
public class list {

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String first,last,email,add;
    private int mobilenum,hrs,mins;
    
    public list (String firstname, String lastname, String emailAdd,String address, int mobile,int hrs,int mins){
    this.first= firstname; 
    this.last= lastname;
    this.mobilenum= mobile;
    this.email= emailAdd;
    this.add= address;
    this.hrs=hrs;
    this.mins=mins;
    }
    public String getfirst(){
    return first;
    }
    public String getlast(){
    return last;
    }
     public String getemail(){
    return email;
    }
     public int getmobile(){
    return mobilenum;
    }
      public String getadd(){
    return add;
    }
       public int gethrs(){
    return hrs;
    }
       public int getmins(){
    return mins;
    }
       
       
    
    
    
}

