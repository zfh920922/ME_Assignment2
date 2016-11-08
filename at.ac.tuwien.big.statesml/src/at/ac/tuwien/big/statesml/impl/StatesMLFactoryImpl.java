/**
 */
package at.ac.tuwien.big.statesml.impl;

import at.ac.tuwien.big.statesml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesMLFactoryImpl extends EFactoryImpl implements StatesMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesMLFactory init() {
		try {
			StatesMLFactory theStatesMLFactory = (StatesMLFactory)EPackage.Registry.INSTANCE.getEFactory(StatesMLPackage.eNS_URI);
			if (theStatesMLFactory != null) {
				return theStatesMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatesMLPackage.SYSTEM_UNIT: return createSystemUnit();
			case StatesMLPackage.ATTRIBUTE: return createAttribute();
			case StatesMLPackage.DATA_TYPE: return createDataType();
			case StatesMLPackage.FUNCTION: return createFunction();
			case StatesMLPackage.PARAMETER: return createParameter();
			case StatesMLPackage.STATE_SYSTEM: return createStateSystem();
			case StatesMLPackage.EDGE: return createEdge();
			case StatesMLPackage.SELECTION_DIVERGENCE: return createSelectionDivergence();
			case StatesMLPackage.SELECTION_CONVERGENCE: return createSelectionConvergence();
			case StatesMLPackage.STATE: return createState();
			case StatesMLPackage.TRANSITION: return createTransition();
			case StatesMLPackage.FUNCTION_CALL: return createFunctionCall();
			case StatesMLPackage.PARAMETER_VALUE: return createParameterValue();
			case StatesMLPackage.INTEGER_VALUE_SPECIFICATION: return createIntegerValueSpecification();
			case StatesMLPackage.BOOLEAN_VALUE_SPECIFICATION: return createBooleanValueSpecification();
			case StatesMLPackage.ATTRIBUTE_VALUE_SPECIFICATION: return createAttributeValueSpecification();
			case StatesMLPackage.TRIGGER: return createTrigger();
			case StatesMLPackage.CHANGE_EVENT: return createChangeEvent();
			case StatesMLPackage.CHANGE_EXPRESSION: return createChangeExpression();
			case StatesMLPackage.STRING_VALUE_SPECIFICATION: return createStringValueSpecification();
			case StatesMLPackage.SYSTEM_UNIT_LIBRARY: return createSystemUnitLibrary();
			case StatesMLPackage.DATA_TYPE_LIBRARY: return createDataTypeLibrary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StatesMLPackage.PARAMETER_DIRECTION_KIND:
				return createParameterDirectionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StatesMLPackage.PARAMETER_DIRECTION_KIND:
				return convertParameterDirectionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnit createSystemUnit() {
		SystemUnitImpl systemUnit = new SystemUnitImpl();
		return systemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSystem createStateSystem() {
		StateSystemImpl stateSystem = new StateSystemImpl();
		return stateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionDivergence createSelectionDivergence() {
		SelectionDivergenceImpl selectionDivergence = new SelectionDivergenceImpl();
		return selectionDivergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionConvergence createSelectionConvergence() {
		SelectionConvergenceImpl selectionConvergence = new SelectionConvergenceImpl();
		return selectionConvergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue() {
		ParameterValueImpl parameterValue = new ParameterValueImpl();
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueSpecification createIntegerValueSpecification() {
		IntegerValueSpecificationImpl integerValueSpecification = new IntegerValueSpecificationImpl();
		return integerValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValueSpecification createBooleanValueSpecification() {
		BooleanValueSpecificationImpl booleanValueSpecification = new BooleanValueSpecificationImpl();
		return booleanValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueSpecification createAttributeValueSpecification() {
		AttributeValueSpecificationImpl attributeValueSpecification = new AttributeValueSpecificationImpl();
		return attributeValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent createChangeEvent() {
		ChangeEventImpl changeEvent = new ChangeEventImpl();
		return changeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeExpression createChangeExpression() {
		ChangeExpressionImpl changeExpression = new ChangeExpressionImpl();
		return changeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValueSpecification createStringValueSpecification() {
		StringValueSpecificationImpl stringValueSpecification = new StringValueSpecificationImpl();
		return stringValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitLibrary createSystemUnitLibrary() {
		SystemUnitLibraryImpl systemUnitLibrary = new SystemUnitLibraryImpl();
		return systemUnitLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeLibrary createDataTypeLibrary() {
		DataTypeLibraryImpl dataTypeLibrary = new DataTypeLibraryImpl();
		return dataTypeLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindFromString(EDataType eDataType, String initialValue) {
		ParameterDirectionKind result = ParameterDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesMLPackage getStatesMLPackage() {
		return (StatesMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesMLPackage getPackage() {
		return StatesMLPackage.eINSTANCE;
	}

} //StatesMLFactoryImpl
