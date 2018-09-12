package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String rg;

    @Column(unique = true)
    private String cpf;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column
    private Long phone_number;

    @Column
    private String address;

    @Column
    private String password;

    @Column(unique = true)
    private String userName;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getPhone_number() {
        return phone_number;
    }

    public String getAddress() {
        return address;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_number(Long phone_number) {
        this.phone_number = phone_number;
    }
}
