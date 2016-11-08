/**
 */
package at.ac.tuwien.big.statesml.impl;

import at.ac.tuwien.big.statesml.Attribute;
import at.ac.tuwien.big.statesml.AttributeValueSpecification;
import at.ac.tuwien.big.statesml.BehavioredElement;
import at.ac.tuwien.big.statesml.BooleanValueSpecification;
import at.ac.tuwien.big.statesml.ChangeEvent;
import at.ac.tuwien.big.statesml.ChangeExpression;
import at.ac.tuwien.big.statesml.DataType;
import at.ac.tuwien.big.statesml.DataTypeLibrary;
import at.ac.tuwien.big.statesml.Edge;
import at.ac.tuwien.big.statesml.Event;
import at.ac.tuwien.big.statesml.Function;
import at.ac.tuwien.big.statesml.FunctionCall;
import at.ac.tuwien.big.statesml.IntegerValueSpecification;
import at.ac.tuwien.big.statesml.NamedElement;
import at.ac.tuwien.big.statesml.Node;
import at.ac.tuwien.big.statesml.Parameter;
import at.ac.tuwien.big.statesml.ParameterDirectionKind;
import at.ac.tuwien.big.statesml.ParameterValue;
import at.ac.tuwien.big.statesml.SelectionConvergence;
import at.ac.tuwien.big.statesml.SelectionDivergence;
import at.ac.tuwien.big.statesml.State;
import at.ac.tuwien.big.statesml.StateSystem;
import at.ac.tuwien.big.statesml.StatesMLFactory;
import at.ac.tuwien.big.statesml.StatesMLPackage;
import at.ac.tuwien.big.statesml.StringValueSpecification;
import at.ac.tuwien.big.statesml.SystemUnit;
import at.ac.tuwien.big.statesml.SystemUnitLibrary;
import at.ac.tuwien.big.statesml.Transition;
import at.ac.tuwien.big.statesml.Trigger;
import at.ac.tuwien.big.statesml.TypedElement;
import at.ac.tuwien.big.statesml.ValueSpecification;

