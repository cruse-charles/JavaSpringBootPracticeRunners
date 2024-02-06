package CharlesCruse.RunnersJavaProject.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    Optional<Run> findById(Integer id) {
        return runs.stream()
                .filter(run -> run.id().equals(id))
                .findFirst();
    }

    void create(Run run) {
        runs.add(run);
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Morning Run", Location.OUTDOOR, LocalDateTime.now(), LocalDateTime.now().plusHours(1), 5));
        runs.add(new Run(2, "Evening Run", Location.INDOOR, LocalDateTime.now(), LocalDateTime.now().plusHours(1), 3));
    }
}
