package com.bnpinnovation.protobuf.service;

import com.bnpinnovation.proto.ScvInfo;
import com.bnpinnovation.protobuf.dto.SCVDto;
import org.springframework.stereotype.Service;

public interface SCVService {
    Long create(SCVDto.Request request);

    @Service
    class Default implements SCVService {

        @Override
        public Long create(SCVDto.Request request) {
            ScvInfo.SCV newSCV = ScvInfo.SCV.newBuilder()
                    .setUsername(request.getUsername())
                    .setPassword(request.getPassword())
                    .setEmail(request.getEmail())
                    .build();

            return 0L;
        }
    }
}
