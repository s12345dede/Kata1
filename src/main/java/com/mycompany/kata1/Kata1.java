
package com.mycompany.kata1;

/**
 *
 * @author said
 */

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {     
        Person person = new Person("Saidd", LocalDate.of(2001, 4, 3));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}