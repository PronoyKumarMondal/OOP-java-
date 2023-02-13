import java.util.Scanner;
public class P1 {
    private string name;
    private int age;
    private int Id;
    public static void main(String[] args) {
        
        P1 s1 = new P1();
        s1.insert();
        s1.display();
    }
    public void insert()
    {
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        age = input.nextInt();
        Id = input.nextInt();
    }
    public void display()
    {
        System.out.println("NAME:"+name+"AGE:"+age+"ID:"+Id);
    }
    
}
