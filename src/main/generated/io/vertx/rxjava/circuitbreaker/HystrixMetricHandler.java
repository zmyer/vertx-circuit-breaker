/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.circuitbreaker;

import java.util.Map;
import rx.Observable;
import io.vertx.rxjava.core.Vertx;
import io.vertx.rxjava.ext.web.RoutingContext;
import io.vertx.core.Handler;

/**
 * A Vert.x web handler to expose the circuit breaker to the Hystrix dasbboard. The handler listens to the circuit
 * breaker notifications sent on the event bus.
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.circuitbreaker.HystrixMetricHandler original} non RX-ified interface using Vert.x codegen.
 */

public class HystrixMetricHandler implements Handler<RoutingContext> {

  final io.vertx.circuitbreaker.HystrixMetricHandler delegate;

  public HystrixMetricHandler(io.vertx.circuitbreaker.HystrixMetricHandler delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public void handle(RoutingContext arg0) { 
    delegate.handle((io.vertx.ext.web.RoutingContext)arg0.getDelegate());
  }

  /**
   * Creates the handler, using the default notification address.
   * @param vertx the Vert.x instance
   * @return the handler
   */
  public static HystrixMetricHandler create(Vertx vertx) { 
    HystrixMetricHandler ret = HystrixMetricHandler.newInstance(io.vertx.circuitbreaker.HystrixMetricHandler.create((io.vertx.core.Vertx)vertx.getDelegate()));
    return ret;
  }

  /**
   * Creates the handler.
   * @param vertx the Vert.x instance
   * @param address the address to listen on the event bus
   * @return the handler
   */
  public static HystrixMetricHandler create(Vertx vertx, String address) { 
    HystrixMetricHandler ret = HystrixMetricHandler.newInstance(io.vertx.circuitbreaker.HystrixMetricHandler.create((io.vertx.core.Vertx)vertx.getDelegate(), address));
    return ret;
  }


  public static HystrixMetricHandler newInstance(io.vertx.circuitbreaker.HystrixMetricHandler arg) {
    return arg != null ? new HystrixMetricHandler(arg) : null;
  }
}
