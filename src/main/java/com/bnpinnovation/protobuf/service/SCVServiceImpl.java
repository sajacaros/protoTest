package com.bnpinnovation.protobuf.service;

import com.bnpinnovation.proto.SCVServiceGrpc;
import com.bnpinnovation.proto.ScvInfo;
import com.bnpinnovation.protobuf.dto.SCVDto;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SCVServiceImpl extends SCVServiceGrpc.SCVServiceImplBase {
    @Autowired
    private  SCVService scvService;

    @Override
    public void getSCV(Empty request, StreamObserver<ScvInfo.SCVResponse> responseObserver) {
        SCVDto.Response scv = scvService.latestSCV();
        log.info("latest scv : {}", scv);
        ScvInfo.SCVResponse response = ScvInfo.SCVResponse.newBuilder()
                .setUsername(scv.getUsername())
                .setEmail(scv.getEmail())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
