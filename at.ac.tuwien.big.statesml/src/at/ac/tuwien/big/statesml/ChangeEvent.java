/**
 */
package at.ac.tuwien.big.statesml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.ChangeEvent#getChangeExpression <em>Change Expression</em>}</li>
 * </ul>
 *
 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getChangeEvent()
 * @model
 * @generated
 */
public interface ChangeEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Change Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Expression</em>' containment reference.
	 * @see #setChangeExpression(ChangeExpression)
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#getChangeEvent_ChangeExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ChangeExpression getChangeExpression();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.statesml.ChangeEvent#getChangeExpression <em>Change Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Expression</em>' containment reference.
	 * @see #getChangeExpression()
	 * @generated
	 */
	void setChangeExpression(ChangeExpression value);

} // ChangeEvent
