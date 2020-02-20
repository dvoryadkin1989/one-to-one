package by.dvoryadkin.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import by.dvoryadkin.onetoone.entity.Transaction3a;

@Repository
public interface Transaction3aRepository extends JpaRepository<Transaction3a, Long> {
}
