package account.usecases.dto;


import account.domain.ServiceUser;

public record CreatedUserDto(String name, String lastname, String email) {
    public static CreatedUserDto from(ServiceUser serviceUser) {
        return new CreatedUserDto(
                serviceUser.getName(),
                serviceUser.getLastname(),
                serviceUser.getEmail().value()
        );
    }
}
