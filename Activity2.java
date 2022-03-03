package CANDYMACHINE;
//import java.util.Arrays;
import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int itemsToBuy;
    int totalCost = 0;

    System.out.println("Product Cost");
    System.out.println("[1] Chubby                30");
    System.out.println("[2] Frutos                   45");
    System.out.println("[3] Happy Dreams   50");
    System.out.println("[4] Sneakers              90");
    System.out.println("[5] Kit kat                   99");
    System.out.println("[6] M&M's                 100");
    System.out.println("[7] V Fresh                  25");
    System.out.println("[8] Butterkist              37");
    System.out.println("[9] Hershey Kisses  100");
    System.out.println("[10] Choey Choco     45");
    System.out.println();
    
    System.out.print("How many items to buy? : ");
    itemsToBuy = sc.nextInt();
    
    int[] itemsBought = new int[itemsToBuy] ;
    
    System.out.println("Enter product numbers: ");
    for(int i = 0; i <itemsToBuy; i++) 
        itemsBought[i] = sc.nextInt();  

     // Display items bought
    System.out.println();
    System.out.println("Items bought: ");
    for(int i = 0; i <itemsToBuy; i++) {
        if(itemsBought [i] == 1) {
            System.out.println("Chubby               30");
        } else if (itemsBought[i] == 2) {
            System.out.println("Frutos                 45");
        } else if (itemsBought[i] == 3) {
            System.out.println("Happy Dreams 50");
        } else if (itemsBought[i] == 4) {
            System.out.println("Snickers             90 ");
        } else if (itemsBought[i] == 5) {
            System.out.println("Kit Kat                99");
        } else if (itemsBought[i] == 6) {
            System.out.println("M&M's              100");
        } else if (itemsBought[i] == 7) {
            System.out.println("V Fresh              25");
        } else if (itemsBought[i] == 8) {
            System.out.println("Butterkist          37");
        } else if (itemsBought[i] == 9) {
            System.out.println("Hershey Kisses 100");
        } else if (itemsBought[i] == 10) {
            System.out.println("Choey Choco     45");
        }
    }
        System.out.println();

        System.out.print("TotalCost: ");
        for(int i = 0; i < itemsToBuy; i++) {
            if (itemsBought[i] == 1) {
                totalCost += 30;
            } else if (itemsBought[i] == 2) {
                totalCost += 45;
            } else if (itemsBought[i] == 3) {
                totalCost += 50;
            } else if (itemsBought[i] == 4) {
                totalCost += 90;
            } else if (itemsBought[i] == 5) {
                totalCost += 99;
            } else if (itemsBought[i] == 6) {
                totalCost += 100;
            } else if (itemsBought[i] == 7) {
                totalCost += 25;
            } else if (itemsBought[i] == 8) {
                totalCost += 37;
            } else if (itemsBought[i] == 9) {
                totalCost += 100;
            } else if (itemsBought[i] == 10) {
                totalCost += 45;
            }
        }
        System.out.print(totalCost);
        
    }
}