import at.ac.tuwien.big.statesml.util.StatesMLValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesMLPackageImpl extends EPackageImpl implements StatesMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionDivergenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionConvergenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioredElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.ac.tuwien.big.statesml.StatesMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesMLPackageImpl() {
		super(eNS_URI, StatesMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StatesMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesMLPackage init() {
		if (isInited) return (StatesMLPackage)EPackage.Registry.INSTANCE.getEPackage(StatesMLPackage.eNS_URI);

		// Obtain or create and register package
		StatesMLPackageImpl theStatesMLPackage = (StatesMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesMLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theStatesMLPackage.createPackageContents();

		// Initialize created meta-data
		theStatesMLPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theStatesMLPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return StatesMLValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theStatesMLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesMLPackage.eNS_URI, theStatesMLPackage);
		return theStatesMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnit() {
		return systemUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnit_Attributes() {
		return (EReference)systemUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameters() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateSystem() {
		return stateSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSystem_Nodes() {
		return (EReference)stateSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSystem_Edges() {
		return (EReference)stateSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSystem_ProcessibleEvents() {
		return (EReference)stateSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSystem_SystemUnit() {
		return (EReference)stateSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSystem_Attributes() {
		return (EReference)stateSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_OutgoingEdges() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_IncomingEdges() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Source() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Target() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionDivergence() {
		return selectionDivergenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionConvergence() {
		return selectionConvergenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ActionSequence() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Initial() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Terminal() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Trigger() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionCall() {
		return functionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCall_Function() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionCall_Parameters() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_ValueSpecification() {
		return (EReference)parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_Parameter() {
		return (EReference)parameterValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterValue_FunctionCall() {
		return (EReference)parameterValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecification_ParameterValue() {
		return (EReference)valueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueSpecification() {
		return integerValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValueSpecification_Value() {
		return (EAttribute)integerValueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValueSpecification() {
		return booleanValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValueSpecification_Value() {
		return (EAttribute)booleanValueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueSpecification() {
		return attributeValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueSpecification_Attribute() {
		return (EReference)attributeValueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Event() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeEvent() {
		return changeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeEvent_ChangeExpression() {
		return (EReference)changeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeExpression() {
		return changeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeExpression_BooleanFunctionCall() {
		return (EReference)changeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioredElement() {
		return behavioredElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredElement_Functions() {
		return (EReference)behavioredElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValueSpecification() {
		return stringValueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValueSpecification_Value() {
		return (EAttribute)stringValueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnitLibrary() {
		return systemUnitLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitLibrary_Units() {
		return (EReference)systemUnitLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeLibrary() {
		return dataTypeLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeLibrary_Types() {
		return (EReference)dataTypeLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirectionKind() {
		return parameterDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesMLFactory getStatesMLFactory() {
		return (StatesMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemUnitEClass = createEClass(SYSTEM_UNIT);
		createEReference(systemUnitEClass, SYSTEM_UNIT__ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		dataTypeEClass = createEClass(DATA_TYPE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__DIRECTION);

		stateSystemEClass = createEClass(STATE_SYSTEM);
		createEReference(stateSystemEClass, STATE_SYSTEM__NODES);
		createEReference(stateSystemEClass, STATE_SYSTEM__EDGES);
		createEReference(stateSystemEClass, STATE_SYSTEM__PROCESSIBLE_EVENTS);
		createEReference(stateSystemEClass, STATE_SYSTEM__SYSTEM_UNIT);
		createEReference(stateSystemEClass, STATE_SYSTEM__ATTRIBUTES);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__OUTGOING_EDGES);
		createEReference(nodeEClass, NODE__INCOMING_EDGES);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__SOURCE);
		createEReference(edgeEClass, EDGE__TARGET);

		selectionDivergenceEClass = createEClass(SELECTION_DIVERGENCE);

		selectionConvergenceEClass = createEClass(SELECTION_CONVERGENCE);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ACTION_SEQUENCE);
		createEAttribute(stateEClass, STATE__INITIAL);
		createEAttribute(stateEClass, STATE__TERMINAL);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TRIGGER);

		functionCallEClass = createEClass(FUNCTION_CALL);
		createEReference(functionCallEClass, FUNCTION_CALL__FUNCTION);
		createEReference(functionCallEClass, FUNCTION_CALL__PARAMETERS);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEReference(parameterValueEClass, PARAMETER_VALUE__VALUE_SPECIFICATION);
		createEReference(parameterValueEClass, PARAMETER_VALUE__PARAMETER);
		createEReference(parameterValueEClass, PARAMETER_VALUE__FUNCTION_CALL);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);
		createEReference(valueSpecificationEClass, VALUE_SPECIFICATION__PARAMETER_VALUE);

		integerValueSpecificationEClass = createEClass(INTEGER_VALUE_SPECIFICATION);
		createEAttribute(integerValueSpecificationEClass, INTEGER_VALUE_SPECIFICATION__VALUE);

		booleanValueSpecificationEClass = createEClass(BOOLEAN_VALUE_SPECIFICATION);
		createEAttribute(booleanValueSpecificationEClass, BOOLEAN_VALUE_SPECIFICATION__VALUE);

		attributeValueSpecificationEClass = createEClass(ATTRIBUTE_VALUE_SPECIFICATION);
		createEReference(attributeValueSpecificationEClass, ATTRIBUTE_VALUE_SPECIFICATION__ATTRIBUTE);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__EVENT);

		eventEClass = createEClass(EVENT);

		changeEventEClass = createEClass(CHANGE_EVENT);
		createEReference(changeEventEClass, CHANGE_EVENT__CHANGE_EXPRESSION);

		changeExpressionEClass = createEClass(CHANGE_EXPRESSION);
		createEReference(changeExpressionEClass, CHANGE_EXPRESSION__BOOLEAN_FUNCTION_CALL);

		behavioredElementEClass = createEClass(BEHAVIORED_ELEMENT);
		createEReference(behavioredElementEClass, BEHAVIORED_ELEMENT__FUNCTIONS);

		stringValueSpecificationEClass = createEClass(STRING_VALUE_SPECIFICATION);
		createEAttribute(stringValueSpecificationEClass, STRING_VALUE_SPECIFICATION__VALUE);

		systemUnitLibraryEClass = createEClass(SYSTEM_UNIT_LIBRARY);
		createEReference(systemUnitLibraryEClass, SYSTEM_UNIT_LIBRARY__UNITS);

		dataTypeLibraryEClass = createEClass(DATA_TYPE_LIBRARY);
		createEReference(dataTypeLibraryEClass, DATA_TYPE_LIBRARY__TYPES);

		// Create enums
		parameterDirectionKindEEnum = createEEnum(PARAMETER_DIRECTION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemUnitEClass.getESuperTypes().add(this.getNamedElement());
		systemUnitEClass.getESuperTypes().add(this.getBehavioredElement());
		attributeEClass.getESuperTypes().add(this.getTypedElement());
		attributeEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getBehavioredElement());
		dataTypeEClass.getESuperTypes().add(this.getNamedElement());
		functionEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getTypedElement());
		stateSystemEClass.getESuperTypes().add(this.getNamedElement());
		nodeEClass.getESuperTypes().add(this.getNamedElement());
		edgeEClass.getESuperTypes().add(this.getNamedElement());
		selectionDivergenceEClass.getESuperTypes().add(this.getNode());
		selectionConvergenceEClass.getESuperTypes().add(this.getNode());
		stateEClass.getESuperTypes().add(this.getNode());
		transitionEClass.getESuperTypes().add(this.getNode());
		integerValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		booleanValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		attributeValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		eventEClass.getESuperTypes().add(this.getNamedElement());
		changeEventEClass.getESuperTypes().add(this.getEvent());
		stringValueSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		systemUnitLibraryEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeLibraryEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemUnitEClass, SystemUnit.class, "SystemUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemUnit_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, SystemUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getDataType(), null, "type", null, 1, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Direction(), this.getParameterDirectionKind(), "direction", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateSystemEClass, StateSystem.class, "StateSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateSystem_Nodes(), this.getNode(), null, "nodes", null, 0, -1, StateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSystem_Edges(), this.getEdge(), null, "edges", null, 0, -1, StateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSystem_ProcessibleEvents(), this.getEvent(), null, "processibleEvents", null, 0, -1, StateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSystem_SystemUnit(), this.getSystemUnit(), null, "systemUnit", null, 1, 1, StateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSystem_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, StateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_OutgoingEdges(), this.getEdge(), null, "outgoingEdges", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNode_IncomingEdges(), this.getEdge(), null, "incomingEdges", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_Source(), this.getNode(), null, "source", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Target(), this.getNode(), null, "target", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionDivergenceEClass, SelectionDivergence.class, "SelectionDivergence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionConvergenceEClass, SelectionConvergence.class, "SelectionConvergence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_ActionSequence(), this.getFunctionCall(), null, "actionSequence", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Initial(), ecorePackage.getEBoolean(), "initial", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Terminal(), ecorePackage.getEBoolean(), "terminal", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Trigger(), this.getTrigger(), null, "trigger", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionCall_Function(), this.getFunction(), null, "function", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionCall_Parameters(), this.getParameterValue(), this.getParameterValue_FunctionCall(), "parameters", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterValue_ValueSpecification(), this.getValueSpecification(), this.getValueSpecification_ParameterValue(), "valueSpecification", null, 1, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValue_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterValue_FunctionCall(), this.getFunctionCall(), this.getFunctionCall_Parameters(), "functionCall", null, 1, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSpecification_ParameterValue(), this.getParameterValue(), this.getParameterValue_ValueSpecification(), "parameterValue", null, 1, 1, ValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueSpecificationEClass, IntegerValueSpecification.class, "IntegerValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValueSpecification_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueSpecificationEClass, BooleanValueSpecification.class, "BooleanValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValueSpecification_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueSpecificationEClass, AttributeValueSpecification.class, "AttributeValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueSpecification_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, AttributeValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Event(), this.getEvent(), null, "event", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeEventEClass, ChangeEvent.class, "ChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeEvent_ChangeExpression(), this.getChangeExpression(), null, "changeExpression", null, 1, 1, ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeExpressionEClass, ChangeExpression.class, "ChangeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeExpression_BooleanFunctionCall(), this.getFunctionCall(), null, "booleanFunctionCall", null, 1, 1, ChangeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behavioredElementEClass, BehavioredElement.class, "BehavioredElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioredElement_Functions(), this.getFunction(), null, "functions", null, 0, -1, BehavioredElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueSpecificationEClass, StringValueSpecification.class, "StringValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValueSpecification_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemUnitLibraryEClass, SystemUnitLibrary.class, "SystemUnitLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemUnitLibrary_Units(), this.getSystemUnit(), null, "units", null, 0, -1, SystemUnitLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeLibraryEClass, DataTypeLibrary.class, "DataTypeLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeLibrary_Types(), this.getDataType(), null, "types", null, 0, -1, DataTypeLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parameterDirectionKindEEnum, ParameterDirectionKind.class, "ParameterDirectionKind");
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.IN);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.RETURN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (functionEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtMostOneReturnParameter"
		   });	
		addAnnotation
		  (stateSystemEClass, 
		   source, 
		   new String[] {
			 "constraints", "AttributeSpecificationValidAttribute OneInitialState MaxOneTerminalState NoIncomingEdgeForInitalState OneOutgoingEdgeForInitalState OneIncomingEdgeForTerminalState NoOutgoingEdgeForTerminalState"
		   });	
		addAnnotation
		  (selectionDivergenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneIncomingEdge AtLeastTwoOutgoingEdges SuccessorTransitionMustDefineTrigger OutgoingEdgeTargetIsValid"
		   });	
		addAnnotation
		  (selectionConvergenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastTwoIncomingEdges OneOutgoingEdge OutgoingEdgeTargetIsValid"
		   });	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "constraints", "StateTypeIsValid NoActionsForIntialOrTerminalState RegularStateEdgesAreValid OutgoingEdgeTargetIsValid"
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneIncomingEdge OneOutgoingEdge OutgoingEdgeTargetIsValid"
		   });	
		addAnnotation
		  (functionCallEClass, 
		   source, 
		   new String[] {
			 "constraints", "OneParameterValueForEachDefinedParameter"
		   });	
		addAnnotation
		  (parameterValueEClass, 
		   source, 
		   new String[] {
			 "constraints", "FunctionCallParameterValid"
		   });	
		addAnnotation
		  (attributeValueSpecificationEClass, 
		   source, 
		   new String[] {
			 "constraints", "AttributeSpecificationValidType"
		   });	
		addAnnotation
		  (changeExpressionEClass, 
		   source, 
		   new String[] {
			 "constraints", "HasBooleanReturnParameter"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (functionEClass, 
		   source, 
		   new String[] {
			 "AtMostOneReturnParameter", "self.parameters->select(p |\n\t\t\t\tp.direction = ParameterDirectionKind::RETURN)->size() <= 1"
		   });	
		addAnnotation
		  (stateSystemEClass, 
		   source, 
		   new String[] {
			 "AttributeSpecificationValidAttribute", "self.attributes->union(self.systemUnit.attributes)->includesAll(self.processibleEvents->selectByKind(ChangeEvent).changeExpression.booleanFunctionCall.parameters.valueSpecification->selectByKind(AttributeValueSpecification).attribute)",
			 "OneInitialState", "self.nodes->selectByKind(State)->select(s | s.initial)->size() = 1",
			 "MaxOneTerminalState", "self.nodes->selectByKind(State)->select(s | s.terminal)->size() <= 1",
			 "NoIncomingEdgeForInitalState", "self.edges.target->selectByKind(State)->select(s | s.initial)->size() = 0",
			 "OneOutgoingEdgeForInitalState", "self.edges.source->selectByKind(State)->select(s | s.initial)->size() = 1",
			 "OneIncomingEdgeForTerminalState", "self.nodes->selectByType(State)->select(s |\n\t\t\t\ts.terminal)->size() = 0 or self.edges.target->selectByType(State)->select(s | s.terminal)->size() = 1",
			 "NoOutgoingEdgeForTerminalState", "self.edges.source->selectByKind(State)->select(s | s.terminal)->size() = 0"
		   });	
		addAnnotation
		  (getNode_OutgoingEdges(), 
		   source, 
		   new String[] {
			 "derivation", "self.oclContainer.oclAsType(StateSystem).edges->select(e | e.source = self)"
		   });	
		addAnnotation
		  (getNode_IncomingEdges(), 
		   source, 
		   new String[] {
			 "derivation", "self.oclContainer.oclAsType(StateSystem).edges->select(e | e.target = self)"
		   });	
		addAnnotation
		  (selectionDivergenceEClass, 
		   source, 
		   new String[] {
			 "OneIncomingEdge", "self.incomingEdges->size() = 1",
			 "AtLeastTwoOutgoingEdges", "self.outgoingEdges->size() >= 2",
			 "SuccessorTransitionMustDefineTrigger", "self.outgoingEdges.target->selectByType(Transition)->select(t |\n\t\t\tt.trigger.oclIsUndefined())->size() <= 1",
			 "OutgoingEdgeTargetIsValid", "self.outgoingEdges.target->forAll(t | t.oclIsTypeOf(Transition))"
		   });	
		addAnnotation
		  (selectionConvergenceEClass, 
		   source, 
		   new String[] {
			 "AtLeastTwoIncomingEdges", "self.incomingEdges->size() >= 2",
			 "OneOutgoingEdge", "self.outgoingEdges->size() = 1",
			 "OutgoingEdgeTargetIsValid", "self.outgoingEdges.target->forAll(t | t.oclIsTypeOf(State))"
		   });	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "StateTypeIsValid", "not (self.terminal and self.initial)",
			 "NoActionsForIntialOrTerminalState", "not (self.initial or self.terminal) or self.actionSequence->isEmpty()",
			 "RegularStateEdgesAreValid", "(self.initial or self.terminal) or (self.incomingEdges->size() = 1 and self.outgoingEdges->size() = 1)",
			 "OutgoingEdgeTargetIsValid", "self.outgoingEdges.target->forAll(t |\n\t\t\tt.oclIsTypeOf(Transition) or t.oclIsTypeOf(SelectionDivergence))"
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
			 "OneIncomingEdge", "self.incomingEdges->size() = 1",
			 "OneOutgoingEdge", "self.outgoingEdges->size() = 1",
			 "OutgoingEdgeTargetIsValid", "self.outgoingEdges.target->forAll(t |\n\t\t\tt.oclIsTypeOf(State) or t.oclIsTypeOf(SelectionConvergence))"
		   });	
		addAnnotation
		  (functionCallEClass, 
		   source, 
		   new String[] {
			 "OneParameterValueForEachDefinedParameter", "self.parameters.parameter->includesAll(self.function.parameters->select(p |\n\t\t\t\tp.direction = ParameterDirectionKind::IN))"
		   });	
		addAnnotation
		  (parameterValueEClass, 
		   source, 
		   new String[] {
			 "FunctionCallParameterValid", "self.functionCall.function.parameters->includes(self.parameter)"
		   });	
		addAnnotation
		  (attributeValueSpecificationEClass, 
		   source, 
		   new String[] {
			 "AttributeSpecificationValidType", "self.attribute.type = self.parameterValue.parameter.type"
		   });	
		addAnnotation
		  (changeExpressionEClass, 
		   source, 
		   new String[] {
			 "HasBooleanReturnParameter", "self.booleanFunctionCall.function.parameters->exists(p |\n\t\t\tp.direction = ParameterDirectionKind::RETURN and p.type.name = \'Boolean\')"
		   });
	}

} //StatesMLPackageImpl
