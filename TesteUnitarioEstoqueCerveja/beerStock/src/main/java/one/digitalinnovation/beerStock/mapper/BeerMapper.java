package one.digitalinnovation.beerStock.mapper;

import one.digitalinnovation.beerStock.dto.BeerDTO;
import one.digitalinnovation.beerStock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}