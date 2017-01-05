/**
 * Copyright (C) 2014-2017 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.sbdh;

import java.util.List;

import javax.annotation.concurrent.Immutable;

import com.helger.commons.annotation.PresentForCodeCoverage;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.io.resource.ClassPathResource;
import com.helger.commons.io.resource.IReadableResource;

/**
 * Contains all the constants for SBDH handling.
 *
 * @author Philip Helger
 */
@Immutable
public final class CSBDH
{
  /**
   * XML Schema resources for SBDH 1.3 - since include is used, the other
   * schemas must not be specified.
   */
  public static final String SBDH_XSD_PATH = "/schemas/sbdh/StandardBusinessDocumentHeader.xsd";
  /**
   * XML Schema resources for SBDH 1.3 - since include is used, the other
   * schemas must not be specified.
   */
  public static final List <? extends IReadableResource> SBDH_XSDS = CollectionHelper.makeUnmodifiable (new ClassPathResource (SBDH_XSD_PATH));

  /** Namespace URI for SBDH 1.3 */
  public static final String SBDH_NS = "http://www.unece.org/cefact/namespaces/StandardBusinessDocumentHeader";

  @PresentForCodeCoverage
  private static final CSBDH s_aInstance = new CSBDH ();

  private CSBDH ()
  {}
}
