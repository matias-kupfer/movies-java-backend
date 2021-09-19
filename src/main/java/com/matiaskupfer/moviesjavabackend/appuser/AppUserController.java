package com.matiaskupfer.moviesjavabackend.appuser;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/users")
@AllArgsConstructor
public class AppUserController {

    AppUserService appUserService;

    @GetMapping
    public List<AppUser> getUsers() {
        return appUserService.getUsers();
    }

}
