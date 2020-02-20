package by.dvoryadkin.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import by.dvoryadkin.onetoone.entity.Transaction3b;

@Repository
public interface Transaction3bRepository extends JpaRepository<Transaction3b, Long> {
}
