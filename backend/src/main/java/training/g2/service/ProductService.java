package training.g2.service;

import java.util.List;

import training.g2.dto.request.Product.ProductReqDTO;
import training.g2.dto.response.Product.ProductCreateResDTO;
import training.g2.dto.response.Product.ProductResDTO;
import training.g2.dto.response.Product.ProductUpdateResDTO;
import training.g2.dto.common.PaginationDTO;

public interface ProductService {
    ProductCreateResDTO createProduct(ProductReqDTO productReqDTO);

    ProductUpdateResDTO updateProduct(long id, ProductReqDTO productReqDTO);

    ProductResDTO getProductById(long id);

    PaginationDTO<List<ProductResDTO>> getAllProduct(int page, int size, String name, Long cateId,
            Boolean isDeleted,
            String sortField, String sortDirection);

    void deleteProduct(long id);
}
