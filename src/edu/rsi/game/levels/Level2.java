package edu.rsi.game.levels;

import edu.rsi.game.models.Employee;
import edu.rsi.game.utils.Data;

import java.util.List;
import java.util.stream.Collectors;

public class Level2 {

    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

        /* TO DO 1: Retourner le nombre des employ�s dont le nom commence avec n */
        System.out.println("******TO DO 1 *********");

        long nbr = employees.stream().filter(e -> e.getName().startsWith("n")).count();
        System.out.println(nbr);

        /* TO DO 2: Retourner la somme des salaires de tous les employ�s (hint: mapToInt) */
        System.out.println("******TO DO 2 *********");
        long sum = employees.stream().mapToInt(e -> e.getSalary()).sum();
System.out.println(sum);
        /* TO DO 3: Retourner la moyenne des salaires des employ�s dont le nom commence avec s */
        System.out.println("******TO DO 3 *********");
        double average = employees.stream().mapToInt(e -> e.getSalary()).average().getAsDouble();
System.out.println(average);
        /* TO DO 4: Retourner la liste de tous les employ�s  */
        System.out.println("******TO DO 4 *********");
        List<Employee> emps = employees.stream().collect(Collectors.toList());
        	emps.forEach(e -> System.out.println(e));
        /* TO DO 5: Retourner la liste des employ�s dont le nom commence par s */
        System.out.println("******TO DO 5 *********");
        List<Employee> emps2 = employees.stream().filter(e -> e.getName().startsWith("s")).collect(Collectors.toList());
        	emps2.forEach(a -> System.out.println(a));
        /* TO DO 6: Retourner true si il y a au min un employ� dont le salaire > 1000, false si non
         */   System.out.println("******TO DO 6 *********");
        boolean test = employees.stream().anyMatch(e -> e.getSalary() > 1000);
        	System.out.println(test);
        /* TO DO 7: Afficher le premier employ� dont le nom commence avec s avec deux mani�res diff�rentes */
        /*First way*/
        System.out.println("******TO DO 7 first way *********");
        employees.stream().filter(e -> e.getName().startsWith("s")).limit(1).forEach(e -> System.out.println(e));
        /*Second way*/
        System.out.println("******TO DO 7 second way*********");
        employees.stream().filter(e -> e.getName().startsWith("s")).findFirst().ifPresent(System.out::println);
                
        /* TO DO 8: Afficher le second employ� dont le nom commence avec s */
        System.out.println("******TO DO 8 *********");
        employees.stream().filter(e -> e.getName().startsWith("s")).skip(1).limit(1).forEach(System.out::println);
			

    }
}
