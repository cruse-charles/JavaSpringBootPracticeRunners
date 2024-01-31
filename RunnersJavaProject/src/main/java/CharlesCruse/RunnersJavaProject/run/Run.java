package CharlesCruse.RunnersJavaProject.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        @NotEmpty
        String title,
        Location location,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        @Positive
        Integer miles
    ) {

    public Run {
        if(startedOn.isAfter(completedOn)) {
            throw new IllegalArgumentException("Run cannot end before it starts");
        }
    }
}
