/*
 * Copyright 2006-2008 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.enunciate.modules.gwt;

import java.util.UUID;

/**
 * @author Ryan Heaton
 */
public class BeanOneDotOne {

  private UUID property1;
  private double[] property2;

  public UUID getProperty1() {
    return property1;
  }

  public void setProperty1(UUID property1) {
    this.property1 = property1;
  }

  public double[] getProperty2() {
    return property2;
  }

  public void setProperty2(double[] property2) {
    this.property2 = property2;
  }
}
