package by.dvoryadkin.onetoone.entity;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payload2 {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String payload;

    @OneToOne(mappedBy = "payload", cascade = ALL, fetch = LAZY)
    private Transaction2 transaction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Transaction2 getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction2 transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Payload1{" + "id=" + id + ", payload='" + payload + '\'' + '}';
    }
}
