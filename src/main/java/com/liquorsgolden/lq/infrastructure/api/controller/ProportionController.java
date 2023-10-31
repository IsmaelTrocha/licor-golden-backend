package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.proportion.GetAllProportionApplication;
import com.liquorsgolden.lq.infrastructure.api.dto.response.proportion.ProportionResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.proportion.ProportionResponseMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "proportion")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ProportionController {

    private final GetAllProportionApplication getAllProportionApplication;
    private final ProportionResponseMapper proportionResponseMapper;

    @GetMapping("/list")
    public ResponseEntity<List<ProportionResponse>> getAllProportion() {
        return new ResponseEntity<>(
                proportionResponseMapper.toDto(getAllProportionApplication.getAllProportion()),
                HttpStatus.OK);
    }
}
