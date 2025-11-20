package training.g2.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import training.g2.dto.request.Category.CategoryReqDTO;
import training.g2.dto.response.Category.CategoryCreateResDTO;
import training.g2.dto.response.Category.CategoryResDTO;
import training.g2.dto.response.Category.CategoryUpdateRes;
import training.g2.model.Category;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-20T13:51:23+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Microsoft)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryResDTO toDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResDTO categoryResDTO = new CategoryResDTO();

        categoryResDTO.setParentId( categoryParentId( category ) );
        categoryResDTO.setId( category.getId() );
        categoryResDTO.setName( category.getName() );
        categoryResDTO.setDescription( category.getDescription() );
        categoryResDTO.setDeleted( category.isDeleted() );
        categoryResDTO.setChildren( categoryListToChildCategoryDTOList( category.getChildren() ) );
        categoryResDTO.setCreatedAt( category.getCreatedAt() );
        categoryResDTO.setUpdatedAt( category.getUpdatedAt() );
        categoryResDTO.setCreatedBy( category.getCreatedBy() );
        categoryResDTO.setUpdatedBy( category.getUpdatedBy() );

        return categoryResDTO;
    }

    @Override
    public CategoryResDTO.ChildCategoryDTO toChildDto(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryResDTO.ChildCategoryDTO childCategoryDTO = new CategoryResDTO.ChildCategoryDTO();

        childCategoryDTO.setId( category.getId() );
        childCategoryDTO.setName( category.getName() );

        return childCategoryDTO;
    }

    @Override
    public CategoryCreateResDTO toCreatedDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryCreateResDTO categoryCreateResDTO = new CategoryCreateResDTO();

        categoryCreateResDTO.setParentId( categoryParentId( category ) );
        categoryCreateResDTO.setId( category.getId() );
        categoryCreateResDTO.setName( category.getName() );
        categoryCreateResDTO.setDescription( category.getDescription() );
        categoryCreateResDTO.setCreatedAt( category.getCreatedAt() );
        categoryCreateResDTO.setCreatedBy( category.getCreatedBy() );

        return categoryCreateResDTO;
    }

    @Override
    public CategoryUpdateRes toUpdateDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryUpdateRes categoryUpdateRes = new CategoryUpdateRes();

        categoryUpdateRes.setParentId( categoryParentId( category ) );
        categoryUpdateRes.setId( category.getId() );
        categoryUpdateRes.setName( category.getName() );
        categoryUpdateRes.setDescription( category.getDescription() );
        categoryUpdateRes.setUpdatedAt( category.getUpdatedAt() );
        categoryUpdateRes.setUpdatedBy( category.getUpdatedBy() );

        return categoryUpdateRes;
    }

    @Override
    public Category toEntity(CategoryReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Category category = new Category();

        category.setName( dto.getName() );
        category.setDescription( dto.getDescription() );

        return category;
    }

    private Long categoryParentId(Category category) {
        if ( category == null ) {
            return null;
        }
        Category parent = category.getParent();
        if ( parent == null ) {
            return null;
        }
        long id = parent.getId();
        return id;
    }

    protected List<CategoryResDTO.ChildCategoryDTO> categoryListToChildCategoryDTOList(List<Category> list) {
        if ( list == null ) {
            return null;
        }

        List<CategoryResDTO.ChildCategoryDTO> list1 = new ArrayList<CategoryResDTO.ChildCategoryDTO>( list.size() );
        for ( Category category : list ) {
            list1.add( toChildDto( category ) );
        }

        return list1;
    }
}
