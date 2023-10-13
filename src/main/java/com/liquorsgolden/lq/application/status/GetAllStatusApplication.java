package com.liquorsgolden.lq.application.status;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.entities.Status;
import com.liquorsgolden.lq.domain.services.status.GetAllStatusService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GetAllStatusApplication {

    private final GetAllStatusService getAllStatusService;

    public List<Status> getAllStatus() {
        return getAllStatusService.getAllStatus();
    }
}
