package player;

public class Player 
{
    private String name;
    private String contactnumb;
    private String emailId;
    private char sym;
    private String address;
    private int age;

    public void setValues(String name,char sym)
    {
        this.name=name;
        this.sym=sym;
    }
 
    public void setValues(String name,char sym,String emailId,String contactnumb,String address,int age)
    {
        this.name=name;
        this.sym=sym;
        this.emailId=emailId;
        this.contactnumb=contactnumb;
        this.address=address;
        this.age=age;
    }

    public void setValues(String name,int age,char sym )
    {
        this.name=name;
        this.age=age;
        this.sym=sym;
    }

    public void getValues()
    {
        System.out.println("name of player :"+name);
        System.out.println("symbol: "+sym);
    }

    public String getname()
    {
       return this.name;
    }

    public int getage()
    {
        return this.age;
     }

     public char getsym()
     {
        return this.sym;
     }
}
