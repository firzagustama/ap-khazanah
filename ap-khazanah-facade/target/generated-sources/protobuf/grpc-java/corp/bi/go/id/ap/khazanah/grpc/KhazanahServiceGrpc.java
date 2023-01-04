package corp.bi.go.id.ap.khazanah.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: khazanah.proto")
public final class KhazanahServiceGrpc {

  private KhazanahServiceGrpc() {}

  public static final String SERVICE_NAME = "KhazanahService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest,
      corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> getGetKhazanahMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getKhazanah",
      requestType = corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest.class,
      responseType = corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest,
      corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> getGetKhazanahMethod() {
    io.grpc.MethodDescriptor<corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest, corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> getGetKhazanahMethod;
    if ((getGetKhazanahMethod = KhazanahServiceGrpc.getGetKhazanahMethod) == null) {
      synchronized (KhazanahServiceGrpc.class) {
        if ((getGetKhazanahMethod = KhazanahServiceGrpc.getGetKhazanahMethod) == null) {
          KhazanahServiceGrpc.getGetKhazanahMethod = getGetKhazanahMethod = 
              io.grpc.MethodDescriptor.<corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest, corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "KhazanahService", "getKhazanah"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KhazanahServiceMethodDescriptorSupplier("getKhazanah"))
                  .build();
          }
        }
     }
     return getGetKhazanahMethod;
  }

  private static volatile io.grpc.MethodDescriptor<corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest,
      corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> getUpdateOrderQuotaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateOrderQuota",
      requestType = corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest.class,
      responseType = corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest,
      corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> getUpdateOrderQuotaMethod() {
    io.grpc.MethodDescriptor<corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest, corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> getUpdateOrderQuotaMethod;
    if ((getUpdateOrderQuotaMethod = KhazanahServiceGrpc.getUpdateOrderQuotaMethod) == null) {
      synchronized (KhazanahServiceGrpc.class) {
        if ((getUpdateOrderQuotaMethod = KhazanahServiceGrpc.getUpdateOrderQuotaMethod) == null) {
          KhazanahServiceGrpc.getUpdateOrderQuotaMethod = getUpdateOrderQuotaMethod = 
              io.grpc.MethodDescriptor.<corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest, corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "KhazanahService", "updateOrderQuota"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new KhazanahServiceMethodDescriptorSupplier("updateOrderQuota"))
                  .build();
          }
        }
     }
     return getUpdateOrderQuotaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KhazanahServiceStub newStub(io.grpc.Channel channel) {
    return new KhazanahServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KhazanahServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KhazanahServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KhazanahServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KhazanahServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class KhazanahServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getKhazanah(corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest request,
        io.grpc.stub.StreamObserver<corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKhazanahMethod(), responseObserver);
    }

    /**
     */
    public void updateOrderQuota(corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest request,
        io.grpc.stub.StreamObserver<corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOrderQuotaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetKhazanahMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest,
                corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse>(
                  this, METHODID_GET_KHAZANAH)))
          .addMethod(
            getUpdateOrderQuotaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest,
                corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse>(
                  this, METHODID_UPDATE_ORDER_QUOTA)))
          .build();
    }
  }

  /**
   */
  public static final class KhazanahServiceStub extends io.grpc.stub.AbstractStub<KhazanahServiceStub> {
    private KhazanahServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KhazanahServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KhazanahServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KhazanahServiceStub(channel, callOptions);
    }

    /**
     */
    public void getKhazanah(corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest request,
        io.grpc.stub.StreamObserver<corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKhazanahMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateOrderQuota(corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest request,
        io.grpc.stub.StreamObserver<corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOrderQuotaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KhazanahServiceBlockingStub extends io.grpc.stub.AbstractStub<KhazanahServiceBlockingStub> {
    private KhazanahServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KhazanahServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KhazanahServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KhazanahServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse getKhazanah(corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKhazanahMethod(), getCallOptions(), request);
    }

    /**
     */
    public corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse updateOrderQuota(corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOrderQuotaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KhazanahServiceFutureStub extends io.grpc.stub.AbstractStub<KhazanahServiceFutureStub> {
    private KhazanahServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KhazanahServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KhazanahServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KhazanahServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> getKhazanah(
        corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKhazanahMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse> updateOrderQuota(
        corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOrderQuotaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_KHAZANAH = 0;
  private static final int METHODID_UPDATE_ORDER_QUOTA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KhazanahServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KhazanahServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_KHAZANAH:
          serviceImpl.getKhazanah((corp.bi.go.id.ap.khazanah.grpc.KhazanahRequest) request,
              (io.grpc.stub.StreamObserver<corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORDER_QUOTA:
          serviceImpl.updateOrderQuota((corp.bi.go.id.ap.khazanah.grpc.UpdateOrderQuotaRequest) request,
              (io.grpc.stub.StreamObserver<corp.bi.go.id.ap.khazanah.grpc.KhazanahResponse>) responseObserver);
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

  private static abstract class KhazanahServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KhazanahServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return corp.bi.go.id.ap.khazanah.grpc.Khazanah.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KhazanahService");
    }
  }

  private static final class KhazanahServiceFileDescriptorSupplier
      extends KhazanahServiceBaseDescriptorSupplier {
    KhazanahServiceFileDescriptorSupplier() {}
  }

  private static final class KhazanahServiceMethodDescriptorSupplier
      extends KhazanahServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KhazanahServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KhazanahServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KhazanahServiceFileDescriptorSupplier())
              .addMethod(getGetKhazanahMethod())
              .addMethod(getUpdateOrderQuotaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
