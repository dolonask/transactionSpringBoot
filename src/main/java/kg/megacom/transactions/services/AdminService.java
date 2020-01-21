package kg.megacom.transactions.services;

import kg.megacom.transactions.models.Employee;

import java.util.List;

public interface AdminService {

    Employee saveEmp(Employee employee);

    List<Employee > getAllEmps();
}
