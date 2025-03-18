package com.lc.appgate.exercise1.controller;

import com.lc.appgate.exercise1.domain.SubsequenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/utilities/subsequences")
@RequiredArgsConstructor
public class SubsequenceController {

    private final SubsequenceService subsequenceService;

    @PostMapping
    public SubsequenceResponse countDistinctSubsequences(@RequestBody SubsequenceRequest request) {
        int count = subsequenceService.numDistinct(request.getSource(), request.getTarget());
        return new SubsequenceResponse(count);
    }
}

