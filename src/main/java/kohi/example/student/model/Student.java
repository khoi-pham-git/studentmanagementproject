package kohi.example.student.model;



import java.time.LocalDate;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Student extends BaseEntity {
    
    @Id @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private LocalDate dob;
    private String address;

    @ManyToOne
    @JoinColumn(name = "classId")
    private ClassRoom classRoom;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}
