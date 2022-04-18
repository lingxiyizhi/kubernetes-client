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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
public interface V1EndpointFluent<A extends V1EndpointFluent<A>> extends Fluent<A> {
  public A addToAddresses(Integer index, String item);

  public A setToAddresses(java.lang.Integer index, java.lang.String item);

  public A addToAddresses(java.lang.String... items);

  public A addAllToAddresses(Collection<java.lang.String> items);

  public A removeFromAddresses(java.lang.String... items);

  public A removeAllFromAddresses(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getAddresses();

  public java.lang.String getAddress(java.lang.Integer index);

  public java.lang.String getFirstAddress();

  public java.lang.String getLastAddress();

  public java.lang.String getMatchingAddress(Predicate<java.lang.String> predicate);

  public Boolean hasMatchingAddress(java.util.function.Predicate<java.lang.String> predicate);

  public A withAddresses(java.util.List<java.lang.String> addresses);

  public A withAddresses(java.lang.String... addresses);

  public java.lang.Boolean hasAddresses();

  /**
   * This method has been deprecated, please use method buildConditions instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1EndpointConditions getConditions();

  public io.kubernetes.client.openapi.models.V1EndpointConditions buildConditions();

  public A withConditions(io.kubernetes.client.openapi.models.V1EndpointConditions conditions);

  public java.lang.Boolean hasConditions();

  public V1EndpointFluent.ConditionsNested<A> withNewConditions();

  public io.kubernetes.client.openapi.models.V1EndpointFluent.ConditionsNested<A>
      withNewConditionsLike(io.kubernetes.client.openapi.models.V1EndpointConditions item);

  public io.kubernetes.client.openapi.models.V1EndpointFluent.ConditionsNested<A> editConditions();

  public io.kubernetes.client.openapi.models.V1EndpointFluent.ConditionsNested<A>
      editOrNewConditions();

  public io.kubernetes.client.openapi.models.V1EndpointFluent.ConditionsNested<A>
      editOrNewConditionsLike(io.kubernetes.client.openapi.models.V1EndpointConditions item);

  public A addToDeprecatedTopology(java.lang.String key, java.lang.String value);

  public A addToDeprecatedTopology(Map<java.lang.String, java.lang.String> map);

  public A removeFromDeprecatedTopology(java.lang.String key);

  public A removeFromDeprecatedTopology(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getDeprecatedTopology();

  public <K, V> A withDeprecatedTopology(
      java.util.Map<java.lang.String, java.lang.String> deprecatedTopology);

  public java.lang.Boolean hasDeprecatedTopology();

  /**
   * This method has been deprecated, please use method buildHints instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1EndpointHints getHints();

  public io.kubernetes.client.openapi.models.V1EndpointHints buildHints();

  public A withHints(io.kubernetes.client.openapi.models.V1EndpointHints hints);

  public java.lang.Boolean hasHints();

  public V1EndpointFluent.HintsNested<A> withNewHints();

  public io.kubernetes.client.openapi.models.V1EndpointFluent.HintsNested<A> withNewHintsLike(
      io.kubernetes.client.openapi.models.V1EndpointHints item);

  public io.kubernetes.client.openapi.models.V1EndpointFluent.HintsNested<A> editHints();

  public io.kubernetes.client.openapi.models.V1EndpointFluent.HintsNested<A> editOrNewHints();

  public io.kubernetes.client.openapi.models.V1EndpointFluent.HintsNested<A> editOrNewHintsLike(
      io.kubernetes.client.openapi.models.V1EndpointHints item);

  public java.lang.String getHostname();

  public A withHostname(java.lang.String hostname);

  public java.lang.Boolean hasHostname();

  public java.lang.String getNodeName();

  public A withNodeName(java.lang.String nodeName);

  public java.lang.Boolean hasNodeName();

  /**
   * This method has been deprecated, please use method buildTargetRef instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public V1ObjectReference getTargetRef();

  public io.kubernetes.client.openapi.models.V1ObjectReference buildTargetRef();

  public A withTargetRef(io.kubernetes.client.openapi.models.V1ObjectReference targetRef);

  public java.lang.Boolean hasTargetRef();

  public V1EndpointFluent.TargetRefNested<A> withNewTargetRef();

  public io.kubernetes.client.openapi.models.V1EndpointFluent.TargetRefNested<A>
      withNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public io.kubernetes.client.openapi.models.V1EndpointFluent.TargetRefNested<A> editTargetRef();

  public io.kubernetes.client.openapi.models.V1EndpointFluent.TargetRefNested<A>
      editOrNewTargetRef();

  public io.kubernetes.client.openapi.models.V1EndpointFluent.TargetRefNested<A>
      editOrNewTargetRefLike(io.kubernetes.client.openapi.models.V1ObjectReference item);

  public java.lang.String getZone();

  public A withZone(java.lang.String zone);

  public java.lang.Boolean hasZone();

  public interface ConditionsNested<N>
      extends Nested<N>, V1EndpointConditionsFluent<V1EndpointFluent.ConditionsNested<N>> {
    public N and();

    public N endConditions();
  }

  public interface HintsNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1EndpointHintsFluent<V1EndpointFluent.HintsNested<N>> {
    public N and();

    public N endHints();
  }

  public interface TargetRefNested<N>
      extends io.kubernetes.client.fluent.Nested<N>,
          V1ObjectReferenceFluent<V1EndpointFluent.TargetRefNested<N>> {
    public N and();

    public N endTargetRef();
  }
}
