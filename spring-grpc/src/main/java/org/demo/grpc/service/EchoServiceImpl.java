package org.demo.grpc.service;

import com.demo.grpc.EchoServiceGrpc;
import com.demo.grpc.GreetingRequest;
import com.demo.grpc.GreetingResponse;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class EchoServiceImpl extends EchoServiceGrpc.EchoServiceImplBase {
    @Override
    public void greeting(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        log.info("received message " +request.getMessage());
        GreetingResponse response = GreetingResponse.newBuilder().setMessage("Hello from server, received " + request.getMessage()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
       // super.greeting(request, responseObserver);
    }
}
