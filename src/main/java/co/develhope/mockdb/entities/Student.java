package co.develhope.mockdb.entities;

import javax.persistence.*;

@Entity
@Table

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    private String name;
    private String surname;
    @Column(unique = true)
    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}