package edu.rsi.game.levels;

import edu.rsi.game.models.Employee;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import edu.rsi.game.utils.Data;
import java.util.Map;
import java.util.stream.Collectors;

public class Level3 {
	public static void main(String[] args) {
        List<Employee> employees = Data.employees();
		
	/* TO DO 1: Retourner une chaine de caractère qui contient tous les noms des employés */	
        System.out.println("******TO DO 1*********");
	String names = employees.stream().map(e->e.getName()).reduce("", (a,b)->a+b);
		System.out.println(names);				
	/* TO DO 2: Retourner une chaine de caractère©re qui contient tous les noms des employés en majuscule separés par # */	
	   System.out.println("******TO DO 2 *********");
	String namesMajSplit = employees.stream().map(e->e.getName()).map(String::toUpperCase).reduce("#", (a,b)->a+b);
		System.out.println(namesMajSplit);
	/* TO DO 3: Retourner une set d'employés*/
	   System.out.println("******TO DO 3 *********");
	Set<Employee> emps = employees.stream().collect(Collectors.toSet());
	emps.forEach(a -> System.out.println(a));
	/* TO DO 4: Retourner une TreeSet d'employés (tri par nom) */
	   System.out.println("******TO DO 4 *********");
	TreeSet<Employee> emps2 = employees.stream()
          .collect(Collectors.toCollection(()-> new TreeSet<Employee>((a,b)->a.getName().compareTo(b.getName()))));
		emps2.forEach(a -> System.out.println(a));
	/* TO DO 5: Retourner une Map qui regroupe les employés par salaire */
	   System.out.println("******TO DO 5 *********");
	Map<Integer, List<Employee>> map = employees.stream().
          collect(Collectors.groupingBy(Employee::getSalary));
			map.entrySet().forEach(entry->{
			    System.out.println(entry.getKey() + " " + entry.getValue());  
			 });
	/* TO DO 6: Retourner une Map qui regroupe les nom des employés par salaire */
	   System.out.println("******TO DO 6 *********");
	Map<Integer, String> map2 = employees.stream().collect(Collectors.toMap(Employee::getSalary, Employee::getName, (n1,n2) -> n1 +" -- "+n2));
	map2.entrySet().forEach(entry->{
	    System.out.println(entry.getKey() + " " + entry.getValue());  
	 });
	/* TO DO 7: Retourner le  min, max,average, sum,count des salaires */
	   System.out.println("******TO DO 7 *********");
	String s = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).toString();
				System.out.println(s);
	}
}
