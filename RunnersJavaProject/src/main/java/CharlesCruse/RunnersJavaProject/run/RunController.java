package CharlesCruse.RunnersJavaProject.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {

    @GetMapping("/")
    String home() {
        return "Welcome to the Runners Java Project!";
    }
}
