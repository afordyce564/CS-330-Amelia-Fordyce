import java.util.Scanner;

class DemoLoops{
public static void main(String [] argv){
    Scanner sc = new Scanner(System.in);

    System.out.println("Demo while sentinel loop");
    String kg = "yes";
    while(kg.equals("yes")){
        // statements;
        System.out.println("Keep going? yes/no");
        kg = sc.next();
    }	
    
    // for loop
    System.out.println("Demo for counting loop");
    for (int i=0;i<3;i++){
        //statements;
        System.out.println(i);
    }	
    
    // for iterator loop
    System.out.println("Demo for each item loop");
    int [] a = {10,20,30};

    for (int item:a){
        //statements;
        System.out.println(item);
    }


    /// anything you can do with a while loop, you can do with a for loop
    /// and vice versa

    //for sentinel loop
    System.out.println("Demo for sentinel loop... not natural");
    for(String kgf = "yes";kgf.equals("yes");){
        // statements;
        System.out.println("Keep going? yes/no");
        kgf = sc.next();
    }	
    
    // while counting  loop
    System.out.println("Demo for counting loop");
    int i=0;
    while(i<3){
        //statements;
        System.out.println(i);
        i++;
    }	
sc.close();

}
}