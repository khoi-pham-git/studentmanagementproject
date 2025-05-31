package kohi.example.student.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course extends BaseEntity{
    
    @Id @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;

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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Enrollment> getEnrollments() {
        return enrollments;
    }
    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
    
}
