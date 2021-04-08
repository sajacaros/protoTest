package com.bnpinnovation.protobuf.service;


import static com.bnpinnovation.proto.SCVServiceGrpc.SCVServiceImplBase;
import com.bnpinnovation.proto.ScvInfo;
import com.bnpinnovation.protobuf.dto.SCVDto;
import org.springframework.stereotype.Service;

public interface SCVService {
    Long create(SCVDto.Request request);

    @Service
    class Default extends SCVServiceImplBase implements SCVService {

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
