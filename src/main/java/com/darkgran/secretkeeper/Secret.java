package com.darkgran.secretkeeper;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="secrets")
public class Secret {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Timestamp timestamp;

    @Convert(converter = AttributeEncryptor.class)
    private String secret;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

}
