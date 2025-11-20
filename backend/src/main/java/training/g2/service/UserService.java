package training.g2.service;

import java.time.Instant;
import java.util.List;

import training.g2.dto.request.User.PasswordReqDTO;
import training.g2.dto.request.User.ProfileReqDTO;
import training.g2.dto.request.User.RegisterReqDTO;
import training.g2.dto.request.User.UpdateUserReqDTO;
import training.g2.dto.response.User.CreateUserResDTO;
import training.g2.dto.response.User.ProfileResDTO;
import training.g2.dto.response.User.UpdateUserResDTO;
import training.g2.dto.response.User.UsersResDTO;
import training.g2.dto.common.PaginationDTO;
import training.g2.model.Role;
import training.g2.model.User;

public interface UserService {

    CreateUserResDTO createUser(User user);

    CreateUserResDTO register(RegisterReqDTO registerDTO);

    UpdateUserResDTO updateUser(UpdateUserReqDTO userDTO);

    UsersResDTO getUserById(long id);

    UsersResDTO deleteUser(long id);

    User getUserByEmail(String email);

    User findByEmail(String mail);

    void resendUpdatePassword(String oldToken);

    PaginationDTO<List<UsersResDTO>> getAllUser(int page, int size, String email, Boolean isDeleted,
            Instant fromDate, Instant toDate,
            String sortField, String sortDirection);

    Role getRoleByName(String name);

    CreateUserResDTO saveUser(User user);
    ProfileResDTO updateProfile(ProfileReqDTO dto);
    boolean changePassword(PasswordReqDTO dto);
}
