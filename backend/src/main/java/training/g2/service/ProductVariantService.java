package training.g2.service;

import java.util.List;

import training.g2.dto.request.ProductVariant.ProductVariantCreateReqDTO;
import training.g2.dto.request.ProductVariant.VariantUpdateReqDTO;
import training.g2.dto.response.ProductVariant.FilterVariantByCateResDTO;
import training.g2.dto.response.ProductVariant.VariantCreateResDTO;
import training.g2.dto.response.ProductVariant.VariantDetailDTO;
import training.g2.dto.common.PaginationDTO;
import training.g2.model.enums.PriceRange;

public interface ProductVariantService {
    List<VariantCreateResDTO> createVariant(long productId, ProductVariantCreateReqDTO req);

    PaginationDTO<List<VariantDetailDTO>> getAllVariantByProduct(long productId, int page, int size);

    VariantDetailDTO getVariantById(long variantId);

    VariantDetailDTO updateVariant(long variantId, VariantUpdateReqDTO dto);

    void deleteVariant(long variantId);

    PaginationDTO<List<FilterVariantByCateResDTO>> getCategoryHome(
            Long categoryId,
            PriceRange priceRange,
            String sort,
            int page,
            int size);

}
