package planner.api.activity;

import planner.api.trip.Trip;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Entity
@Table(name="activities")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDateTime occurs_at;

    @ManyToOne
    @JoinColumn(name="trip_id", nullable = false)
    private Trip trip;

    public Activity(String title, String occurs_at, Trip trip){
        this.title = title;
        this.occurs_at = LocalDateTime.parse(occurs_at, DateTimeFormatter.ISO_DATE_TIME);
        this.trip = trip;
    }

}



