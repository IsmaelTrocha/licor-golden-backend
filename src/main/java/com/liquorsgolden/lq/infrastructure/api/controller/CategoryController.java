package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.category.CreateCategoryApplication;
import com.liquorsgolden.lq.infrastructure.api.dto.request.CategoryRequest;
import com.liquorsgolden.lq.infrastructure.api.mapper.request.CategoryRequestMapper;
import com.liquorsgolden.lq.infrastructure.api.mapper.response.CreateResponse;
import com.liquorsgolden.lq.shared.exception.code.MessageCode;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.liquorsgolden.lq.shared.utils.CustomHeader.X_AUTH_EMAIL;

@RestController
@RequestMapping(path = "/api/v1/category")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class CategoryController {

    private final CreateCategoryApplication categoryApplication;
    private final CategoryRequestMapper categoryRequestMapper;
    private final MessageUtils messageUtils;

    @PostMapping
    public ResponseEntity<CreateResponse> createCategory(@RequestBody CategoryRequest categoryRequest, @RequestHeader(X_AUTH_EMAIL) String createBy) {
        categoryApplication.createCategory(categoryRequestMapper.toEntity(categoryRequest), createBy);
        return new ResponseEntity<>(new CreateResponse(
                messageUtils.getMessage(MessageCode.SUCCESSFUL.getCode()),
                messageUtils.getMessage(MessageCode.CATEGORY_CREATE_SUCCESSFULLY.getType())
        ), HttpStatus.CREATED);
    }


}
