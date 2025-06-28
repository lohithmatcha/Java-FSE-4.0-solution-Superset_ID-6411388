package com.lohith.example;

public class MyService {
    private ExternalAPI api;

    public MyService(ExternalAPI tmp) {
        api = tmp;
    }

    public String fetchData() {
        String input = api.getData();
        return "Processed: " + input;
    }
}
