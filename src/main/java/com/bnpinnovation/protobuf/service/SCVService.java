package com.bnpinnovation.protobuf.service;


import com.bnpinnovation.protobuf.dto.SCVDto;
import com.google.common.collect.Iterables;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface SCVService {
    Long create(SCVDto.Request request);
    SCVDto.Response latestSCV();

    @Service
    @Slf4j
    class Default implements SCVService {

        List<SCVDto.Request> scvs = new ArrayList<>();

        @Override
        public Long create(SCVDto.Request request) {

            scvs.add(request);

            return 0L;
        }

        @Override
        public SCVDto.Response latestSCV() {
            if(scvs.isEmpty()) {
                return new SCVDto.Response("empty", "empty");
            }
            SCVDto.Request r = Iterables.getLast(scvs);
            log.info("request : {}", r);
            return new SCVDto.Response(r.getUsername(),r.getEmail());
        }
    }
}
