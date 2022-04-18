/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1beta2LimitResponseFluentImpl<A extends V1beta2LimitResponseFluent<A>>
    extends BaseFluent<A> implements V1beta2LimitResponseFluent<A> {
  public V1beta2LimitResponseFluentImpl() {}

  public V1beta2LimitResponseFluentImpl(
      io.kubernetes.client.openapi.models.V1beta2LimitResponse instance) {
    this.withQueuing(instance.getQueuing());

    this.withType(instance.getType());
  }

  private V1beta2QueuingConfigurationBuilder queuing;
  private String type;

  /**
   * This method has been deprecated, please use method buildQueuing instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration getQueuing() {
    return this.queuing != null ? this.queuing.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration buildQueuing() {
    return this.queuing != null ? this.queuing.build() : null;
  }

  public A withQueuing(io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration queuing) {
    _visitables.get("queuing").remove(this.queuing);
    if (queuing != null) {
      this.queuing = new V1beta2QueuingConfigurationBuilder(queuing);
      _visitables.get("queuing").add(this.queuing);
    }
    return (A) this;
  }

  public Boolean hasQueuing() {
    return this.queuing != null;
  }

  public V1beta2LimitResponseFluent.QueuingNested<A> withNewQueuing() {
    return new V1beta2LimitResponseFluentImpl.QueuingNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<A>
      withNewQueuingLike(io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration item) {
    return new V1beta2LimitResponseFluentImpl.QueuingNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<A>
      editQueuing() {
    return withNewQueuingLike(getQueuing());
  }

  public io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<A>
      editOrNewQueuing() {
    return withNewQueuingLike(
        getQueuing() != null
            ? getQueuing()
            : new io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<A>
      editOrNewQueuingLike(io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration item) {
    return withNewQueuingLike(getQueuing() != null ? getQueuing() : item);
  }

  public java.lang.String getType() {
    return this.type;
  }

  public A withType(java.lang.String type) {
    this.type = type;
    return (A) this;
  }

  public java.lang.Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2LimitResponseFluentImpl that = (V1beta2LimitResponseFluentImpl) o;
    if (queuing != null ? !queuing.equals(that.queuing) : that.queuing != null) return false;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(queuing, type, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (queuing != null) {
      sb.append("queuing:");
      sb.append(queuing + ",");
    }
    if (type != null) {
      sb.append("type:");
      sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }

  class QueuingNestedImpl<N>
      extends V1beta2QueuingConfigurationFluentImpl<V1beta2LimitResponseFluent.QueuingNested<N>>
      implements io.kubernetes.client.openapi.models.V1beta2LimitResponseFluent.QueuingNested<N>,
          Nested<N> {
    QueuingNestedImpl(V1beta2QueuingConfiguration item) {
      this.builder = new V1beta2QueuingConfigurationBuilder(this, item);
    }

    QueuingNestedImpl() {
      this.builder =
          new io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationBuilder builder;

    public N and() {
      return (N) V1beta2LimitResponseFluentImpl.this.withQueuing(builder.build());
    }

    public N endQueuing() {
      return and();
    }
  }
}
