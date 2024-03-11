package player;

import java.util.Scanner;

public class Player
 {
     String name;
     String contactno;
     String emailId;
     String address;
     int age;

    public void setPlayerDetails(String name,String contactno,String emailId,String address,int age){
        this.name=name;
        this.emailId=emailId;
        this.contactno=contactno;
        this.address=address;
        this.age=age;
    }
    public void setNameAndage(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setNameAndagecontactno(String name,String contactno,int age){
        this.name=name;
        this.age=age;
        this.contactno=contactno;
    }

    public void setNameAndageaddress(String name,String address,int age){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    
    public void setName(String name){
        this.name=name;
    }

     public void  getNameandAge(){
        System.out.println("player name:"+this.name);
        System.out.println("age "+ this.age);
    }
    

    public void getNameandAgeContactno(){
        System.out.println("player name:"+this.name);
        System.out.println("contact number"+ this.contactno);
        System.out.println("age "+ this.age);
    }

    public void getNameandAgeAddress(){
        System.out.println("player name:"+this.name);
        System.out.println("address "+this.address);
        System.out.println("age "+ this.age);
    }

  public String getName(){
    return this.name;
  }

    public void getDetails(){
        System.out.println("player name:"+this.name);
        System.out.println("contact number"+ this.contactno);
        System.out.println("emailId "+ this.emailId);
        System.out.println("address "+this.address);
        System.out.println("age "+ this.age);
    }


    public void setDetailsfromUser(Player p)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("player details");
       System.out.println("enter player name");
      String name=sc.nextLine();
      System.out.println("enter player address");
      String address =sc.nextLine();
      System.out.println("enter player no");
      String contactno =sc.nextLine();
      System.out.println("enter player email");
      String emailId=sc.nextLine();
      System.out.println("enter player age");
      int age=sc.nextInt();
         //p.setNameAndage(name,age);
         p.setPlayerDetails(name,contactno,emailId,address,age);  
    }
      

}
