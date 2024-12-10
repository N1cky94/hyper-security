package account.domain;

import account.domain.values.Email;
import jakarta.validation.constraints.NotNull;

public class ServiceUser {
    @NotNull
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String lastname;
    @NotNull
    private Email email;
    @NotNull
    private String  password;

    public ServiceUser() {
    }

    public ServiceUser(String name, String lastname, Email email, String password) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Email getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ServiceUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email=" + email +
                ", password='" + password + '\'' +
                '}';
    }
}
