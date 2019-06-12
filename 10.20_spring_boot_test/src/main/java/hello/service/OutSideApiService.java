package hello.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class OutSideApiService {

    public String OutSideApiGreeting() {
        return "Hello World: OutSideApiGreeting";
    }
}
