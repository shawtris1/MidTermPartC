package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String id = input.nextLine();
        System.out.println("What is your favourite genre(Comedy, Drama, Action or Mystery?");
        String genre = input.nextLine();
        UserProfile a = new UserProfile (id,genre);
        System.out.println(a.getUserID() +  " " + a.getGenre());
    }
 }
