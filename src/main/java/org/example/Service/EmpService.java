package org.example.Service;


import org.example.Model.EmpModel;
import org.example.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    // @Autowired → Automatically injects the  EmpRepository object
    @Autowired
    EmpRepository empRepository;


    public EmpModel createEmp(EmpModel empModel){
        return empRepository.save(empModel);
    }

    // fetch emp
    public List<EmpModel>getAllEmp(){
        return empRepository.findAll();
    }

    public Optional<EmpModel>getEmpById(String id){
        return empRepository.findById(id);
    }

public EmpModel updateEmp(String id, EmpModel updateEmp){
        updateEmp.setId(id);
        return empRepository.save(updateEmp);
}

public void deleteEmp(String id){
        empRepository.deleteById(id);
    }

}
