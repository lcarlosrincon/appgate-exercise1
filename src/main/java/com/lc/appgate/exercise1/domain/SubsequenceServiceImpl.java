package com.lc.appgate.exercise1.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SubsequenceServiceImpl implements SubsequenceService {

    @Override
    public int numDistinct(String source, String target) {
        log.info("Service has been called for source:{} and target:{}", source, target);
        return countOptions(source, target, 0, 0);
    }

    private int countOptions(String source, String target, int i, int j) {
        if (j == target.length()) return 1;
        if (i == source.length()) return 0;
        int take = 0;
        if (source.charAt(i) == target.charAt(j)) {
            take = countOptions(source, target, i + 1, j + 1);
        }
        int skip = countOptions(source, target, i + 1, j);
        return take + skip;
    }
}
