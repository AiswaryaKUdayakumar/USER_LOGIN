package com.UST.UserLogin.Repository;

import com.UST.UserLogin.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, java.lang.String> {
}
