package com.greenster.calcumator;

public class Calcumator {

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public String textKV(String key, String value) {
        return "[" + key + "] = " + value;
    }

    public String getVersion() {
        return "1.0 Beta-2";
    }

    public String getDescription() {
        return "Calcumator library for android sample example.";
    }

}
