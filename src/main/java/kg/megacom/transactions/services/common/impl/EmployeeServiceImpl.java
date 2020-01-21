package kg.megacom.transactions.services.common.impl;

import kg.megacom.transactions.dao.EmployeeRepo;
import kg.megacom.transactions.dao.PhoneRepo;
import kg.megacom.transactions.models.Employee;
import kg.megacom.transactions.models.Phone;
import kg.megacom.transactions.services.common.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private PhoneRepo phoneRepo;

    @Override
    public Employee saveEmployee(Employee employee) {

        List<Phone> phones = employee.getPhones();

        employee = employeeRepo.save(employee);

        if(employee.getId()!= null){
            throw new RuntimeException("aajshdbajsd");
        }

        Employee finalEmployee = employee;
        phones.stream()
                .forEach(x->x.setEmployee(finalEmployee));

        phones = phoneRepo.saveAll(phones);

        employee.setPhones(phones);
        return employee;
    }
    @Override
    public List<Employee> findAllEmployees() {

        List<Employee> employees = employeeRepo.findAll();

        employees.stream()
                .forEach(x->{
                    List<Phone> phones = phoneRepo.findAllByEmployee(x);
                    x.setPhones(phones);
                });

        return employees;
    }


}
