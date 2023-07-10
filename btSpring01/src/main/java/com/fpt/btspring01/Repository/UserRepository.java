package com.fpt.btspring01.Repository;

import com.fpt.btspring01.Model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user, Long> {

}
