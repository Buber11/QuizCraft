package main.QuizCraft.repository;

import main.QuizCraft.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByUsername(String username);

    @Query("SELECT u FROM User u JOIN FETCH u.decks WHERE u.username = :username")
    Optional<User> findByUsernameWithDeck(@Param("username") String username);


}
