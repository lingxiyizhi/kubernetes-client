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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1beta1EndpointSliceListBuilder
    extends V1beta1EndpointSliceListFluentImpl<V1beta1EndpointSliceListBuilder>
    implements VisitableBuilder<
        V1beta1EndpointSliceList,
        io.kubernetes.client.openapi.models.V1beta1EndpointSliceListBuilder> {
  public V1beta1EndpointSliceListBuilder() {
    this(false);
  }

  public V1beta1EndpointSliceListBuilder(Boolean validationEnabled) {
    this(new V1beta1EndpointSliceList(), validationEnabled);
  }

  public V1beta1EndpointSliceListBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceListFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1EndpointSliceListBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceListFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1EndpointSliceList(), validationEnabled);
  }

  public V1beta1EndpointSliceListBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceList instance) {
    this(fluent, instance, false);
  }

  public V1beta1EndpointSliceListBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1EndpointSliceListBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceList instance) {
    this(instance, false);
  }

  public V1beta1EndpointSliceListBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointSliceList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1EndpointSliceListFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1EndpointSliceList build() {
    V1beta1EndpointSliceList buildable = new V1beta1EndpointSliceList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
}
