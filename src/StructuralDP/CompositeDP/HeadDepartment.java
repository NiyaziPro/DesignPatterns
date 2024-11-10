package StructuralDP.CompositeDP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HeadDepartment implements Department {

    public List<Department> subDepartment = new ArrayList<>();

    public void addDepartment(Department department){
        this.subDepartment.add(department);
    }

    @Override
    public String getName() {
        return subDepartment.stream().map(d ->d.getName()).collect(Collectors.joining(","));
    }

    @Override
    public List<String> getEmployees() {
        return this.subDepartment.stream().flatMap(d->d.getEmployees().stream()).collect(Collectors.toList());
    }
}
