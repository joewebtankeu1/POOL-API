package com.pooltpv.api.mappers;
import com.pooltpv.api.dto.CompagnieDTO;
import com.pooltpv.api.entities.Compagnie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(
        componentModel = "spring"
)
public interface CompagnieMapper {
    @Mapping(source="codeAttest",target ="codeAttest" )
   CompagnieDTO  compagnieToCompagnieDTO(Compagnie compagnie);

}
