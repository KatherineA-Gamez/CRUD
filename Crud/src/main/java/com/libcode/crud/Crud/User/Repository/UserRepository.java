package com.libcode.crud.Crud.User.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libcode.crud.Crud.User.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    
}
