package CharlesCruse.RunnersJavaProject.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Morning Run", Location.OUTDOOR, LocalDateTime.now(), LocalDateTime.now().plusHours(1), 5));
        runs.add(new Run(2, "Evening Run", Location.INDOOR, LocalDateTime.now(), LocalDateTime.now().plusHours(1), 3));
    }
}
