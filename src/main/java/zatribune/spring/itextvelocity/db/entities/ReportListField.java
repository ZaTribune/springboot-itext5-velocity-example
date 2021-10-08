package zatribune.spring.itextvelocity.db.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ReportListField {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public ReportListField(String name) {
        this.name = name;
    }

    @ManyToOne
    private ReportList reportList;
}
