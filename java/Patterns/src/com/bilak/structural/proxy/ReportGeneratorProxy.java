package com.bilak.structural.proxy;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class ReportGeneratorProxy
 * @since 10/16/2022 - 16.52
 **/
public class ReportGeneratorProxy implements ReportGenerator {
    private ReportGeneratorImpl reportGenerator;
    private final Role accessRole;

    public ReportGeneratorProxy(Role accessRole) {
        this.accessRole = accessRole;
    }

    @Override
    public void displayStatisticalReport() {
        if (reportGenerator == null) {
            reportGenerator = new ReportGeneratorImpl();
        }
        reportGenerator.displayStatisticalReport();
    }

    @Override
    public void displaySensitiveReport() {
        if (accessRole == Role.ADMIN) {
            if (reportGenerator == null) {
                reportGenerator = new ReportGeneratorImpl();
            }
            reportGenerator.displaySensitiveReport();
        }
        else {
            System.out.println("You don't have rights to view sensitive report.");
        }
    }
}
