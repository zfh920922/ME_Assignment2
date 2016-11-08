/**
 */
package at.ac.tuwien.big.statesml.impl;

import at.ac.tuwien.big.statesml.ChangeExpression;
import at.ac.tuwien.big.statesml.FunctionCall;
import at.ac.tuwien.big.statesml.StatesMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.impl.ChangeExpressionImpl#getBooleanFunctionCall <em>Boolean Function Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeExpressionImpl extends MinimalEObjectImpl.Container implements ChangeExpression {
	/**
	 * The cached value of the '{@link #getBooleanFunctionCall() <em>Boolean Function Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanFunctionCall()
	 * @generated
	 * @ordered
	 */
	protected FunctionCall booleanFunctionCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesMLPackage.Literals.CHANGE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall getBooleanFunctionCall() {
		return booleanFunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanFunctionCall(FunctionCall newBooleanFunctionCall, NotificationChain msgs) {
		FunctionCall oldBooleanFunctionCall = booleanFunctionCall;
		booleanFunctionCall = newBooleanFunctionCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesMLPackage.CHANGE_EXPRESSION__BOOLEAN_FUNCTION_CALL, oldBooleanFunctionCall, newBooleanFunctionCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanFunctionCall(FunctionCall newBooleanFunctionCall) {
		if (newBooleanFunctionCall != booleanFunctionCall) {
			NotificationChain msgs = null;
			if (booleanFunctionCall != null)
				msgs = ((InternalEObject)booleanFunctionCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatesMLPackage.CHANGE_EXPRESSION__BOOLEAN_FUNCTION_CALL, null, msgs);
			if (newBooleanFunctionCall != null)
				msgs = ((InternalEObject)newBooleanFunctionCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatesMLPackage.CHANGE_EXPRESSION__BOOLEAN_FUNCTION_CALL, null, msgs);
			msgs = basicSetBooleanFunctionCall(newBooleanFunctionCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesMLPackage.CHANGE_EXPRESSION__BOOLEAN_FUNCTION_CALL, newBooleanFunctionCall, newBooleanFunctionCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesMLPackage.CHANGE_EXPRESSION__BOOLEAN_FUNCTION_CALL:
				return basicSetBooleanFunctionCall(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesMLPackage.CHANGE_EXPRESSION__BOOLEAN_FUNCTION_CALL:
				return getBooleanFunctionCall();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesMLPackage.CHANGE_EXPRESSION__BOOLEAN_FUNCTION_CALL:
				setBooleanFunctionCall((FunctionCall)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesMLPackage.CHANGE_EXPRESSION__BOOLEAN_FUNCTION_CALL:
				setBooleanFunctionCall((FunctionCall)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesMLPackage.CHANGE_EXPRESSION__BOOLEAN_FUNCTION_CALL:
				return booleanFunctionCall != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangeExpressionImpl
