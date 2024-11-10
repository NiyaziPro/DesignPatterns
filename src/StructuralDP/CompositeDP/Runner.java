package StructuralDP.CompositeDP;

import java.util.ArrayList;
import java.util.List;

import static CreationalDP.AbstractFactoryDP.Color.*;

public class Runner {
    /*
    Composite Pattern (Structural)
Purpose: Compose objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly.
Use case: Building hierarchical structures, such as files and folders in a filesystem.
Example: A graphic editor where shapes (like lines, circles) can be grouped into a complex shape.

Composite-Muster (Strukturmuster)
Zweck: Objekte zu Baumstrukturen zusammenfassen, um Teil-Ganzes-Hierarchien darzustellen, sodass Clients individuelle Objekte und Kompositionen einheitlich behandeln können.
Anwendungsfall: Aufbau hierarchischer Strukturen wie Dateien und Ordner in einem Dateisystem.
Beispiel: Ein Grafikeditor, in dem Formen (z. B. Linien, Kreise) zu einer komplexen Form gruppiert werden können.
     */

    public static void main(String[] args) {

        Finance finance = new Finance();
        Sales sales = new Sales();

        List<String> allEmployees = new ArrayList<>();

        finance.getEmployees().forEach(t -> allEmployees.add(t));
        sales.getEmployees().forEach(t -> allEmployees.add(t));

        System.out.println("allEmployees = " + allEmployees);

        /////////////////////////////////////////////////////////

        HeadDepartment department = new HeadDepartment();
        department.addDepartment(finance);
        department.addDepartment(sales);

        System.out.println(BG_BRIGHT_GREEN + BLACK + "Names of Department : " + department.getName() + RESET);
        System.out.println(BG_BRIGHT_YELLOW + BLACK + "Employees : " + department.getEmployees() + RESET);


    }
}
