package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1HorizontalPodAutoscalerListFluentImpl<A extends V1HorizontalPodAutoscalerListFluent<A>> extends BaseFluent<A> implements V1HorizontalPodAutoscalerListFluent<A>{
  public V1HorizontalPodAutoscalerListFluentImpl() {
  }
  public V1HorizontalPodAutoscalerListFluentImpl(V1HorizontalPodAutoscalerList instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
  }
  private String apiVersion;
  private ArrayList<V1HorizontalPodAutoscalerBuilder> items;
  private String kind;
  private V1ListMetaBuilder metadata;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public A addToItems(int index,V1HorizontalPodAutoscaler item) {
    if (this.items == null) {this.items = new ArrayList<V1HorizontalPodAutoscalerBuilder>();}
    V1HorizontalPodAutoscalerBuilder builder = new V1HorizontalPodAutoscalerBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").add(index, builder); items.add(index, builder);}
    return (A)this;
  }
  public A setToItems(int index,V1HorizontalPodAutoscaler item) {
    if (this.items == null) {this.items = new ArrayList<V1HorizontalPodAutoscalerBuilder>();}
    V1HorizontalPodAutoscalerBuilder builder = new V1HorizontalPodAutoscalerBuilder(item);
    if (index < 0 || index >= items.size()) { _visitables.get("items").add(builder); items.add(builder); } else { _visitables.get("items").set(index, builder); items.set(index, builder);}
    return (A)this;
  }
  public A addToItems(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscaler... items) {
    if (this.items == null) {this.items = new ArrayList<V1HorizontalPodAutoscalerBuilder>();}
    for (V1HorizontalPodAutoscaler item : items) {V1HorizontalPodAutoscalerBuilder builder = new V1HorizontalPodAutoscalerBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A addAllToItems(Collection<V1HorizontalPodAutoscaler> items) {
    if (this.items == null) {this.items = new ArrayList<V1HorizontalPodAutoscalerBuilder>();}
    for (V1HorizontalPodAutoscaler item : items) {V1HorizontalPodAutoscalerBuilder builder = new V1HorizontalPodAutoscalerBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
  }
  public A removeFromItems(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscaler... items) {
    for (V1HorizontalPodAutoscaler item : items) {V1HorizontalPodAutoscalerBuilder builder = new V1HorizontalPodAutoscalerBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeAllFromItems(Collection<V1HorizontalPodAutoscaler> items) {
    for (V1HorizontalPodAutoscaler item : items) {V1HorizontalPodAutoscalerBuilder builder = new V1HorizontalPodAutoscalerBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
  }
  public A removeMatchingFromItems(Predicate<V1HorizontalPodAutoscalerBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<V1HorizontalPodAutoscalerBuilder> each = items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      V1HorizontalPodAutoscalerBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A)this;
  }
  
  /**
   * This method has been deprecated, please use method buildItems instead.
   * @return The buildable object.
   */
  @Deprecated
  public List<V1HorizontalPodAutoscaler> getItems() {
    return items != null ? build(items) : null;
  }
  public List<V1HorizontalPodAutoscaler> buildItems() {
    return items != null ? build(items) : null;
  }
  public V1HorizontalPodAutoscaler buildItem(int index) {
    return this.items.get(index).build();
  }
  public V1HorizontalPodAutoscaler buildFirstItem() {
    return this.items.get(0).build();
  }
  public V1HorizontalPodAutoscaler buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }
  public V1HorizontalPodAutoscaler buildMatchingItem(Predicate<V1HorizontalPodAutoscalerBuilder> predicate) {
    for (V1HorizontalPodAutoscalerBuilder item: items) { if(predicate.test(item)){ return item.build();} } return null;
  }
  public Boolean hasMatchingItem(Predicate<V1HorizontalPodAutoscalerBuilder> predicate) {
    for (V1HorizontalPodAutoscalerBuilder item: items) { if(predicate.test(item)){ return true;} } return false;
  }
  public A withItems(List<V1HorizontalPodAutoscaler> items) {
    if (this.items != null) { _visitables.get("items").clear();}
    if (items != null) {this.items = new ArrayList(); for (V1HorizontalPodAutoscaler item : items){this.addToItems(item);}} else { this.items = null;} return (A) this;
  }
  public A withItems(io.kubernetes.client.openapi.models.V1HorizontalPodAutoscaler... items) {
    if (this.items != null) {this.items.clear(); _visitables.remove("items"); }
    if (items != null) {for (V1HorizontalPodAutoscaler item :items){ this.addToItems(item);}} return (A) this;
  }
  public Boolean hasItems() {
    return items != null && !items.isEmpty();
  }
  public V1HorizontalPodAutoscalerListFluentImpl.ItemsNested<A> addNewItem() {
    return new V1HorizontalPodAutoscalerListFluentImpl.ItemsNestedImpl();
  }
  public V1HorizontalPodAutoscalerListFluentImpl.ItemsNested<A> addNewItemLike(V1HorizontalPodAutoscaler item) {
    return new V1HorizontalPodAutoscalerListFluentImpl.ItemsNestedImpl(-1, item);
  }
  public V1HorizontalPodAutoscalerListFluentImpl.ItemsNested<A> setNewItemLike(int index,V1HorizontalPodAutoscaler item) {
    return new V1HorizontalPodAutoscalerListFluentImpl.ItemsNestedImpl(index, item);
  }
  public V1HorizontalPodAutoscalerListFluentImpl.ItemsNested<A> editItem(int index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }
  public V1HorizontalPodAutoscalerListFluentImpl.ItemsNested<A> editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }
  public V1HorizontalPodAutoscalerListFluentImpl.ItemsNested<A> editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }
  public V1HorizontalPodAutoscalerListFluentImpl.ItemsNested<A> editMatchingItem(Predicate<V1HorizontalPodAutoscalerBuilder> predicate) {
    int index = -1;
    for (int i=0;i<items.size();i++) { 
    if (predicate.test(items.get(i))) {index = i; break;}
    } 
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
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
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ListMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ListMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ListMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ListMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1HorizontalPodAutoscalerListFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1HorizontalPodAutoscalerListFluentImpl.MetadataNestedImpl();
  }
  public V1HorizontalPodAutoscalerListFluentImpl.MetadataNested<A> withNewMetadataLike(V1ListMeta item) {
    return new V1HorizontalPodAutoscalerListFluentImpl.MetadataNestedImpl(item);
  }
  public V1HorizontalPodAutoscalerListFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1HorizontalPodAutoscalerListFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ListMetaBuilder().build());
  }
  public V1HorizontalPodAutoscalerListFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ListMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1HorizontalPodAutoscalerListFluentImpl that = (V1HorizontalPodAutoscalerListFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(items, that.items)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  items,  kind,  metadata,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (items != null) { sb.append("items:"); sb.append(items + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata); }
    sb.append("}");
    return sb.toString();
  }
  class ItemsNestedImpl<N> extends V1HorizontalPodAutoscalerFluentImpl<V1HorizontalPodAutoscalerListFluentImpl.ItemsNested<N>> implements V1HorizontalPodAutoscalerListFluentImpl.ItemsNested<N>,Nested<N>{
    ItemsNestedImpl(int index,V1HorizontalPodAutoscaler item) {
      this.index = index;
      this.builder = new V1HorizontalPodAutoscalerBuilder(this, item);
    }
    ItemsNestedImpl() {
      this.index = -1;
      this.builder = new V1HorizontalPodAutoscalerBuilder(this);
    }
    V1HorizontalPodAutoscalerBuilder builder;
    int index;
    public N and() {
      return (N) V1HorizontalPodAutoscalerListFluentImpl.this.setToItems(index,builder.build());
    }
    public N endItem() {
      return and();
    }
    
  }
  class MetadataNestedImpl<N> extends V1ListMetaFluentImpl<V1HorizontalPodAutoscalerListFluentImpl.MetadataNested<N>> implements V1HorizontalPodAutoscalerListFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ListMeta item) {
      this.builder = new V1ListMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ListMetaBuilder(this);
    }
    V1ListMetaBuilder builder;
    public N and() {
      return (N) V1HorizontalPodAutoscalerListFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  
}