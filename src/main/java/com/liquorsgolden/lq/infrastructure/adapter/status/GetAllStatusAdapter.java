package com.liquorsgolden.lq.infrastructure.adapter.status;

import com.liquorsgolden.lq.domain.entities.Status;
import com.liquorsgolden.lq.domain.services.status.GetAllStatusService;
import com.liquorsgolden.lq.infrastructure.repository.category.CategoryDto;
import com.liquorsgolden.lq.infrastructure.repository.status.StatusDto;
import com.liquorsgolden.lq.infrastructure.repository.status.StatusDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.status.StatusRepository;
import com.liquorsgolden.lq.shared.exception.message.category.CategoryNotFoundException;
import com.liquorsgolden.lq.shared.exception.message.status.StatusNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@AllArgsConstructor
@Repository
public class GetAllStatusAdapter implements GetAllStatusService {

    private final StatusRepository statusRepository;
    private final StatusDtoMapper statusDtoMapper;
    @Override
    public List<Status> getAllStatus() {
        List<StatusDto> statusDtoList = statusRepository.findAll();
        if (statusDtoList.isEmpty()) {
            throw new StatusNotFoundException(
                    "No existen categorias registradas en BD");
        }
        return statusDtoMapper.toEntity(statusDtoList);
    }
}
