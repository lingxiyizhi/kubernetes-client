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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1IngressTLSFluent<A extends V1IngressTLSFluent<A>> extends Fluent<A> {
  public A addToHosts(Integer index, String item);

  public A setToHosts(java.lang.Integer index, java.lang.String item);

  public A addToHosts(java.lang.String... items);

  public A addAllToHosts(Collection<java.lang.String> items);

  public A removeFromHosts(java.lang.String... items);

  public A removeAllFromHosts(java.util.Collection<java.lang.String> items);

  public List<java.lang.String> getHosts();

  public java.lang.String getHost(java.lang.Integer index);

  public java.lang.String getFirstHost();

  public java.lang.String getLastHost();

  public java.lang.String getMatchingHost(Predicate<java.lang.String> predicate);

  public Boolean hasMatchingHost(java.util.function.Predicate<java.lang.String> predicate);

  public A withHosts(java.util.List<java.lang.String> hosts);

  public A withHosts(java.lang.String... hosts);

  public java.lang.Boolean hasHosts();

  public java.lang.String getSecretName();

  public A withSecretName(java.lang.String secretName);

  public java.lang.Boolean hasSecretName();
}
