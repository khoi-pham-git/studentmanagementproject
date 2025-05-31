package kohi.example.student.model;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role extends BaseEntity {
    
    @Id @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
