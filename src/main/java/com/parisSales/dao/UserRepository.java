package com.parisSales.dao;


import com.parisSales.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "users", path= "users")
public interface UserRepository extends JpaRepository <User, Long> {
    Page<User> findByPasswordContaining(@RequestParam("name") String name, Pageable pageable);
}
