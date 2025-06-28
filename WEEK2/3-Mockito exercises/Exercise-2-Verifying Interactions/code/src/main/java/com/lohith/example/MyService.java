package com.lohith.example;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi tmp) {
        api = tmp;
    }

    public String fetchData() {
        return api.getData("mock-source");
    }

}
