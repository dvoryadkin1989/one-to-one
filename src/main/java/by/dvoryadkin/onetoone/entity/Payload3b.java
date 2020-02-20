package by.dvoryadkin.onetoone.entity;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payload3")
public class Payload3b {
    @Id
    private Long id;

    private String payload;

    @OneToOne(mappedBy = "payload", cascade = ALL, fetch = LAZY)
    private Transaction3b transaction;

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

    public Transaction3b getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction3b transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Payload1{" + "id=" + id + ", payload='" + payload + '\'' + '}';
    }
}
