package account.usecases;


import account.domain.ServiceUser;
import account.usecases.commands.SignupNewUserCommand;
import account.usecases.dto.CreatedUserDto;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public CreatedUserDto signup(SignupNewUserCommand newUser) {
        ServiceUser user = newUser.toServiceUser();

        return CreatedUserDto.from(user);
    }

}
