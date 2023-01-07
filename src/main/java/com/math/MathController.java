package com.math;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    //GET method that takes the url path variables (input by html & js static files) and returns the sum
    @GetMapping("add/{x}/{y}")
    public int getMath(@PathVariable("x") int x, @PathVariable("y") int y) {
        return x + y;
    }
}
