package com.matiaskupfer.moviesjavabackend.authentication;

import com.matiaskupfer.moviesjavabackend.appuser.AppUser;
import com.matiaskupfer.moviesjavabackend.appuser.AppUserRole;
import com.matiaskupfer.moviesjavabackend.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

//@CrossOrigin(origins = "*")
@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;

    public String register(RegistrationRequest request) {
        return appUserService.signUpUser(
                new AppUser(request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER,
                        true,
                        true,
                        true,
                        true
                )
        );
    }

}
