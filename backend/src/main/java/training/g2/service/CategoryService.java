package training.g2.service;

import java.util.List;

import training.g2.dto.request.Category.CategoryReqDTO;
import training.g2.dto.response.Category.CategoryCreateResDTO;
import training.g2.dto.response.Category.CategoryResDTO;
import training.g2.dto.response.Category.CategoryUpdateRes;
import training.g2.dto.common.PaginationDTO;

public interface CategoryService {
    CategoryCreateResDTO createCategory(CategoryReqDTO dto);

    PaginationDTO<List<CategoryResDTO>> getAllCategory(int page, int size, String name, Long parentId,
            Boolean isDeleted,
            String sortField, String sortDirection);

    CategoryResDTO getCategoryById(long id);

    CategoryUpdateRes updateCategory(long id, CategoryReqDTO dto);

    void deleteCategory(long id);

    List<CategoryResDTO> getChildCategories();

    List<CategoryResDTO> getTreeCategory();

}
