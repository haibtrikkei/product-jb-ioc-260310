package springbootrestapi.databinding_session07.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class LoadBalanceController {

    @Value("${server.port:8080}")
    private String port;

    @GetMapping("/instance")
    public String instance() {
        return "Response from: "
                + System.getenv("HOSTNAME")
                + " - Port: " + port;
    }
}