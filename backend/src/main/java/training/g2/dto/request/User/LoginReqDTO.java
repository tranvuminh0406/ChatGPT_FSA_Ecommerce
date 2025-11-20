package training.g2.dto.request.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginReqDTO {
    private String email;
    private String password;
}
