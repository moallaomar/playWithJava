package edu.rsi.game.levels;

import edu.rsi.game.models.Employee;
import edu.rsi.game.utils.Data;

import java.util.List;

public class Level1 {

    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

        /* TO DO 1: Afficher tous les employés*/
        
        
        System.out.println("******TO DO 1 *********");
        employees.stream().forEach(e -> System.out.println(e));

        /*
         * TO DO 2: Afficher les employés dont le nom commence par la lettre n
         */
        System.out.println("******TO DO 2 *********");

        employees.stream().filter(e -> e.getName().startsWith("n")).forEach(System.out::println);

        /*
         * TO DO 3: Afficher les employés dont le nom commence par la lettre n
         * et le salaire> 1000
         */
        System.out.println("******TO DO 3 *********");

        employees.stream().
                filter(e -> e.getName().startsWith("n"))
                .filter(e -> e.getSalary() > 1000)
                .forEach(System.out::println);

        /*
         * TO DO 4: Afficher les employés dont le nom commence par la lettre s
         * triés par salaire
         */
        System.out.println("******TO DO 4 *********");

        employees.stream().filter(e -> e.getName().startsWith("s")).sorted((a, b) -> a.getSalary() - b.getSalary())
                .forEach(System.out::println);

        /*
         * TO DO 5: Afficher les noms des employés dont le salaire > 600 avec 2
         * manières différentes
         */
        /* First Way */
        System.out.println("******TO DO 5 *********");

        employees.stream().filter(e ->e.getSalary()>600).forEach(e->System.out.println(e.getName()));
        /* Second Way */
        employees.stream().filter(e ->e.getSalary()>600).map(Employee::getName /*e->e.getName()*/)
                .forEach(System.out::println);

        /*
         * TO DO 6: Ajouter 200e pour les employés dont le nom commence avec m
         * et les affichés ensuite
         */
        System.out.println("******TO DO 6 *********");

        employees.stream()
               .filter(e ->e.getName().startsWith("m"))
              .forEach(e->  {  
                  e.setSalary(e.getSalary()+200);
                  System.out.println(e);
        });

    }
}
