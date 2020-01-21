package kg.megacom.transactions.dao;


import kg.megacom.transactions.models.Employee;
import kg.megacom.transactions.models.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepo extends JpaRepository<Phone, Long> {

    List<Phone> findAllByEmployee(Employee employee);

}
