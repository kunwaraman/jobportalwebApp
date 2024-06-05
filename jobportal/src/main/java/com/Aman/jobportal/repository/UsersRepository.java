package com.Aman.jobportal.repository;

import com.Aman.jobportal.entity.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository  extends JpaRepository<Users,Integer> {

}
