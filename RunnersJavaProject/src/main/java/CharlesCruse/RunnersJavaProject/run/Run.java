package CharlesCruse.RunnersJavaProject.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        Location location,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles
    ) {
}
