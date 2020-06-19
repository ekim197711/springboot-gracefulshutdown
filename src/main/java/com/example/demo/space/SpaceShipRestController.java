package com.example.demo.space;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/space")
public class SpaceShipRestController {

    @GetMapping("/")
    public String flyaround() throws InterruptedException {
        Thread.sleep(10000);
        return "swooosshhhh";
    }
}
