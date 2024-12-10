package account.api;

import account.usecases.dto.CreatedUserDto;
import account.usecases.commands.SignupNewUserCommand;
import account.usecases.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@Validated
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public CreatedUserDto signup(@Valid @RequestBody SignupNewUserCommand newUser) {
        return authenticationService.signup(newUser);
    }

}
