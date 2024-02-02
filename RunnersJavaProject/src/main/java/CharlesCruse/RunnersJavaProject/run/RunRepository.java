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

    void update(Run run) {
        Optional<Run> existingRun = findById(run.id());
        if(existingRun.isEmpty()) {
            throw new IllegalArgumentException("Run not found");
        }
        runs.remove(existingRun.get());
        runs.add(run);
    }

    void delete(Integer id) {
        Optional<Run> existingRun = findById(id);
        if(existingRun.isEmpty()) {
            throw new IllegalArgumentException("Run not found");
        }
        runs.remove(existingRun.get());
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Morning Run", Location.OUTDOOR, LocalDateTime.now(), LocalDateTime.now().plusHours(1), 5));
        runs.add(new Run(2, "Evening Run", Location.INDOOR, LocalDateTime.now(), LocalDateTime.now().plusHours(1), 3));
    }
}
