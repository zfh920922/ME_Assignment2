/**
 */
package at.ac.tuwien.big.statesml.impl;

import at.ac.tuwien.big.statesml.FunctionCall;
import at.ac.tuwien.big.statesml.Parameter;
import at.ac.tuwien.big.statesml.ParameterValue;
import at.ac.tuwien.big.statesml.StatesMLPackage;
import at.ac.tuwien.big.statesml.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.impl.ParameterValueImpl#getValueSpecification <em>Value Specification</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.impl.ParameterValueImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.impl.ParameterValueImpl#getFunctionCall <em>Function Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterValueImpl extends MinimalEObjectImpl.Container implements ParameterValue {
	/**
	 * The cached value of the '{@link #getValueSpecification() <em>Value Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSpecification()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification valueSpecification;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesMLPackage.Literals.PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getValueSpecification() {
		return valueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSpecification(ValueSpecification newValueSpecification, NotificationChain msgs) {
		ValueSpecification oldValueSpecification = valueSpecification;
		valueSpecification = newValueSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatesMLPackage.PARAMETER_VALUE__VALUE_SPECIFICATION, oldValueSpecification, newValueSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSpecification(ValueSpecification newValueSpecification) {
		if (newValueSpecification != valueSpecification) {
			NotificationChain msgs = null;
			if (valueSpecification != null)
				msgs = ((InternalEObject)valueSpecification).eInverseRemove(this, StatesMLPackage.VALUE_SPECIFICATION__PARAMETER_VALUE, ValueSpecification.class, msgs);
			if (newValueSpecification != null)
				msgs = ((InternalEObject)newValueSpecification).eInverseAdd(this, StatesMLPackage.VALUE_SPECIFICATION__PARAMETER_VALUE, ValueSpecification.class, msgs);
			msgs = basicSetValueSpecification(newValueSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesMLPackage.PARAMETER_VALUE__VALUE_SPECIFICATION, newValueSpecification, newValueSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject)parameter;
			parameter = (Parameter)eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesMLPackage.PARAMETER_VALUE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesMLPackage.PARAMETER_VALUE__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall getFunctionCall() {
		if (eContainerFeatureID() != StatesMLPackage.PARAMETER_VALUE__FUNCTION_CALL) return null;
		return (FunctionCall)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesMLPackage.PARAMETER_VALUE__VALUE_SPECIFICATION:
				if (valueSpecification != null)
					msgs = ((InternalEObject)valueSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatesMLPackage.PARAMETER_VALUE__VALUE_SPECIFICATION, null, msgs);
				return basicSetValueSpecification((ValueSpecification)otherEnd, msgs);
			case StatesMLPackage.PARAMETER_VALUE__FUNCTION_CALL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, StatesMLPackage.PARAMETER_VALUE__FUNCTION_CALL, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesMLPackage.PARAMETER_VALUE__VALUE_SPECIFICATION:
				return basicSetValueSpecification(null, msgs);
			case StatesMLPackage.PARAMETER_VALUE__FUNCTION_CALL:
				return eBasicSetContainer(null, StatesMLPackage.PARAMETER_VALUE__FUNCTION_CALL, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesMLPackage.PARAMETER_VALUE__FUNCTION_CALL:
				return eInternalContainer().eInverseRemove(this, StatesMLPackage.FUNCTION_CALL__PARAMETERS, FunctionCall.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesMLPackage.PARAMETER_VALUE__VALUE_SPECIFICATION:
				return getValueSpecification();
			case StatesMLPackage.PARAMETER_VALUE__PARAMETER:
				if (resolve) return getParameter();
				return basicGetParameter();
			case StatesMLPackage.PARAMETER_VALUE__FUNCTION_CALL:
				return getFunctionCall();
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
			case StatesMLPackage.PARAMETER_VALUE__VALUE_SPECIFICATION:
				setValueSpecification((ValueSpecification)newValue);
				return;
			case StatesMLPackage.PARAMETER_VALUE__PARAMETER:
				setParameter((Parameter)newValue);
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
			case StatesMLPackage.PARAMETER_VALUE__VALUE_SPECIFICATION:
				setValueSpecification((ValueSpecification)null);
				return;
			case StatesMLPackage.PARAMETER_VALUE__PARAMETER:
				setParameter((Parameter)null);
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
			case StatesMLPackage.PARAMETER_VALUE__VALUE_SPECIFICATION:
				return valueSpecification != null;
			case StatesMLPackage.PARAMETER_VALUE__PARAMETER:
				return parameter != null;
			case StatesMLPackage.PARAMETER_VALUE__FUNCTION_CALL:
				return getFunctionCall() != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterValueImpl
