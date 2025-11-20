package training.g2.dto.request.User;

import lombok.Getter;
import lombok.Setter;
import training.g2.model.enums.UserStatusEnum;

@Getter
@Setter
public class UpdateUserReqDTO {
    private long id;
    private UserStatusEnum status;
}
