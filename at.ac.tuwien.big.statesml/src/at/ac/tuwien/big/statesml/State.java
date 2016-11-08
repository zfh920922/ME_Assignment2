/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.State#getActionSequence <em>Action Sequence</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.State#isInitial <em>Initial</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.State#isTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StateTypeIsValid NoActionsForIntialOrTerminalState RegularStateEdgesAreValid OutgoingEdgeTargetIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StateTypeIsValid='not (self.terminal and self.initial)' NoActionsForIntialOrTerminalState='not (self.initial or self.terminal) or self.actionSequence->isEmpty()' RegularStateEdgesAreValid='(self.initial or self.terminal) or (self.incomingEdges->size() = 1 and self.outgoingEdges->size() = 1)' OutgoingEdgeTargetIsValid='self.outgoingEdges.target->forAll(t |\n\t\t\tt.oclIsTypeOf(Transition) or t.oclIsTypeOf(SelectionDivergence))'"
 * @generated
 */
public interface State extends Node {
	/**
	 * Returns the value of the '<em><b>Action Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.FunctionCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Sequence</em>' containment reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getState_ActionSequence()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionCall> getActionSequence();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' attribute.
	 * @see #setInitial(boolean)
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getState_Initial()
	 * @model required="true"
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.statesml.State#isInitial <em>Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' attribute.
	 * @see #setTerminal(boolean)
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getState_Terminal()
	 * @model required="true"
	 * @generated
	 */
	boolean isTerminal();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.statesml.State#isTerminal <em>Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' attribute.
	 * @see #isTerminal()
	 * @generated
	 */
	void setTerminal(boolean value);

} // State
