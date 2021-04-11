package com.bnpinnovation.protobuf;

import com.bnpinnovation.proto.SCVServiceGrpc;
import com.bnpinnovation.protobuf.service.SCVService;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component

public class GrpcRunner implements ApplicationRunner {
    private static final int PORT = 8081;
    private static Server SERVER = null;

    @Autowired
    GrpcRunner(SCVServiceGrpc.SCVServiceImplBase scvRPCService) {
        this.SERVER = ServerBuilder.forPort(PORT)
                .addService( scvRPCService )
                .build();
    }



    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(SERVER != null) {
            SERVER.start();
        }
    }

}
