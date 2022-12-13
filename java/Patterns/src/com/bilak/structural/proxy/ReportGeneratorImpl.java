package com.bilak.structural.proxy;

import com.bilak.domain.Pass;
import com.bilak.domain.Subscription;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class ReportGeneratorImpl
 * @since 10/16/2022 - 16.52
 **/
public class ReportGeneratorImpl implements ReportGenerator {
    private final List<Pass> passes = Arrays.asList(
            new Pass(1, new Subscription(3, "Yuliana Bilak", "timed", 500.5,
                    LocalDateTime.now().minusDays(1)), LocalDateTime.now()),
            new Pass(2, new Subscription(3, "Yuliana Bilak", "timed", 500.5,
                    LocalDateTime.now().minusDays(1)), LocalDateTime.now().plusMinutes(30)),
            new Pass(3, new Subscription(3, "Yuliana Bilak", "timed", 500.5,
                    LocalDateTime.now().minusDays(1)), LocalDateTime.now().plusHours(1)),
            new Pass(4, new Subscription(2, "Bilak", "timed", 500.5,
                    LocalDateTime.now().minusDays(1)), LocalDateTime.now().plusHours(2)),
            new Pass(5, new Subscription(2, "Bilak", "timed", 500.5,
                    LocalDateTime.now().minusDays(1)), LocalDateTime.now().plusHours(3))
    );

    @Override
    public void displayStatisticalReport() {
        Integer idWithMaxPasses = passes.stream()
                .map(Pass::getSubscription)
                .collect(Collectors.groupingBy(Subscription::getId, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println("Number of passes from all time: " + passes.size());
        System.out.println("Most passes are from subscription #" + idWithMaxPasses);
    }

    @Override
    public void displaySensitiveReport() {
        System.out.println(passes);
    }
}
