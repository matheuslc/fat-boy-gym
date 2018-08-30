package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class UserModel {
    @Id
    private Long id;

    private String name;

    private Long rg;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private Long phone_number;

    private String address;
}
