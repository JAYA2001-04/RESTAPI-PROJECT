package com.example.project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.SwiggyModel;
/*@Repository-is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects  
JPA Repository is mainly used for managing the data in a Spring Boot Application*/
/*JpaRepository<Table,Primarykey datatype>
/*JpaRepository<SwiggyModel,Integer>*/


@Repository
public interface RestaturantRepository extends JpaRepository<SwiggyModel,Integer> {



}
