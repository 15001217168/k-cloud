package cloud.service;

import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
    @Autowired
    RestTemplate restTemplate;
    private final String _apiServiceName = "localhost:9002";

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService() {
        return restTemplate.getForObject("http://" + _apiServiceName + "/api/hi", String.class);
    }
    public String hiError() {
        return "hi,sorry,error!";
    }
}
