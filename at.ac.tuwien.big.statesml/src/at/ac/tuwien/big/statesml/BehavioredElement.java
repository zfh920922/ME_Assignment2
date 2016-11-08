/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.BehavioredElement#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getBehavioredElement()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getBehavioredElement_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

} // BehavioredElement
