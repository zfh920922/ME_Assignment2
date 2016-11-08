/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.ChangeExpression#getBooleanFunctionCall <em>Boolean Function Call</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getChangeExpression()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='HasBooleanReturnParameter'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot HasBooleanReturnParameter='self.booleanFunctionCall.function.parameters->exists(p |\n\t\t\tp.direction = ParameterDirectionKind::RETURN and p.type.name = \'Boolean\')'"
 * @generated
 */
public interface ChangeExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Boolean Function Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Function Call</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Function Call</em>' containment reference.
	 * @see #setBooleanFunctionCall(FunctionCall)
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getChangeExpression_BooleanFunctionCall()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FunctionCall getBooleanFunctionCall();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.statesml.ChangeExpression#getBooleanFunctionCall <em>Boolean Function Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Function Call</em>' containment reference.
	 * @see #getBooleanFunctionCall()
	 * @generated
	 */
	void setBooleanFunctionCall(FunctionCall value);

} // ChangeExpression
