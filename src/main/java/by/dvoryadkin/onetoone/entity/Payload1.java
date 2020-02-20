package by.dvoryadkin.onetoone.entity;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Payload1 {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String payload;

    @OneToOne(cascade = ALL, fetch = LAZY, optional = false)
    @JoinColumn(name = "transaction_id", referencedColumnName = "id")
    private Transaction1 transaction;

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

    public Transaction1 getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction1 transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Payload1{" + "id=" + id + ", payload='" + payload + '\'' + '}';
    }
}
