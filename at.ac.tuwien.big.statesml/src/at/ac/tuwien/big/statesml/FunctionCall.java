/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.FunctionCall#getFunction <em>Function</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.FunctionCall#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getFunctionCall()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OneParameterValueForEachDefinedParameter'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OneParameterValueForEachDefinedParameter='self.parameters.parameter->includesAll(self.function.parameters->select(p |\n\t\t\t\tp.direction = ParameterDirectionKind::IN))'"
 * @generated
 */
public interface FunctionCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Function)
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getFunctionCall_Function()
	 * @model required="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.statesml.FunctionCall#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.statesml.ParameterValue}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.statesml.ParameterValue#getFunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getFunctionCall_Parameters()
	 * @see at.ac.tuwien.big.statesml.ParameterValue#getFunctionCall
	 * @model opposite="functionCall" containment="true"
	 * @generated
	 */
	EList<ParameterValue> getParameters();

} // FunctionCall
