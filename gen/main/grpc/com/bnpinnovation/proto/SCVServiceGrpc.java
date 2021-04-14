package com.bnpinnovation.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: scvInfo.proto")
public final class SCVServiceGrpc {

  private SCVServiceGrpc() {}

  public static final String SERVICE_NAME = "SCVService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bnpinnovation.proto.ScvInfo.SCVRequest,
      com.google.protobuf.Empty> getNewSCVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NewSCV",
      requestType = com.bnpinnovation.proto.ScvInfo.SCVRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bnpinnovation.proto.ScvInfo.SCVRequest,
      com.google.protobuf.Empty> getNewSCVMethod() {
    io.grpc.MethodDescriptor<com.bnpinnovation.proto.ScvInfo.SCVRequest, com.google.protobuf.Empty> getNewSCVMethod;
    if ((getNewSCVMethod = SCVServiceGrpc.getNewSCVMethod) == null) {
      synchronized (SCVServiceGrpc.class) {
        if ((getNewSCVMethod = SCVServiceGrpc.getNewSCVMethod) == null) {
          SCVServiceGrpc.getNewSCVMethod = getNewSCVMethod =
              io.grpc.MethodDescriptor.<com.bnpinnovation.proto.ScvInfo.SCVRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NewSCV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bnpinnovation.proto.ScvInfo.SCVRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SCVServiceMethodDescriptorSupplier("NewSCV"))
              .build();
        }
      }
    }
    return getNewSCVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.bnpinnovation.proto.ScvInfo.SCVResponse> getGetSCVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSCV",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.bnpinnovation.proto.ScvInfo.SCVResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.bnpinnovation.proto.ScvInfo.SCVResponse> getGetSCVMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.bnpinnovation.proto.ScvInfo.SCVResponse> getGetSCVMethod;
    if ((getGetSCVMethod = SCVServiceGrpc.getGetSCVMethod) == null) {
      synchronized (SCVServiceGrpc.class) {
        if ((getGetSCVMethod = SCVServiceGrpc.getGetSCVMethod) == null) {
          SCVServiceGrpc.getGetSCVMethod = getGetSCVMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.bnpinnovation.proto.ScvInfo.SCVResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSCV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bnpinnovation.proto.ScvInfo.SCVResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SCVServiceMethodDescriptorSupplier("GetSCV"))
              .build();
        }
      }
    }
    return getGetSCVMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SCVServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SCVServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SCVServiceStub>() {
        @java.lang.Override
        public SCVServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SCVServiceStub(channel, callOptions);
        }
      };
    return SCVServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SCVServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SCVServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SCVServiceBlockingStub>() {
        @java.lang.Override
        public SCVServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SCVServiceBlockingStub(channel, callOptions);
        }
      };
    return SCVServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SCVServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SCVServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SCVServiceFutureStub>() {
        @java.lang.Override
        public SCVServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SCVServiceFutureStub(channel, callOptions);
        }
      };
    return SCVServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SCVServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void newSCV(com.bnpinnovation.proto.ScvInfo.SCVRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewSCVMethod(), responseObserver);
    }

    /**
     */
    public void getSCV(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.bnpinnovation.proto.ScvInfo.SCVResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSCVMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewSCVMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.bnpinnovation.proto.ScvInfo.SCVRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_NEW_SCV)))
          .addMethod(
            getGetSCVMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.bnpinnovation.proto.ScvInfo.SCVResponse>(
                  this, METHODID_GET_SCV)))
          .build();
    }
  }

  /**
   */
  public static final class SCVServiceStub extends io.grpc.stub.AbstractAsyncStub<SCVServiceStub> {
    private SCVServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SCVServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SCVServiceStub(channel, callOptions);
    }

    /**
     */
    public void newSCV(com.bnpinnovation.proto.ScvInfo.SCVRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewSCVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSCV(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.bnpinnovation.proto.ScvInfo.SCVResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSCVMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SCVServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SCVServiceBlockingStub> {
    private SCVServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SCVServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SCVServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty newSCV(com.bnpinnovation.proto.ScvInfo.SCVRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewSCVMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bnpinnovation.proto.ScvInfo.SCVResponse getSCV(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSCVMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SCVServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SCVServiceFutureStub> {
    private SCVServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SCVServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SCVServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> newSCV(
        com.bnpinnovation.proto.ScvInfo.SCVRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewSCVMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bnpinnovation.proto.ScvInfo.SCVResponse> getSCV(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSCVMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_SCV = 0;
  private static final int METHODID_GET_SCV = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SCVServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SCVServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_SCV:
          serviceImpl.newSCV((com.bnpinnovation.proto.ScvInfo.SCVRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_SCV:
          serviceImpl.getSCV((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.bnpinnovation.proto.ScvInfo.SCVResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SCVServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SCVServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bnpinnovation.proto.ScvInfo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SCVService");
    }
  }

  private static final class SCVServiceFileDescriptorSupplier
      extends SCVServiceBaseDescriptorSupplier {
    SCVServiceFileDescriptorSupplier() {}
  }

  private static final class SCVServiceMethodDescriptorSupplier
      extends SCVServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SCVServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SCVServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SCVServiceFileDescriptorSupplier())
              .addMethod(getNewSCVMethod())
              .addMethod(getGetSCVMethod())
              .build();
        }
      }
    }
    return result;
  }
}
