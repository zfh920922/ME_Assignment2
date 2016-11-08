/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.SystemUnitLibrary#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getSystemUnitLibrary()
 * @model
 * @generated
 */
public interface SystemUnitLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.SystemUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getSystemUnitLibrary_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnit> getUnits();

} // SystemUnitLibrary
