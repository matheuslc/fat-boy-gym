package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
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
