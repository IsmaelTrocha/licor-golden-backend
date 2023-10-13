package com.liquorsgolden.lq.domain.services.status;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.entities.Status;

import java.util.List;

public interface GetAllStatusService {

    List<Status> getAllStatus();
}
