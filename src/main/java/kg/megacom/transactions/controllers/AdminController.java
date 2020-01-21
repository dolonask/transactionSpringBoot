package kg.megacom.transactions.controllers;

import kg.megacom.transactions.models.Employee;
import kg.megacom.transactions.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/employee/save", method = RequestMethod.POST)
    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(adminService.saveEmp(employee), HttpStatus.OK);
    }


    @RequestMapping(value = "/employee/all", method = RequestMethod.GET)
    public ResponseEntity<?> getEmployees(){
        return new ResponseEntity<>(adminService.getAllEmps(), HttpStatus.OK);
    }

}
