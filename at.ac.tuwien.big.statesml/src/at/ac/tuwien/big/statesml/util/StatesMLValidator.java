/**
 */
package at.ac.tuwien.big.statesml.util;

import at.ac.tuwien.big.statesml.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.statesml.StatesMLPackage
 * @generated
 */
public class StatesMLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StatesMLValidator INSTANCE = new StatesMLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "at.ac.tuwien.big.statesml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesMLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StatesMLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StatesMLPackage.SYSTEM_UNIT:
				return validateSystemUnit((SystemUnit)value, diagnostics, context);
			case StatesMLPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case StatesMLPackage.TYPED_ELEMENT:
				return validateTypedElement((TypedElement)value, diagnostics, context);
			case StatesMLPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case StatesMLPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case StatesMLPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case StatesMLPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case StatesMLPackage.STATE_SYSTEM:
				return validateStateSystem((StateSystem)value, diagnostics, context);
			case StatesMLPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case StatesMLPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case StatesMLPackage.SELECTION_DIVERGENCE:
				return validateSelectionDivergence((SelectionDivergence)value, diagnostics, context);
			case StatesMLPackage.SELECTION_CONVERGENCE:
				return validateSelectionConvergence((SelectionConvergence)value, diagnostics, context);
			case StatesMLPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case StatesMLPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case StatesMLPackage.FUNCTION_CALL:
				return validateFunctionCall((FunctionCall)value, diagnostics, context);
			case StatesMLPackage.PARAMETER_VALUE:
				return validateParameterValue((ParameterValue)value, diagnostics, context);
			case StatesMLPackage.VALUE_SPECIFICATION:
				return validateValueSpecification((ValueSpecification)value, diagnostics, context);
			case StatesMLPackage.INTEGER_VALUE_SPECIFICATION:
				return validateIntegerValueSpecification((IntegerValueSpecification)value, diagnostics, context);
			case StatesMLPackage.BOOLEAN_VALUE_SPECIFICATION:
				return validateBooleanValueSpecification((BooleanValueSpecification)value, diagnostics, context);
			case StatesMLPackage.ATTRIBUTE_VALUE_SPECIFICATION:
				return validateAttributeValueSpecification((AttributeValueSpecification)value, diagnostics, context);
			case StatesMLPackage.TRIGGER:
				return validateTrigger((Trigger)value, diagnostics, context);
			case StatesMLPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case StatesMLPackage.CHANGE_EVENT:
				return validateChangeEvent((ChangeEvent)value, diagnostics, context);
			case StatesMLPackage.CHANGE_EXPRESSION:
				return validateChangeExpression((ChangeExpression)value, diagnostics, context);
			case StatesMLPackage.BEHAVIORED_ELEMENT:
				return validateBehavioredElement((BehavioredElement)value, diagnostics, context);
			case StatesMLPackage.STRING_VALUE_SPECIFICATION:
				return validateStringValueSpecification((StringValueSpecification)value, diagnostics, context);
			case StatesMLPackage.SYSTEM_UNIT_LIBRARY:
				return validateSystemUnitLibrary((SystemUnitLibrary)value, diagnostics, context);
			case StatesMLPackage.DATA_TYPE_LIBRARY:
				return validateDataTypeLibrary((DataTypeLibrary)value, diagnostics, context);
			case StatesMLPackage.PARAMETER_DIRECTION_KIND:
				return validateParameterDirectionKind((ParameterDirectionKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnit(SystemUnit systemUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypedElement(TypedElement typedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(function, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunction_AtMostOneReturnParameter(function, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtMostOneReturnParameter constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTION__AT_MOST_ONE_RETURN_PARAMETER__EEXPRESSION = "self.parameters->select(p |\n" +
		"\t\t\t\tp.direction = ParameterDirectionKind::RETURN)->size() <= 1";

	/**
	 * Validates the AtMostOneReturnParameter constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction_AtMostOneReturnParameter(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.FUNCTION,
				 function,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AtMostOneReturnParameter",
				 FUNCTION__AT_MOST_ONE_RETURN_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSystem(StateSystem stateSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateSystem_AttributeSpecificationValidAttribute(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateSystem_OneInitialState(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateSystem_MaxOneTerminalState(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateSystem_NoIncomingEdgeForInitalState(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateSystem_OneOutgoingEdgeForInitalState(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateSystem_OneIncomingEdgeForTerminalState(stateSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateSystem_NoOutgoingEdgeForTerminalState(stateSystem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AttributeSpecificationValidAttribute constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_SYSTEM__ATTRIBUTE_SPECIFICATION_VALID_ATTRIBUTE__EEXPRESSION = "self.attributes->union(self.systemUnit.attributes)->includesAll(self.processibleEvents->selectByKind(ChangeEvent).changeExpression.booleanFunctionCall.parameters.valueSpecification->selectByKind(AttributeValueSpecification).attribute)";

	/**
	 * Validates the AttributeSpecificationValidAttribute constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSystem_AttributeSpecificationValidAttribute(StateSystem stateSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE_SYSTEM,
				 stateSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributeSpecificationValidAttribute",
				 STATE_SYSTEM__ATTRIBUTE_SPECIFICATION_VALID_ATTRIBUTE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneInitialState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_SYSTEM__ONE_INITIAL_STATE__EEXPRESSION = "self.nodes->selectByKind(State)->select(s | s.initial)->size() = 1";

	/**
	 * Validates the OneInitialState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSystem_OneInitialState(StateSystem stateSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE_SYSTEM,
				 stateSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneInitialState",
				 STATE_SYSTEM__ONE_INITIAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the MaxOneTerminalState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_SYSTEM__MAX_ONE_TERMINAL_STATE__EEXPRESSION = "self.nodes->selectByKind(State)->select(s | s.terminal)->size() <= 1";

	/**
	 * Validates the MaxOneTerminalState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSystem_MaxOneTerminalState(StateSystem stateSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE_SYSTEM,
				 stateSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "MaxOneTerminalState",
				 STATE_SYSTEM__MAX_ONE_TERMINAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoIncomingEdgeForInitalState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_SYSTEM__NO_INCOMING_EDGE_FOR_INITAL_STATE__EEXPRESSION = "self.edges.target->selectByKind(State)->select(s | s.initial)->size() = 0";

	/**
	 * Validates the NoIncomingEdgeForInitalState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSystem_NoIncomingEdgeForInitalState(StateSystem stateSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE_SYSTEM,
				 stateSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoIncomingEdgeForInitalState",
				 STATE_SYSTEM__NO_INCOMING_EDGE_FOR_INITAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneOutgoingEdgeForInitalState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_SYSTEM__ONE_OUTGOING_EDGE_FOR_INITAL_STATE__EEXPRESSION = "self.edges.source->selectByKind(State)->select(s | s.initial)->size() = 1";

	/**
	 * Validates the OneOutgoingEdgeForInitalState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSystem_OneOutgoingEdgeForInitalState(StateSystem stateSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE_SYSTEM,
				 stateSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneOutgoingEdgeForInitalState",
				 STATE_SYSTEM__ONE_OUTGOING_EDGE_FOR_INITAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneIncomingEdgeForTerminalState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_SYSTEM__ONE_INCOMING_EDGE_FOR_TERMINAL_STATE__EEXPRESSION = "self.nodes->selectByType(State)->select(s |\n" +
		"\t\t\t\ts.terminal)->size() = 0 or self.edges.target->selectByType(State)->select(s | s.terminal)->size() = 1";

	/**
	 * Validates the OneIncomingEdgeForTerminalState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSystem_OneIncomingEdgeForTerminalState(StateSystem stateSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE_SYSTEM,
				 stateSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneIncomingEdgeForTerminalState",
				 STATE_SYSTEM__ONE_INCOMING_EDGE_FOR_TERMINAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoOutgoingEdgeForTerminalState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_SYSTEM__NO_OUTGOING_EDGE_FOR_TERMINAL_STATE__EEXPRESSION = "self.edges.source->selectByKind(State)->select(s | s.terminal)->size() = 0";

	/**
	 * Validates the NoOutgoingEdgeForTerminalState constraint of '<em>State System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSystem_NoOutgoingEdgeForTerminalState(StateSystem stateSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE_SYSTEM,
				 stateSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoOutgoingEdgeForTerminalState",
				 STATE_SYSTEM__NO_OUTGOING_EDGE_FOR_TERMINAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionDivergence(SelectionDivergence selectionDivergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionDivergence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionDivergence_OneIncomingEdge(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionDivergence_AtLeastTwoOutgoingEdges(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionDivergence_SuccessorTransitionMustDefineTrigger(selectionDivergence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionDivergence_OutgoingEdgeTargetIsValid(selectionDivergence, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneIncomingEdge constraint of '<em>Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_DIVERGENCE__ONE_INCOMING_EDGE__EEXPRESSION = "self.incomingEdges->size() = 1";

	/**
	 * Validates the OneIncomingEdge constraint of '<em>Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionDivergence_OneIncomingEdge(SelectionDivergence selectionDivergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.SELECTION_DIVERGENCE,
				 selectionDivergence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneIncomingEdge",
				 SELECTION_DIVERGENCE__ONE_INCOMING_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AtLeastTwoOutgoingEdges constraint of '<em>Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_DIVERGENCE__AT_LEAST_TWO_OUTGOING_EDGES__EEXPRESSION = "self.outgoingEdges->size() >= 2";

	/**
	 * Validates the AtLeastTwoOutgoingEdges constraint of '<em>Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionDivergence_AtLeastTwoOutgoingEdges(SelectionDivergence selectionDivergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.SELECTION_DIVERGENCE,
				 selectionDivergence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AtLeastTwoOutgoingEdges",
				 SELECTION_DIVERGENCE__AT_LEAST_TWO_OUTGOING_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SuccessorTransitionMustDefineTrigger constraint of '<em>Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_DIVERGENCE__SUCCESSOR_TRANSITION_MUST_DEFINE_TRIGGER__EEXPRESSION = "self.outgoingEdges.target->selectByType(Transition)->select(t |\n" +
		"\t\t\tt.trigger.oclIsUndefined())->size() <= 1";

	/**
	 * Validates the SuccessorTransitionMustDefineTrigger constraint of '<em>Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionDivergence_SuccessorTransitionMustDefineTrigger(SelectionDivergence selectionDivergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.SELECTION_DIVERGENCE,
				 selectionDivergence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SuccessorTransitionMustDefineTrigger",
				 SELECTION_DIVERGENCE__SUCCESSOR_TRANSITION_MUST_DEFINE_TRIGGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OutgoingEdgeTargetIsValid constraint of '<em>Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_DIVERGENCE__OUTGOING_EDGE_TARGET_IS_VALID__EEXPRESSION = "self.outgoingEdges.target->forAll(t | t.oclIsTypeOf(Transition))";

	/**
	 * Validates the OutgoingEdgeTargetIsValid constraint of '<em>Selection Divergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionDivergence_OutgoingEdgeTargetIsValid(SelectionDivergence selectionDivergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.SELECTION_DIVERGENCE,
				 selectionDivergence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OutgoingEdgeTargetIsValid",
				 SELECTION_DIVERGENCE__OUTGOING_EDGE_TARGET_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionConvergence(SelectionConvergence selectionConvergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionConvergence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionConvergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionConvergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionConvergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionConvergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionConvergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionConvergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionConvergence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionConvergence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionConvergence_AtLeastTwoIncomingEdges(selectionConvergence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionConvergence_OneOutgoingEdge(selectionConvergence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionConvergence_OutgoingEdgeTargetIsValid(selectionConvergence, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AtLeastTwoIncomingEdges constraint of '<em>Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_CONVERGENCE__AT_LEAST_TWO_INCOMING_EDGES__EEXPRESSION = "self.incomingEdges->size() >= 2";

	/**
	 * Validates the AtLeastTwoIncomingEdges constraint of '<em>Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionConvergence_AtLeastTwoIncomingEdges(SelectionConvergence selectionConvergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.SELECTION_CONVERGENCE,
				 selectionConvergence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AtLeastTwoIncomingEdges",
				 SELECTION_CONVERGENCE__AT_LEAST_TWO_INCOMING_EDGES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneOutgoingEdge constraint of '<em>Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_CONVERGENCE__ONE_OUTGOING_EDGE__EEXPRESSION = "self.outgoingEdges->size() = 1";

	/**
	 * Validates the OneOutgoingEdge constraint of '<em>Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionConvergence_OneOutgoingEdge(SelectionConvergence selectionConvergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.SELECTION_CONVERGENCE,
				 selectionConvergence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneOutgoingEdge",
				 SELECTION_CONVERGENCE__ONE_OUTGOING_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OutgoingEdgeTargetIsValid constraint of '<em>Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_CONVERGENCE__OUTGOING_EDGE_TARGET_IS_VALID__EEXPRESSION = "self.outgoingEdges.target->forAll(t | t.oclIsTypeOf(State))";

	/**
	 * Validates the OutgoingEdgeTargetIsValid constraint of '<em>Selection Convergence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionConvergence_OutgoingEdgeTargetIsValid(SelectionConvergence selectionConvergence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.SELECTION_CONVERGENCE,
				 selectionConvergence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OutgoingEdgeTargetIsValid",
				 SELECTION_CONVERGENCE__OUTGOING_EDGE_TARGET_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_StateTypeIsValid(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_NoActionsForIntialOrTerminalState(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_RegularStateEdgesAreValid(state, diagnostics, context);
		if (result || diagnostics != null) result &= validateState_OutgoingEdgeTargetIsValid(state, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the StateTypeIsValid constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__STATE_TYPE_IS_VALID__EEXPRESSION = "not (self.terminal and self.initial)";

	/**
	 * Validates the StateTypeIsValid constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_StateTypeIsValid(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "StateTypeIsValid",
				 STATE__STATE_TYPE_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NoActionsForIntialOrTerminalState constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__NO_ACTIONS_FOR_INTIAL_OR_TERMINAL_STATE__EEXPRESSION = "not (self.initial or self.terminal) or self.actionSequence->isEmpty()";

	/**
	 * Validates the NoActionsForIntialOrTerminalState constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_NoActionsForIntialOrTerminalState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NoActionsForIntialOrTerminalState",
				 STATE__NO_ACTIONS_FOR_INTIAL_OR_TERMINAL_STATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RegularStateEdgesAreValid constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__REGULAR_STATE_EDGES_ARE_VALID__EEXPRESSION = "(self.initial or self.terminal) or (self.incomingEdges->size() = 1 and self.outgoingEdges->size() = 1)";

	/**
	 * Validates the RegularStateEdgesAreValid constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_RegularStateEdgesAreValid(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RegularStateEdgesAreValid",
				 STATE__REGULAR_STATE_EDGES_ARE_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OutgoingEdgeTargetIsValid constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE__OUTGOING_EDGE_TARGET_IS_VALID__EEXPRESSION = "self.outgoingEdges.target->forAll(t |\n" +
		"\t\t\tt.oclIsTypeOf(Transition) or t.oclIsTypeOf(SelectionDivergence))";

	/**
	 * Validates the OutgoingEdgeTargetIsValid constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_OutgoingEdgeTargetIsValid(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.STATE,
				 state,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OutgoingEdgeTargetIsValid",
				 STATE__OUTGOING_EDGE_TARGET_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_OneIncomingEdge(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_OneOutgoingEdge(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_OutgoingEdgeTargetIsValid(transition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneIncomingEdge constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__ONE_INCOMING_EDGE__EEXPRESSION = "self.incomingEdges->size() = 1";

	/**
	 * Validates the OneIncomingEdge constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_OneIncomingEdge(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneIncomingEdge",
				 TRANSITION__ONE_INCOMING_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OneOutgoingEdge constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__ONE_OUTGOING_EDGE__EEXPRESSION = "self.outgoingEdges->size() = 1";

	/**
	 * Validates the OneOutgoingEdge constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_OneOutgoingEdge(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneOutgoingEdge",
				 TRANSITION__ONE_OUTGOING_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OutgoingEdgeTargetIsValid constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSITION__OUTGOING_EDGE_TARGET_IS_VALID__EEXPRESSION = "self.outgoingEdges.target->forAll(t |\n" +
		"\t\t\tt.oclIsTypeOf(State) or t.oclIsTypeOf(SelectionConvergence))";

	/**
	 * Validates the OutgoingEdgeTargetIsValid constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition_OutgoingEdgeTargetIsValid(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OutgoingEdgeTargetIsValid",
				 TRANSITION__OUTGOING_EDGE_TARGET_IS_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionCall(FunctionCall functionCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionCall_OneParameterValueForEachDefinedParameter(functionCall, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the OneParameterValueForEachDefinedParameter constraint of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTION_CALL__ONE_PARAMETER_VALUE_FOR_EACH_DEFINED_PARAMETER__EEXPRESSION = "self.parameters.parameter->includesAll(self.function.parameters->select(p |\n" +
		"\t\t\t\tp.direction = ParameterDirectionKind::IN))";

	/**
	 * Validates the OneParameterValueForEachDefinedParameter constraint of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionCall_OneParameterValueForEachDefinedParameter(FunctionCall functionCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.FUNCTION_CALL,
				 functionCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OneParameterValueForEachDefinedParameter",
				 FUNCTION_CALL__ONE_PARAMETER_VALUE_FOR_EACH_DEFINED_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValue(ParameterValue parameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parameterValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameterValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameterValue_FunctionCallParameterValid(parameterValue, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the FunctionCallParameterValid constraint of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PARAMETER_VALUE__FUNCTION_CALL_PARAMETER_VALID__EEXPRESSION = "self.functionCall.function.parameters->includes(self.parameter)";

	/**
	 * Validates the FunctionCallParameterValid constraint of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValue_FunctionCallParameterValid(ParameterValue parameterValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.PARAMETER_VALUE,
				 parameterValue,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FunctionCallParameterValid",
				 PARAMETER_VALUE__FUNCTION_CALL_PARAMETER_VALID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpecification(ValueSpecification valueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerValueSpecification(IntegerValueSpecification integerValueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerValueSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanValueSpecification(BooleanValueSpecification booleanValueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanValueSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueSpecification(AttributeValueSpecification attributeValueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeValueSpecification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeValueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeValueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeValueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeValueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeValueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeValueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeValueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeValueSpecification, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttributeValueSpecification_AttributeSpecificationValidType(attributeValueSpecification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AttributeSpecificationValidType constraint of '<em>Attribute Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE_VALUE_SPECIFICATION__ATTRIBUTE_SPECIFICATION_VALID_TYPE__EEXPRESSION = "self.attribute.type = self.parameterValue.parameter.type";

	/**
	 * Validates the AttributeSpecificationValidType constraint of '<em>Attribute Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueSpecification_AttributeSpecificationValidType(AttributeValueSpecification attributeValueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.ATTRIBUTE_VALUE_SPECIFICATION,
				 attributeValueSpecification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributeSpecificationValidType",
				 ATTRIBUTE_VALUE_SPECIFICATION__ATTRIBUTE_SPECIFICATION_VALID_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeEvent(ChangeEvent changeEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeExpression(ChangeExpression changeExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(changeExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(changeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(changeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(changeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(changeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(changeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(changeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(changeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(changeExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateChangeExpression_HasBooleanReturnParameter(changeExpression, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the HasBooleanReturnParameter constraint of '<em>Change Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CHANGE_EXPRESSION__HAS_BOOLEAN_RETURN_PARAMETER__EEXPRESSION = "self.booleanFunctionCall.function.parameters->exists(p |\n" +
		"\t\t\tp.direction = ParameterDirectionKind::RETURN and p.type.name = 'Boolean')";

	/**
	 * Validates the HasBooleanReturnParameter constraint of '<em>Change Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeExpression_HasBooleanReturnParameter(ChangeExpression changeExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(StatesMLPackage.Literals.CHANGE_EXPRESSION,
				 changeExpression,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "HasBooleanReturnParameter",
				 CHANGE_EXPRESSION__HAS_BOOLEAN_RETURN_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavioredElement(BehavioredElement behavioredElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behavioredElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringValueSpecification(StringValueSpecification stringValueSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringValueSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemUnitLibrary(SystemUnitLibrary systemUnitLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemUnitLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeLibrary(DataTypeLibrary dataTypeLibrary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeLibrary, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterDirectionKind(ParameterDirectionKind parameterDirectionKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StatesMLValidator
