package by.dvoryadkin.onetoone.entity;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transaction3")
public class Transaction3a {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(insertable = false)
    private LocalDateTime created;

    @Enumerated(STRING)
    private Status status;

    @OneToOne(mappedBy = "transaction", cascade = ALL, fetch = LAZY, optional = false)
    private Payload3a payload;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Payload3a getPayload() {
        return payload;
    }

    public void setPayload(Payload3a payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Transaction1{" + "id=" + id + ", created=" + created + ", status=" + status + ", payload=" + payload + '}';
    }
}
