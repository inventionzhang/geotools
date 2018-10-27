/**
 *
 * $Id$
 */
package net.opengis.wfs.validation;

import javax.xml.namespace.QName;

import net.opengis.wfs.OutputFormatListType;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link net.opengis.wfs.GMLObjectTypeType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GMLObjectTypeTypeValidator {
  boolean validate();

  boolean validateName(QName value);
  boolean validateTitle(String value);
  boolean validateAbstract(String value);
  boolean validateKeywords(EList value);
  boolean validateOutputFormats(OutputFormatListType value);
}