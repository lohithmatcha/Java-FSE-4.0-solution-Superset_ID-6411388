package com.lohith.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        ExternalAPI mockApi = mock(ExternalAPI.class);

        when(mockApi.getData()).thenReturn("Mocked API Response");

        MyService service = new MyService(mockApi);

        String ans = service.fetchData();

        assertEquals("Processed: Mocked API Response", ans);
    }
}
