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
public class V1IngressClassParametersReferenceFluentImpl<
        A extends V1IngressClassParametersReferenceFluent<A>>
    extends BaseFluent<A> implements V1IngressClassParametersReferenceFluent<A> {
  public V1IngressClassParametersReferenceFluentImpl() {}

  public V1IngressClassParametersReferenceFluentImpl(
      io.kubernetes.client.openapi.models.V1IngressClassParametersReference instance) {
    this.withApiGroup(instance.getApiGroup());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withScope(instance.getScope());
  }

  private String apiGroup;
  private java.lang.String kind;
  private java.lang.String name;
  private java.lang.String namespace;
  private java.lang.String scope;

  public java.lang.String getApiGroup() {
    return this.apiGroup;
  }

  public A withApiGroup(java.lang.String apiGroup) {
    this.apiGroup = apiGroup;
    return (A) this;
  }

  public Boolean hasApiGroup() {
    return this.apiGroup != null;
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  public java.lang.String getName() {
    return this.name;
  }

  public A withName(java.lang.String name) {
    this.name = name;
    return (A) this;
  }

  public java.lang.Boolean hasName() {
    return this.name != null;
  }

  public java.lang.String getNamespace() {
    return this.namespace;
  }

  public A withNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return (A) this;
  }

  public java.lang.Boolean hasNamespace() {
    return this.namespace != null;
  }

  public java.lang.String getScope() {
    return this.scope;
  }

  public A withScope(java.lang.String scope) {
    this.scope = scope;
    return (A) this;
  }

  public java.lang.Boolean hasScope() {
    return this.scope != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1IngressClassParametersReferenceFluentImpl that =
        (V1IngressClassParametersReferenceFluentImpl) o;
    if (apiGroup != null ? !apiGroup.equals(that.apiGroup) : that.apiGroup != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) : that.namespace != null)
      return false;
    if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiGroup, kind, name, namespace, scope, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiGroup != null) {
      sb.append("apiGroup:");
      sb.append(apiGroup + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (name != null) {
      sb.append("name:");
      sb.append(name + ",");
    }
    if (namespace != null) {
      sb.append("namespace:");
      sb.append(namespace + ",");
    }
    if (scope != null) {
      sb.append("scope:");
      sb.append(scope);
    }
    sb.append("}");
    return sb.toString();
  }
}
