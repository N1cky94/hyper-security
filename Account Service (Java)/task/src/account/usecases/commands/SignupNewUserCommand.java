package account.usecases.commands;

import account.domain.values.Email;
import account.domain.ServiceUser;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record SignupNewUserCommand(@NotBlank String name, @NotBlank String lastname, @NotBlank @Pattern(regexp = Email.EMAIL_REGEXP) String email, @NotBlank String password) {
    public ServiceUser toServiceUser() {
        return new ServiceUser(name, lastname, new Email(email), password);
    }
}
