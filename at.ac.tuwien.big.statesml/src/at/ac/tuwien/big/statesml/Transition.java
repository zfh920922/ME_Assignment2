/**
 */
package at.ac.tuwien.big.statesml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.Transition#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneIncomingEdge OneOutgoingEdge OutgoingEdgeTargetIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneIncomingEdge='self.incomingEdges->size() = 1' OneOutgoingEdge='self.outgoingEdges->size() = 1' OutgoingEdgeTargetIsValid='self.outgoingEdges.target->forAll(t |\n\t\t\tt.oclIsTypeOf(State) or t.oclIsTypeOf(SelectionConvergence))'"
 * @generated
 */
public interface Transition extends Node {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(Trigger)
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getTransition_Trigger()
	 * @model containment="true"
	 * @generated
	 */
	Trigger getTrigger();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.statesml.Transition#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Trigger value);

} // Transition
