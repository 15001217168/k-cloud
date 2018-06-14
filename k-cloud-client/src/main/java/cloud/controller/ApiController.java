package cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Value("${server.port}")
    String port;
    @RequestMapping( value = "/hi",method = RequestMethod.GET)
    public String home() {
        return "你好:"+port;
    }
}
