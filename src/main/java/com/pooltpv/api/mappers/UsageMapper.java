package com.pooltpv.api.mappers;

import com.pooltpv.api.dto.UsageDTO;
import com.pooltpv.api.entities.Usage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface UsageMapper {
    @Mapping(source="codeUsage",target ="code" )
    @Mapping(source="libeUsage",target ="libelle" )
    public UsageDTO usageToUsageDTO(Usage usage);
}

