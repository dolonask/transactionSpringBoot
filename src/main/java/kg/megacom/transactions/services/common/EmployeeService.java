package kg.megacom.transactions.services.common;

import kg.megacom.transactions.models.Employee;

import java.util.List;

public interface EmployeeService {


    Employee saveEmployee(Employee employee);

    List<Employee> findAllEmployees();
}
