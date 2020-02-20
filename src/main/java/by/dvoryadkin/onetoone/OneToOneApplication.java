package by.dvoryadkin.onetoone;

import static by.dvoryadkin.onetoone.entity.Status.CREATED;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;
import by.dvoryadkin.onetoone.entity.Payload1;
import by.dvoryadkin.onetoone.entity.Payload2;
import by.dvoryadkin.onetoone.entity.Payload3a;
import by.dvoryadkin.onetoone.entity.Transaction1;
import by.dvoryadkin.onetoone.entity.Transaction2;
import by.dvoryadkin.onetoone.entity.Transaction3a;
import by.dvoryadkin.onetoone.entity.Transaction3b;
import by.dvoryadkin.onetoone.repo.Transaction1Repository;
import by.dvoryadkin.onetoone.repo.Transaction2Repository;
import by.dvoryadkin.onetoone.repo.Transaction3aRepository;
import by.dvoryadkin.onetoone.repo.Transaction3bRepository;

@SpringBootApplication
@EnableJpaRepositories
public class OneToOneApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(OneToOneApplication.class);

    private final Transaction1Repository transaction1Repo;
    private final Transaction2Repository transaction2Repo;
    private final Transaction3aRepository transaction3aRepo;
    private final Transaction3bRepository transaction3bRepo;

    @Autowired
    public OneToOneApplication(Transaction1Repository transaction1Repo, Transaction2Repository transaction2Repo,
                               Transaction3aRepository transaction3aRepo, Transaction3bRepository transaction3bRepo) {
        this.transaction1Repo = transaction1Repo;
        this.transaction2Repo = transaction2Repo;
        this.transaction3aRepo = transaction3aRepo;
        this.transaction3bRepo = transaction3bRepo;
    }

    @Override
    @Transactional
    public void run(String... args) {
        //        retrieveTransaction1();
        //        transaction2Repo.save(createTransaction2());
        //        retrieveTransaction2();
        //        transaction3Repo.save(createTransaction3());
//        retrieveTransaction3a();
        retrieveTransaction3b();
    }

    private void retrieveTransaction1() {
        log.info("Retrieving transaction1...");
        Transaction1 transaction1 = transaction1Repo.findById(3L).orElse(null);
        log.info("Transaction1 retrieved.");
        log.info("Transaction1 is {}", transaction1);
    }

    private void retrieveTransaction2() {
        log.info("Retrieving transaction2...");
        Transaction2 transaction2 = transaction2Repo.findById(1L).orElse(null);
        log.info("Transaction2 retrieved.");
        log.info("Transaction2 is {}", transaction2);
    }

    private void retrieveTransaction3a() {
        log.info("Retrieving transaction3...");
        Transaction3a transaction3a = transaction3aRepo.findById(4L).orElse(null);
        log.info("Transaction2 retrieved.");
        log.info("Transaction2 is {}", transaction3a);
    }

    private void retrieveTransaction3b() {
        log.info("Retrieving transaction3...");
        Transaction3b transaction3b = transaction3bRepo.findById(4L).orElse(null);
        log.info("Transaction2 retrieved.");
        log.info("Transaction2 is {}", transaction3b);
    }

    private Transaction1 createTransaction1() {
        Payload1 payload1 = new Payload1();
        payload1.setPayload("123");

        Transaction1 transaction1 = new Transaction1();
        transaction1.setStatus(CREATED);

        transaction1.setPayload(payload1);
        payload1.setTransaction(transaction1);

        return transaction1;
    }

    private Transaction2 createTransaction2() {
        Payload2 payload2 = new Payload2();
        payload2.setPayload("123");

        Transaction2 transaction2 = new Transaction2();
        transaction2.setStatus(CREATED);

        transaction2.setPayload(payload2);
        payload2.setTransaction(transaction2);

        return transaction2;
    }

    private Transaction3a createTransaction3() {
        Payload3a payload3A = new Payload3a();
        payload3A.setPayload("123");

        Transaction3a transaction3A = new Transaction3a();
        transaction3A.setStatus(CREATED);

        transaction3A.setPayload(payload3A);
        payload3A.setTransaction(transaction3A);

        return transaction3A;
    }

    public static void main(String[] args) {
        SpringApplication.run(OneToOneApplication.class, args);
    }
}
