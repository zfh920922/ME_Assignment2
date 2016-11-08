/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.StateSystem#getNodes <em>Nodes</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.StateSystem#getEdges <em>Edges</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.StateSystem#getProcessibleEvents <em>Processible Events</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.StateSystem#getSystemUnit <em>System Unit</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.StateSystem#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getStateSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AttributeSpecificationValidAttribute OneInitialState MaxOneTerminalState NoIncomingEdgeForInitalState OneOutgoingEdgeForInitalState OneIncomingEdgeForTerminalState NoOutgoingEdgeForTerminalState'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AttributeSpecificationValidAttribute='self.attributes->union(self.systemUnit.attributes)->includesAll(self.processibleEvents->selectByKind(ChangeEvent).changeExpression.booleanFunctionCall.parameters.valueSpecification->selectByKind(AttributeValueSpecification).attribute)' OneInitialState='self.nodes->selectByKind(State)->select(s | s.initial)->size() = 1' MaxOneTerminalState='self.nodes->selectByKind(State)->select(s | s.terminal)->size() <= 1' NoIncomingEdgeForInitalState='self.edges.target->selectByKind(State)->select(s | s.initial)->size() = 0' OneOutgoingEdgeForInitalState='self.edges.source->selectByKind(State)->select(s | s.initial)->size() = 1' OneIncomingEdgeForTerminalState='self.nodes->selectByType(State)->select(s |\n\t\t\t\ts.terminal)->size() = 0 or self.edges.target->selectByType(State)->select(s | s.terminal)->size() = 1' NoOutgoingEdgeForTerminalState='self.edges.source->selectByKind(State)->select(s | s.terminal)->size() = 0'"
 * @generated
 */
public interface StateSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getStateSystem_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.Edge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edges</em>' containment reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getStateSystem_Edges()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdges();

	/**
	 * Returns the value of the '<em><b>Processible Events</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processible Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processible Events</em>' containment reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getStateSystem_ProcessibleEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getProcessibleEvents();

	/**
	 * Returns the value of the '<em><b>System Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit</em>' reference.
	 * @see #setSystemUnit(SystemUnit)
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getStateSystem_SystemUnit()
	 * @model required="true"
	 * @generated
	 */
	SystemUnit getSystemUnit();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.statesml.StateSystem#getSystemUnit <em>System Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit</em>' reference.
	 * @see #getSystemUnit()
	 * @generated
	 */
	void setSystemUnit(SystemUnit value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getStateSystem_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // StateSystem
