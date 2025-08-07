package org.example.Repository;

import org.example.Model.EmpModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpRepository  extends MongoRepository<EmpModel, String> {
}
