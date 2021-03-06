package com.softserve.edu.hypercinema.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "movie")
public class MovieEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    @NotEmpty
    private String title;

    @Column(nullable = false)
    @NotEmpty
    private String description;

    private int duration;

    private String genre;

    @Column(name = "tmdb_id")
    private double tmdbId;

    @Column(name = "start_rent")
    @DateTimeFormat(pattern = "MM.dd.yyyy")
    private LocalDate startRent;

    // @Temporal(TemporalType.DATE)
    @Column(name = "end_rent")
    @DateTimeFormat(pattern = "MM.dd.yyyy")
    private LocalDate endRent;

    @Column(name = "age_rating")
    private int ageRating;

    @Column(columnDefinition = "DECIMAL(5,2)")
    private BigDecimal price;

    @OneToMany(mappedBy = "movie")
    @JsonIgnore
    private List<SessionEntity> schedule;

}

