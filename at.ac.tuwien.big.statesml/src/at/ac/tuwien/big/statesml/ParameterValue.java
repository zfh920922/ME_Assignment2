/**
 */
package at.ac.tuwien.big.statesml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.ParameterValue#getValueSpecification <em>Value Specification</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.ParameterValue#getParameter <em>Parameter</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.ParameterValue#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getParameterValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FunctionCallParameterValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot FunctionCallParameterValid='self.functionCall.function.parameters->includes(self.parameter)'"
 * @generated
 */
public interface ParameterValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Specification</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.statesml.ValueSpecification#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Specification</em>' containment reference.
	 * @see #setValueSpecification(ValueSpecification)
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getParameterValue_ValueSpecification()
	 * @see at.ac.tuwien.big.statesml.ValueSpecification#getParameterValue
	 * @model opposite="parameterValue" containment="true" required="true"
	 * @generated
	 */
	ValueSpecification getValueSpecification();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.statesml.ParameterValue#getValueSpecification <em>Value Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Specification</em>' containment reference.
	 * @see #getValueSpecification()
	 * @generated
	 */
	void setValueSpecification(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getParameterValue_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.statesml.ParameterValue#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Function Call</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.statesml.FunctionCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Call</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Call</em>' container reference.
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getParameterValue_FunctionCall()
	 * @see at.ac.tuwien.big.statesml.FunctionCall#getParameters
	 * @model opposite="parameters" required="true" transient="false" changeable="false"
	 * @generated
	 */
	FunctionCall getFunctionCall();

} // ParameterValue
