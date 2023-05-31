package hibernate.assignment.one.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String movieName;
    private Long movieLength;
    private String movieLang;
    private String ageCertificate;
    private LocalDate releaseDate;
    @ManyToOne
    @JoinColumn(
            name = "director_id",
            referencedColumnName = "id"
    )
    private Director director;
}
