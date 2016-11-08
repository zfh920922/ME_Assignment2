/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.DataTypeLibrary#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getDataTypeLibrary()
 * @model
 * @generated
 */
public interface DataTypeLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getDataTypeLibrary_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getTypes();

} // DataTypeLibrary
