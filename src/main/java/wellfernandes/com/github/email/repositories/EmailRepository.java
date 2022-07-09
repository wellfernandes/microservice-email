package wellfernandes.com.github.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wellfernandes.com.github.email.models.EmailModel;

@Repository
public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
