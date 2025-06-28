package com.lohith.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData("mock-source")).thenReturn("Mocked response");

        MyService service = new MyService(mockApi);
        service.fetchData();

        verify(mockApi).getData("mock-source");
    }
}
