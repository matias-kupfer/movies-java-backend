package com.matiaskupfer.moviesjavabackend.authentication;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "api/authentication")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping(path = "/register")
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "/test")
    public String test() {
        return "it's working";
    }

    /*
    * application.jwt.secretKey=securesecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecure
application.jwt.tokenPrefix=Bearer
application.jwt.tokenExpirationAfterDays=14*/

}

