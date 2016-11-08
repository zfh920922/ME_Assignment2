/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.Node#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.Node#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getNode_OutgoingEdges()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.oclContainer.oclAsType(StateSystem).edges->select(e | e.source = self)'"
	 * @generated
	 */
	EList<Edge> getOutgoingEdges();

	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getNode_IncomingEdges()
	 * @model derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.oclContainer.oclAsType(StateSystem).edges->select(e | e.target = self)'"
	 * @generated
	 */
	EList<Edge> getIncomingEdges();

} // Node
