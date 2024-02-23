/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;



public class Days {

    // Define the Day enum inside the Days class, but outside any method
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Iterate over the values of the Day enum and print each one
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}