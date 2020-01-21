package kg.megacom.transactions.services.impl;

import kg.megacom.transactions.models.Employee;
import kg.megacom.transactions.services.AdminService;
import kg.megacom.transactions.services.common.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public Employee saveEmp(Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmps() {
        return employeeService.findAllEmployees();
    }
}
