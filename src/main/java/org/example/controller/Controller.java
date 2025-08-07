package org.example.controller;


import org.example.Model.EmpModel;
import org.example.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController


@RequestMapping("employee")
public class Controller {


    @Autowired
    private EmpService empService;

    @PostMapping
    public EmpModel createEmp(@RequestBody  EmpModel empModel){
     return empService.createEmp(empModel);
    }

    public List<EmpModel>getallEmp(){
        return empService.getAllEmp();
    }

    @RequestMapping("/{Id}")
    public Optional<EmpModel>getEmpById(@PathVariable String Id){
        return empService.getEmpById(Id);
    }

    public EmpModel updateEmp(@PathVariable String id, @RequestBody EmpModel updateEmp){

        return empService.updateEmp(id, updateEmp);
    }

    @DeleteMapping("/{id}")
    public String deleteEmp(@PathVariable String id){
        empService.deleteEmp(id);
        return "emp with id"+ id +"get deleted.";
    }


}
