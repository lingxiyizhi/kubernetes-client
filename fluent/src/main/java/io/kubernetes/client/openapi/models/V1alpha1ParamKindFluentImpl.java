package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha1ParamKindFluentImpl<A extends V1alpha1ParamKindFluent<A>> extends BaseFluent<A> implements V1alpha1ParamKindFluent<A>{
  public V1alpha1ParamKindFluentImpl() {
  }
  public V1alpha1ParamKindFluentImpl(V1alpha1ParamKind instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
    }
  }
  private String apiVersion;
  private String kind;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ParamKindFluentImpl that = (V1alpha1ParamKindFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind); }
    sb.append("}");
    return sb.toString();
  }
  
}