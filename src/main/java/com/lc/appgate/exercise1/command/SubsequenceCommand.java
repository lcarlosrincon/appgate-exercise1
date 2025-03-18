package com.lc.appgate.exercise1.command;
import com.lc.appgate.exercise1.domain.SubsequenceService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class SubsequenceCommand implements ApplicationRunner {

    private final SubsequenceService subsequenceService;
    private final Environment environment;

    public SubsequenceCommand(SubsequenceService subsequenceService, Environment environment) {
        this.subsequenceService = subsequenceService;
        this.environment = environment;
    }

    @Override
    public void run(ApplicationArguments args) {
        if (Boolean.parseBoolean(environment.getProperty("spring.application.command-line", "false"))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the source string:");
            String source = scanner.nextLine();
            System.out.println("Enter the target string:");
            String target = scanner.nextLine();
            int result = subsequenceService.numDistinct(source, target);
            System.out.println("Number of distinct subsequences: " + result);
            System.exit(0);
        }
    }
}
