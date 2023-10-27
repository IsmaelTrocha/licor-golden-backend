package com.liquorsgolden.lq.application.status;

import com.liquorsgolden.lq.domain.entities.Status;
import com.liquorsgolden.lq.domain.services.status.GetAllStatusService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetAllStatusApplication {

    private final GetAllStatusService getAllStatusService;

    public List<Status> getAllStatus() {
        return getAllStatusService.getAllStatus();
    }
}
