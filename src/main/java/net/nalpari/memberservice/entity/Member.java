package net.nalpari.memberservice.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table
public class Member implements Serializable {

    private static final long serialVersionUID = 7293232970830630649L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;
    @Column
    private String userId;
    @Column
    private String userPw;
    @Column
    private String userName;
    @Column
    private int age;
    @Column
    private String phoneNumber;
    @Column
    private String address;
    @Column(columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgstDtm = new Date();
}
