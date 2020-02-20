package by.dvoryadkin.onetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import by.dvoryadkin.onetoone.entity.Transaction1;

@Repository
public interface Transaction1Repository extends JpaRepository<Transaction1, Long> {
}
