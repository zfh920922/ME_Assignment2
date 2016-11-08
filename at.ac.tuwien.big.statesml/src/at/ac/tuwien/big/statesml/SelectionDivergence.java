/**
 */
package at.ac.tuwien.big.statesml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Divergence</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getSelectionDivergence()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneIncomingEdge AtLeastTwoOutgoingEdges SuccessorTransitionMustDefineTrigger OutgoingEdgeTargetIsValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneIncomingEdge='self.incomingEdges->size() = 1' AtLeastTwoOutgoingEdges='self.outgoingEdges->size() >= 2' SuccessorTransitionMustDefineTrigger='self.outgoingEdges.target->selectByType(Transition)->select(t |\n\t\t\tt.trigger.oclIsUndefined())->size() <= 1' OutgoingEdgeTargetIsValid='self.outgoingEdges.target->forAll(t | t.oclIsTypeOf(Transition))'"
 * @generated
 */
public interface SelectionDivergence extends Node {
} // SelectionDivergence
