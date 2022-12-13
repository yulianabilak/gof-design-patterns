package com.bilak.structural.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class UIServiceAdapter
 * @since 10/2/2022 - 12.57
 **/
public class UIServiceAdapter implements ISkiResortApp {
    private final UIService uiService;

    public UIServiceAdapter(UIService service) {
        uiService = service;
    }

    @Override
    public void displayReceipt(XmlData xmlData) {
        uiService.displayReceipt(convertXmlToJson(xmlData));
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        String data = xmlData.getData();

        Pattern pattern = Pattern.compile("(?<=<)([a-zA-Z]+)(?=>)");
        Matcher matcher = pattern.matcher(data);
        List<String> fieldMatches = new ArrayList<>();
        while (matcher.find()) {
            fieldMatches.add(matcher.group());
        }
        fieldMatches.remove(0);

        pattern = Pattern.compile("(?<=>)(.*)(?=<)");
        matcher = pattern.matcher(data);
        List<String> valueMatches = new ArrayList<>();
        while (matcher.find()) {
            valueMatches.add(matcher.group());
        }

        StringBuilder result = new StringBuilder("{\n  \"");
        for (int i = 0; i < fieldMatches.size(); i++) {
            result.append(fieldMatches.get(i)).append("\": \"").append(valueMatches.get(i)).append("\"");
            if (i != fieldMatches.size()-1) {
                result.append(",\n  \"");
            }
        }
        result.append("\n}");

        return new JsonData(String.valueOf(result));
    }
}
