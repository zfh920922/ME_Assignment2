/**
 */
package at.ac.tuwien.big.statesml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Convergence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getSelectionConvergence()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AtLeastTwoIncomingEdges OneOutgoingEdge OutgoingEdgeTargetIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AtLeastTwoIncomingEdges='self.incomingEdges->size() >= 2' OneOutgoingEdge='self.outgoingEdges->size() = 1' OutgoingEdgeTargetIsValid='self.outgoingEdges.target->forAll(t | t.oclIsTypeOf(State))'"
 * @generated
 */
public interface SelectionConvergence extends Node {
} // SelectionConvergence
