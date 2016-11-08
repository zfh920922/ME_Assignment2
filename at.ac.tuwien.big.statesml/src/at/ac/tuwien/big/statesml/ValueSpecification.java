/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.ValueSpecification#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getValueSpecification()
 * @model abstract="true"
 * @generated
 */
public interface ValueSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.statesml.ParameterValue#getValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Value</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value</em>' container reference.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getValueSpecification_ParameterValue()
	 * @see at.ac.tuwien.big.statesml.ParameterValue#getValueSpecification
	 * @model opposite="valueSpecification" required="true" transient="false" changeable="false"
	 * @generated
	 */
	ParameterValue getParameterValue();

} // ValueSpecification
