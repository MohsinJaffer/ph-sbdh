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
package com.helger.sbdh.builder;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.xml.validation.Schema;

import org.unece.cefact.namespaces.sbdh.StandardBusinessDocument;
import org.unece.cefact.namespaces.sbdh.StandardBusinessDocumentHeader;

import com.helger.commons.annotation.Nonempty;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.collection.ext.ICommonsList;
import com.helger.jaxb.builder.IJAXBDocumentType;
import com.helger.jaxb.builder.JAXBDocumentType;
import com.helger.sbdh.CSBDH;

/**
 * Enumeration with all available SBDH document types.
 *
 * @author Philip Helger
 */
public enum ESBDHDocumentType implements IJAXBDocumentType
{
  SBD (StandardBusinessDocument.class, CSBDH.SBDH_XSD_PATH),
  SBDH (StandardBusinessDocumentHeader.class, CSBDH.SBDH_XSD_PATH);

  private final JAXBDocumentType m_aDocType;

  private ESBDHDocumentType (@Nonnull final Class <?> aClass, @Nonnull final String sXSDPath)
  {
    m_aDocType = new JAXBDocumentType (aClass, CollectionHelper.newList (sXSDPath), null);
  }

  @Nonnull
  public Class <?> getImplementationClass ()
  {
    return m_aDocType.getImplementationClass ();
  }

  @Nonnull
  @Nonempty
  @ReturnsMutableCopy
  public ICommonsList <String> getAllXSDPaths ()
  {
    return m_aDocType.getAllXSDPaths ();
  }

  @Nonnull
  public String getNamespaceURI ()
  {
    return m_aDocType.getNamespaceURI ();
  }

  @Nonnull
  @Nonempty
  public String getLocalName ()
  {
    return m_aDocType.getLocalName ();
  }

  @Nonnull
  public Schema getSchema (@Nullable final ClassLoader aClassLoader)
  {
    return m_aDocType.getSchema (aClassLoader);
  }
}
