/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.Function#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getFunction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtMostOneReturnParameter'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AtMostOneReturnParameter='self.parameters->select(p |\n\t\t\t\tp.direction = ParameterDirectionKind::RETURN)->size() <= 1'"
 * @generated
 */
public interface Function extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Function
