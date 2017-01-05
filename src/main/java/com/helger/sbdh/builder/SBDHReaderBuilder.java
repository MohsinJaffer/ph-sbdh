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
import javax.annotation.concurrent.NotThreadSafe;

import com.helger.jaxb.builder.JAXBReaderBuilder;

/**
 * A reader builder for SBDH documents.
 *
 * @author Philip Helger
 * @param <JAXBTYPE>
 *        The SBDH implementation class to be read
 */
@NotThreadSafe
public class SBDHReaderBuilder <JAXBTYPE> extends JAXBReaderBuilder <JAXBTYPE, SBDHReaderBuilder <JAXBTYPE>>
{
  public SBDHReaderBuilder (@Nonnull final ESBDHDocumentType eDocType, @Nonnull final Class <JAXBTYPE> aImplClass)
  {
    super (eDocType, aImplClass);
  }

  public SBDHReaderBuilder (@Nonnull final Class <JAXBTYPE> aClass)
  {
    this (SBDHDocumentTypes.getDocumentTypeOfImplementationClass (aClass), aClass);
  }

  /**
   * Create a new reader builder.
   *
   * @param aClass
   *        The UBL class to be read. May not be <code>null</code>.
   * @return The new reader builder. Never <code>null</code>.
   * @param <T>
   *        The SBDH document implementation type
   */
  @Nonnull
  public static <T> SBDHReaderBuilder <T> create (@Nonnull final Class <T> aClass)
  {
    return new SBDHReaderBuilder <> (aClass);
  }

  /**
   * Create a new reader builder that is not typed, because only the document
   * type enumeration value is available.
   *
   * @param eDocType
   *        The SBDH document type to be read. May not be <code>null</code> .
   * @return The new reader builder. Never <code>null</code>.
   */
  @Nonnull
  public static SBDHReaderBuilder <?> createGeneric (@Nonnull final ESBDHDocumentType eDocType)
  {
    return new SBDHReaderBuilder <> (eDocType, Object.class);
  }
}
