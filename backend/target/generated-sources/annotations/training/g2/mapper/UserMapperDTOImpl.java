package training.g2.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import training.g2.dto.response.User.CreateUserResDTO;
import training.g2.dto.response.User.ProfileResDTO;
import training.g2.dto.response.User.UpdateUserResDTO;
import training.g2.dto.response.User.UsersResDTO;
import training.g2.model.Role;
import training.g2.model.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-20T13:51:22+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Microsoft)"
)
@Component
public class UserMapperDTOImpl implements UserMapperDTO {

    @Override
    public User toEntity(UsersResDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        if ( dto.getId() != null ) {
            user.setId( Long.parseLong( dto.getId() ) );
        }
        user.setFullName( dto.getFullName() );
        user.setEmail( dto.getEmail() );
        user.setPhone( dto.getPhone() );
        user.setStatus( dto.getStatus() );
        user.setGender( dto.getGender() );
        user.setDeleted( dto.isDeleted() );
        user.setRole( roleToRole( dto.getRole() ) );
        user.setCreatedAt( dto.getCreatedAt() );
        user.setUpdatedAt( dto.getUpdatedAt() );
        user.setCreatedBy( dto.getCreatedBy() );
        user.setUpdatedBy( dto.getUpdatedBy() );

        return user;
    }

    @Override
    public List<UsersResDTO> toDtoList(List<User> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<UsersResDTO> list = new ArrayList<UsersResDTO>( entityList.size() );
        for ( User user : entityList ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public List<User> toEntityList(List<UsersResDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dtoList.size() );
        for ( UsersResDTO usersResDTO : dtoList ) {
            list.add( toEntity( usersResDTO ) );
        }

        return list;
    }

    @Override
    public UsersResDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UsersResDTO usersResDTO = new UsersResDTO();

        usersResDTO.setRole( roleToRole1( user.getRole() ) );
        usersResDTO.setId( String.valueOf( user.getId() ) );
        usersResDTO.setFullName( user.getFullName() );
        usersResDTO.setEmail( user.getEmail() );
        usersResDTO.setPhone( user.getPhone() );
        usersResDTO.setStatus( user.getStatus() );
        usersResDTO.setGender( user.getGender() );
        usersResDTO.setDeleted( user.isDeleted() );
        usersResDTO.setCreatedAt( user.getCreatedAt() );
        usersResDTO.setUpdatedAt( user.getUpdatedAt() );
        usersResDTO.setCreatedBy( user.getCreatedBy() );
        usersResDTO.setUpdatedBy( user.getUpdatedBy() );

        return usersResDTO;
    }

    @Override
    public CreateUserResDTO toCreateDTO(User user) {
        if ( user == null ) {
            return null;
        }

        CreateUserResDTO createUserResDTO = new CreateUserResDTO();

        createUserResDTO.setId( user.getId() );
        createUserResDTO.setFullName( user.getFullName() );
        createUserResDTO.setEmail( user.getEmail() );
        createUserResDTO.setPhone( user.getPhone() );
        createUserResDTO.setStatus( user.getStatus() );
        createUserResDTO.setGender( user.getGender() );
        createUserResDTO.setRole( roleToRole2( user.getRole() ) );
        createUserResDTO.setCreatedAt( user.getCreatedAt() );
        createUserResDTO.setCreatedBy( user.getCreatedBy() );
        createUserResDTO.setDeleted( user.isDeleted() );

        return createUserResDTO;
    }

    @Override
    public UpdateUserResDTO toUpdateDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UpdateUserResDTO updateUserResDTO = new UpdateUserResDTO();

        updateUserResDTO.setId( user.getId() );
        updateUserResDTO.setFullName( user.getFullName() );
        updateUserResDTO.setEmail( user.getEmail() );
        updateUserResDTO.setPhone( user.getPhone() );
        updateUserResDTO.setStatus( user.getStatus() );
        updateUserResDTO.setGender( user.getGender() );
        updateUserResDTO.setRole( roleToRole3( user.getRole() ) );
        updateUserResDTO.setUpdatedAt( user.getUpdatedAt() );
        updateUserResDTO.setUpdatedBy( user.getUpdatedBy() );
        updateUserResDTO.setDeleted( user.isDeleted() );

        return updateUserResDTO;
    }

    @Override
    public ProfileResDTO toProfileDTO(User user) {
        if ( user == null ) {
            return null;
        }

        ProfileResDTO profileResDTO = new ProfileResDTO();

        profileResDTO.setId( user.getId() );
        profileResDTO.setFullName( user.getFullName() );
        profileResDTO.setEmail( user.getEmail() );
        profileResDTO.setPhone( user.getPhone() );
        profileResDTO.setGender( user.getGender() );
        profileResDTO.setAvatar( user.getAvatar() );

        return profileResDTO;
    }

    protected Role roleToRole(UsersResDTO.Role role) {
        if ( role == null ) {
            return null;
        }

        Role.RoleBuilder role1 = Role.builder();

        role1.id( role.getId() );

        return role1.build();
    }

    protected UsersResDTO.Role roleToRole1(Role role) {
        if ( role == null ) {
            return null;
        }

        UsersResDTO.Role role1 = new UsersResDTO.Role();

        role1.setId( role.getId() );

        return role1;
    }

    protected CreateUserResDTO.Role roleToRole2(Role role) {
        if ( role == null ) {
            return null;
        }

        CreateUserResDTO.Role role1 = new CreateUserResDTO.Role();

        role1.setId( role.getId() );

        return role1;
    }

    protected UpdateUserResDTO.Role roleToRole3(Role role) {
        if ( role == null ) {
            return null;
        }

        UpdateUserResDTO.Role role1 = new UpdateUserResDTO.Role();

        role1.setId( role.getId() );

        return role1;
    }
}
