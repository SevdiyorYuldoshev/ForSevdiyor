package MainInstagram;

import java.util.Scanner;

public class InstagramPage {
    public static void main(String[] args) {Menu();
    }
    public static void Menu(){
        UserManager userManager = new UserManager();
        int num;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("ism kiriting");
            String name = scan.next();
            System.out.println("username kiriting");
            String userName = scan.next();
            System.out.println("Tel kiriting");
            String phoneNumber = scan.next();
            System.out.println("email kiriting");
            String email = scan.next();


            User user = new User(name, userName, phoneNumber, email);
            System.out.println(userManager.addUser(user));

            System.out.println(userManager.getAllUser());

            System.out.println("username kiriting");
            System.out.println(userManager.updateUser(scan.next()));


            System.out.println("o'chiriladigan username kiriting");

            System.out.println(userManager.deleteUser(scan.next()));

            System.out.println("Amalni davom ettirasizmi ?  1 / 0");
            num = scan.nextInt();
        } while (num == 1);
        System.out.println("Tashakkur");
    }
}

