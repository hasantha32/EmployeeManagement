package com.example.EmployeeManagement.repository;

import com.example.EmployeeManagement.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends MongoRepository<Member, String> {

}
