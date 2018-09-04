package model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@SecondaryTable(
        name = "exercises",
        pkJoinColumns = {
                @PrimaryKeyJoinColumn(name = "id")
        })

public class Training {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToMany
    @JoinTable(
            name="training_exercises",
            joinColumns= {
                @JoinColumn(name="training_id")
            },
            inverseJoinColumns = {
                @JoinColumn(name="exercise_id")
            })
    private List<Exercises> execises;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List getExecises() {
        return execises;
    }

    public void setExecises(List execises) {
        this.execises = execises;
    }
}
