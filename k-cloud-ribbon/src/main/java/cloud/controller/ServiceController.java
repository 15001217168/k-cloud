package cloud.controller;

import cloud.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    ApiService apiService;

    @RequestMapping(value = "/hi")
    public String hi() {
        return apiService.hiService();
    }
}
