package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.status.GetAllStatusApplication;
import com.liquorsgolden.lq.infrastructure.api.dto.response.status.StatusResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.status.StatusResponseMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "status")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class StatusController {

    private final GetAllStatusApplication getAllStatusApplication;
    private final StatusResponseMapper statusResponseMapper;

    @GetMapping("/list")
    public ResponseEntity<List<StatusResponse>> getAllStatus() {
        return new ResponseEntity<>(
                statusResponseMapper.toDto(getAllStatusApplication.getAllStatus()),
                HttpStatus.OK);
    }
}
