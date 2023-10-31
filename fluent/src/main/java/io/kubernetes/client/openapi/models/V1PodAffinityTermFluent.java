package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Collection;
import java.lang.Object;
import java.util.List;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1PodAffinityTermFluent<A extends V1PodAffinityTermFluent<A>> extends BaseFluent<A>{
  public V1PodAffinityTermFluent() {
  }
  
  public V1PodAffinityTermFluent(V1PodAffinityTerm instance) {
    this.copyInstance(instance);
  }
  private V1LabelSelectorBuilder labelSelector;
  private V1LabelSelectorBuilder namespaceSelector;
  private List<String> namespaces;
  private String topologyKey;
  
  protected void copyInstance(V1PodAffinityTerm instance) {
    instance = (instance != null ? instance : new V1PodAffinityTerm());
    if (instance != null) {
          this.withLabelSelector(instance.getLabelSelector());
          this.withNamespaceSelector(instance.getNamespaceSelector());
          this.withNamespaces(instance.getNamespaces());
          this.withTopologyKey(instance.getTopologyKey());
        }
  }
  
  public V1LabelSelector buildLabelSelector() {
    return this.labelSelector != null ? this.labelSelector.build() : null;
  }
  
  public A withLabelSelector(V1LabelSelector labelSelector) {
    this._visitables.remove(this.labelSelector);
    if (labelSelector != null) {
        this.labelSelector = new V1LabelSelectorBuilder(labelSelector);
        this._visitables.get("labelSelector").add(this.labelSelector);
    } else {
        this.labelSelector = null;
        this._visitables.get("labelSelector").remove(this.labelSelector);
    }
    return (A) this;
  }
  
  public boolean hasLabelSelector() {
    return this.labelSelector != null;
  }
  
  public LabelSelectorNested<A> withNewLabelSelector() {
    return new LabelSelectorNested(null);
  }
  
  public LabelSelectorNested<A> withNewLabelSelectorLike(V1LabelSelector item) {
    return new LabelSelectorNested(item);
  }
  
  public LabelSelectorNested<A> editLabelSelector() {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(null));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelector() {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public LabelSelectorNested<A> editOrNewLabelSelectorLike(V1LabelSelector item) {
    return withNewLabelSelectorLike(java.util.Optional.ofNullable(buildLabelSelector()).orElse(item));
  }
  
  public V1LabelSelector buildNamespaceSelector() {
    return this.namespaceSelector != null ? this.namespaceSelector.build() : null;
  }
  
  public A withNamespaceSelector(V1LabelSelector namespaceSelector) {
    this._visitables.remove(this.namespaceSelector);
    if (namespaceSelector != null) {
        this.namespaceSelector = new V1LabelSelectorBuilder(namespaceSelector);
        this._visitables.get("namespaceSelector").add(this.namespaceSelector);
    } else {
        this.namespaceSelector = null;
        this._visitables.get("namespaceSelector").remove(this.namespaceSelector);
    }
    return (A) this;
  }
  
  public boolean hasNamespaceSelector() {
    return this.namespaceSelector != null;
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelector() {
    return new NamespaceSelectorNested(null);
  }
  
  public NamespaceSelectorNested<A> withNewNamespaceSelectorLike(V1LabelSelector item) {
    return new NamespaceSelectorNested(item);
  }
  
  public NamespaceSelectorNested<A> editNamespaceSelector() {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(null));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(new V1LabelSelectorBuilder().build()));
  }
  
  public NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(V1LabelSelector item) {
    return withNewNamespaceSelectorLike(java.util.Optional.ofNullable(buildNamespaceSelector()).orElse(item));
  }
  
  public A addToNamespaces(int index,String item) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    this.namespaces.add(index, item);
    return (A)this;
  }
  
  public A setToNamespaces(int index,String item) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    this.namespaces.set(index, item); return (A)this;
  }
  
  public A addToNamespaces(java.lang.String... items) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    for (String item : items) {this.namespaces.add(item);} return (A)this;
  }
  
  public A addAllToNamespaces(Collection<String> items) {
    if (this.namespaces == null) {this.namespaces = new ArrayList<String>();}
    for (String item : items) {this.namespaces.add(item);} return (A)this;
  }
  
  public A removeFromNamespaces(java.lang.String... items) {
    if (this.namespaces == null) return (A)this;
    for (String item : items) { this.namespaces.remove(item);} return (A)this;
  }
  
  public A removeAllFromNamespaces(Collection<String> items) {
    if (this.namespaces == null) return (A)this;
    for (String item : items) { this.namespaces.remove(item);} return (A)this;
  }
  
  public List<String> getNamespaces() {
    return this.namespaces;
  }
  
  public String getNamespace(int index) {
    return this.namespaces.get(index);
  }
  
  public String getFirstNamespace() {
    return this.namespaces.get(0);
  }
  
  public String getLastNamespace() {
    return this.namespaces.get(namespaces.size() - 1);
  }
  
  public String getMatchingNamespace(Predicate<String> predicate) {
      for (String item : namespaces) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingNamespace(Predicate<String> predicate) {
      for (String item : namespaces) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withNamespaces(List<String> namespaces) {
    if (namespaces != null) {
        this.namespaces = new ArrayList();
        for (String item : namespaces) {
          this.addToNamespaces(item);
        }
    } else {
      this.namespaces = null;
    }
    return (A) this;
  }
  
  public A withNamespaces(java.lang.String... namespaces) {
    if (this.namespaces != null) {this.namespaces.clear(); _visitables.remove("namespaces"); }
    if (namespaces != null) {for (String item :namespaces){ this.addToNamespaces(item);}} return (A) this;
  }
  
  public boolean hasNamespaces() {
    return this.namespaces != null && !this.namespaces.isEmpty();
  }
  
  public String getTopologyKey() {
    return this.topologyKey;
  }
  
  public A withTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return (A) this;
  }
  
  public boolean hasTopologyKey() {
    return this.topologyKey != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodAffinityTermFluent that = (V1PodAffinityTermFluent) o;
    if (!java.util.Objects.equals(labelSelector, that.labelSelector)) return false;
    if (!java.util.Objects.equals(namespaceSelector, that.namespaceSelector)) return false;
    if (!java.util.Objects.equals(namespaces, that.namespaces)) return false;
    if (!java.util.Objects.equals(topologyKey, that.topologyKey)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(labelSelector,  namespaceSelector,  namespaces,  topologyKey,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (labelSelector != null) { sb.append("labelSelector:"); sb.append(labelSelector + ","); }
    if (namespaceSelector != null) { sb.append("namespaceSelector:"); sb.append(namespaceSelector + ","); }
    if (namespaces != null && !namespaces.isEmpty()) { sb.append("namespaces:"); sb.append(namespaces + ","); }
    if (topologyKey != null) { sb.append("topologyKey:"); sb.append(topologyKey); }
    sb.append("}");
    return sb.toString();
  }
  public class LabelSelectorNested<N> extends V1LabelSelectorFluent<LabelSelectorNested<N>> implements Nested<N>{
    LabelSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1PodAffinityTermFluent.this.withLabelSelector(builder.build());
    }
    
    public N endLabelSelector() {
      return and();
    }
    
  
  }
  public class NamespaceSelectorNested<N> extends V1LabelSelectorFluent<NamespaceSelectorNested<N>> implements Nested<N>{
    NamespaceSelectorNested(V1LabelSelector item) {
      this.builder = new V1LabelSelectorBuilder(this, item);
    }
    V1LabelSelectorBuilder builder;
    
    public N and() {
      return (N) V1PodAffinityTermFluent.this.withNamespaceSelector(builder.build());
    }
    
    public N endNamespaceSelector() {
      return and();
    }
    
  
  }

}