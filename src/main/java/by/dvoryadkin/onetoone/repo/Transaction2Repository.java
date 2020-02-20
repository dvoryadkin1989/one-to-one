package by.dvoryadkin.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import by.dvoryadkin.onetoone.entity.Transaction2;

@Repository
public interface Transaction2Repository extends JpaRepository<Transaction2, Long> {
}
