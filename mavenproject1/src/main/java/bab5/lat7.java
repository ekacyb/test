/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author A-19
 */
public class lat7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Tuliskan pesan di sini, saya akan tampilkan berulang.");
        System.out.print("Pesan: ");
        String message = keyboard.nextLine();

        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;

        if (randomNumber < 10) {
            System.out.println("Pesan akan diulang sebanyak " + randomNumber + " kali");
            for (int n = 0; n < randomNumber; n++) {
                System.out.println(n + ". " + message);
            }
        } else {
            System.out.println("Bilangan random yang didapat terlalu besar, yaitu "+randomNumber);
            System.out.println("Pesan akan diulang 5 kali");
            for (int n = 0; n < 5; n++) {
                System.out.println(n + ". " + message);
            }
        }
    }
}