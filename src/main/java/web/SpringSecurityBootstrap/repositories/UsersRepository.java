package web.SpringSecurityBootstrap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import web.SpringSecurityBootstrap.model.User;


@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
    @Query("select c from User c join fetch c.roles where c.username = :username")
    User findByUsername(@Param("username") String username);
}
