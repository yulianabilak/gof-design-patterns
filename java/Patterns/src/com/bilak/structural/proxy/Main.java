package com.bilak.structural.proxy;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 10/16/2022 - 15.38
 **/
public class Main {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGeneratorProxy(Role.ADMIN);
        reportGenerator.displayStatisticalReport();
        System.out.println();
        reportGenerator.displaySensitiveReport();
    }
}
