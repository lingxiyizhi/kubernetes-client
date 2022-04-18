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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1beta1EndpointConditionsFluentImpl<A extends V1beta1EndpointConditionsFluent<A>>
    extends BaseFluent<A> implements V1beta1EndpointConditionsFluent<A> {
  public V1beta1EndpointConditionsFluentImpl() {}

  public V1beta1EndpointConditionsFluentImpl(
      io.kubernetes.client.openapi.models.V1beta1EndpointConditions instance) {
    this.withReady(instance.getReady());

    this.withServing(instance.getServing());

    this.withTerminating(instance.getTerminating());
  }

  private Boolean ready;
  private java.lang.Boolean serving;
  private java.lang.Boolean terminating;

  public java.lang.Boolean getReady() {
    return this.ready;
  }

  public A withReady(java.lang.Boolean ready) {
    this.ready = ready;
    return (A) this;
  }

  public java.lang.Boolean hasReady() {
    return this.ready != null;
  }

  public java.lang.Boolean getServing() {
    return this.serving;
  }

  public A withServing(java.lang.Boolean serving) {
    this.serving = serving;
    return (A) this;
  }

  public java.lang.Boolean hasServing() {
    return this.serving != null;
  }

  public java.lang.Boolean getTerminating() {
    return this.terminating;
  }

  public A withTerminating(java.lang.Boolean terminating) {
    this.terminating = terminating;
    return (A) this;
  }

  public java.lang.Boolean hasTerminating() {
    return this.terminating != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1EndpointConditionsFluentImpl that = (V1beta1EndpointConditionsFluentImpl) o;
    if (ready != null ? !ready.equals(that.ready) : that.ready != null) return false;
    if (serving != null ? !serving.equals(that.serving) : that.serving != null) return false;
    if (terminating != null ? !terminating.equals(that.terminating) : that.terminating != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(ready, serving, terminating, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (ready != null) {
      sb.append("ready:");
      sb.append(ready + ",");
    }
    if (serving != null) {
      sb.append("serving:");
      sb.append(serving + ",");
    }
    if (terminating != null) {
      sb.append("terminating:");
      sb.append(terminating);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReady() {
    return withReady(true);
  }

  public A withServing() {
    return withServing(true);
  }

  public A withTerminating() {
    return withTerminating(true);
  }
}
