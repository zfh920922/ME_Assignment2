/**
 */
package at.ac.tuwien.big.statesml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.AttributeValueSpecification#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getAttributeValueSpecification()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AttributeSpecificationValidType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AttributeSpecificationValidType='self.attribute.type = self.parameterValue.parameter.type'"
 * @generated
 */
public interface AttributeValueSpecification extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getAttributeValueSpecification_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.statesml.AttributeValueSpecification#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

} // AttributeValueSpecification
