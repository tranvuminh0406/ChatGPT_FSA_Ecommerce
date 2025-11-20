package training.g2.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import training.g2.dto.request.Product.ProductReqDTO;
import training.g2.dto.response.Product.ProductCreateResDTO;
import training.g2.dto.response.Product.ProductResDTO;
import training.g2.dto.response.Product.ProductUpdateResDTO;
import training.g2.model.Category;
import training.g2.model.Product;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-20T13:51:22+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.9 (Microsoft)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResDTO toDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResDTO productResDTO = new ProductResDTO();

        productResDTO.setCategory( categoryToCategory( product.getCategory() ) );
        productResDTO.setId( product.getId() );
        productResDTO.setName( product.getName() );
        productResDTO.setCode( product.getCode() );
        productResDTO.setDeleted( product.isDeleted() );
        productResDTO.setCreatedAt( product.getCreatedAt() );
        productResDTO.setUpdatedAt( product.getUpdatedAt() );
        productResDTO.setCreatedBy( product.getCreatedBy() );
        productResDTO.setUpdatedBy( product.getUpdatedBy() );

        return productResDTO;
    }

    @Override
    public ProductUpdateResDTO toUpdateDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductUpdateResDTO productUpdateResDTO = new ProductUpdateResDTO();

        productUpdateResDTO.setCategory( categoryToCategory1( product.getCategory() ) );
        productUpdateResDTO.setId( product.getId() );
        productUpdateResDTO.setName( product.getName() );
        productUpdateResDTO.setCode( product.getCode() );
        productUpdateResDTO.setDeleted( product.isDeleted() );
        productUpdateResDTO.setUpdatedAt( product.getUpdatedAt() );
        productUpdateResDTO.setUpdatedBy( product.getUpdatedBy() );

        return productUpdateResDTO;
    }

    @Override
    public ProductCreateResDTO toCreateDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductCreateResDTO productCreateResDTO = new ProductCreateResDTO();

        productCreateResDTO.setCategory( categoryToCategory2( product.getCategory() ) );
        productCreateResDTO.setId( product.getId() );
        productCreateResDTO.setName( product.getName() );
        productCreateResDTO.setCode( product.getCode() );
        productCreateResDTO.setDescription( product.getDescription() );
        productCreateResDTO.setDeleted( product.isDeleted() );
        productCreateResDTO.setCreatedAt( product.getCreatedAt() );
        productCreateResDTO.setCreatedBy( product.getCreatedBy() );

        return productCreateResDTO;
    }

    @Override
    public Product toProductEntity(ProductReqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        product.setName( dto.getName() );
        product.setCode( dto.getCode() );
        product.setDescription( dto.getDescription() );
        product.setCategory( categoryToCategory3( dto.getCategory() ) );

        return product;
    }

    protected ProductResDTO.Category categoryToCategory(Category category) {
        if ( category == null ) {
            return null;
        }

        ProductResDTO.Category category1 = new ProductResDTO.Category();

        category1.setId( category.getId() );

        return category1;
    }

    protected ProductUpdateResDTO.Category categoryToCategory1(Category category) {
        if ( category == null ) {
            return null;
        }

        ProductUpdateResDTO.Category category1 = new ProductUpdateResDTO.Category();

        category1.setId( category.getId() );

        return category1;
    }

    protected ProductCreateResDTO.Category categoryToCategory2(Category category) {
        if ( category == null ) {
            return null;
        }

        ProductCreateResDTO.Category category1 = new ProductCreateResDTO.Category();

        category1.setId( category.getId() );

        return category1;
    }

    protected Category categoryToCategory3(ProductReqDTO.Category category) {
        if ( category == null ) {
            return null;
        }

        Category category1 = new Category();

        category1.setId( category.getId() );

        return category1;
    }
}
