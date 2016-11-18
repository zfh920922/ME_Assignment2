/*
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.statesml.scoping;

import java.util.stream.Stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import at.ac.tuwien.big.statesml.Attribute;
import at.ac.tuwien.big.statesml.AttributeValueSpecification;
import at.ac.tuwien.big.statesml.ChangeEvent;
import at.ac.tuwien.big.statesml.ChangeExpression;
import at.ac.tuwien.big.statesml.DataType;
import at.ac.tuwien.big.statesml.Edge;
import at.ac.tuwien.big.statesml.Event;
import at.ac.tuwien.big.statesml.FunctionCall;
import at.ac.tuwien.big.statesml.Node;
import at.ac.tuwien.big.statesml.Parameter;
import at.ac.tuwien.big.statesml.ParameterDirectionKind;
import at.ac.tuwien.big.statesml.ParameterValue;
import at.ac.tuwien.big.statesml.StateSystem;
import at.ac.tuwien.big.statesml.StatesMLPackage;
import at.ac.tuwien.big.statesml.Transition;
/**
 * This class contains custom scoping description.
 * 
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class StateSystemScopeProvider extends AbstractDeclarativeScopeProvider {

	// TODO: Implement your scoping rules in this class

	@Override
	public IScope getScope(EObject context, EReference reference) {
		return super.getScope(context, reference);
	}

	/**
	 * GIVEN: Scoping rule for Trigger.event
	 * 
	 * A trigger can only be related to events defined by the state system that
	 * contains the trigger.
	 * 
	 * @param element
	 *            The transition, for which the trigger is defined
	 * @param eReference
	 *            The reference Trigger.event
	 * @return The scope containing only the events defined by the state system
	 */
	public IScope scope_Event(Transition element, EReference eReference) {
		if (!eReference.equals(StatesMLPackage.Literals.TRIGGER__EVENT)) {
			return IScope.NULLSCOPE;
		}
		return Scopes.scopeFor(getStateSystem(element).getProcessibleEvents());
	}

	/**
	 * GIVEN: Scoping rule for Edge.source
	 * 
	 * The source of an edge has to be contained by the same state system that
	 * contains the edge.
	 * 
	 * @param element
	 *            The state system containing the edge
	 * @param eReference
	 *            The reference Edge.source
	 * @return The scope containing only nodes that are defined by the state
	 *         system
	 */
	public IScope scope_Node(StateSystem element, EReference eReference) {
		// This rule is needed for edges without name
		if (!eReference.equals(StatesMLPackage.Literals.EDGE__SOURCE)) {
			return IScope.NULLSCOPE;
		}
		return Scopes.scopeFor(element.getNodes());
	}

	/**
	 * GIVEN: Scoping rule for Edge.source
	 * 
	 * The source of an edge has to be contained by the same state system that
	 * contains the edge.
	 * 
	 * @param element
	 *            The edge
	 * @param eReference
	 *            The reference Edge.source
	 * @return The scope containing only nodes that are defined by the state
	 *         system
	 */
	public IScope scope_Edge_source(Edge element, EReference eReference) {
		// This rule is needed for edgeds with name
		if (!eReference.equals(StatesMLPackage.Literals.EDGE__SOURCE)) {
			return IScope.NULLSCOPE;
		}
		return Scopes.scopeFor(getStateSystem(element).getNodes());
	}

	/**
	 * GIVEN: Scoping for Edge.target
	 * 
	 * The target of an edge has to be contained by the same state system that
	 * contains the edge. Furthermore, the target of the edge has to be
	 * different from the source of the edge.
	 * 
	 * @param element
	 *            The state system containing the edge
	 * @param eReference
	 *            The reference Edge.target
	 * @return The scope containing only nodes that are defined by the state
	 *         system
	 */
	public IScope scope_Edge_target(Edge element, EReference eReference) {
		if (!eReference.equals(StatesMLPackage.Literals.EDGE__TARGET)) {
			return IScope.NULLSCOPE;
		}
		Stream<Node> nodesInScope = getStateSystem(element).getNodes().stream().filter(n -> n != element.getSource());
		return Scopes.scopeFor((Iterable<Node>) nodesInScope::iterator);
	}

	/**
	 * GIVEN: Convenience function to retrieve the state system containing a
	 * node.
	 * 
	 * @param node
	 *            The node for which the state system is retrieved
	 * @return The state system that contains the given node
	 */
	public StateSystem getStateSystem(Node node) {
		return (StateSystem) node.eContainer();
	}

	/**
	 * GIVEN: Convenience function to retrieve the state system containing an
	 * endge.
	 * 
	 * @param edge
	 *            The edge for which the state system is retrieved
	 * @return The state system that contains the given edge
	 */
	public StateSystem getStateSystem(Edge edge) {
		return (StateSystem) edge.eContainer();
	}
	public IScope scope_parameterValue_parameter(ParameterValue parameterValue, EReference eReference) {
		
		if (!eReference.equals(StatesMLPackage.Literals.PARAMETER_VALUE__PARAMETER)) {
			return IScope.NULLSCOPE;
		}
		return Scopes.scopeFor(getParameter(parameterValue.getFunctionCall()));		
	}
	public Collection<Parameter> getParameter(FunctionCall functioncall) {
		Collection<Parameter> parameters=functioncall.getFunction().getParameters();
		for(Parameter p:parameters){
			if(p.getDirection()!=ParameterDirectionKind.IN)
				parameters.remove(p);
		}
		return parameters;
	}
   public IScope scope_attribute_value_specification_attribute(AttributeValueSpecification attributevaluespecification , EReference eReference) {
		
		if (!eReference.equals(StatesMLPackage.Literals.ATTRIBUTE_VALUE_SPECIFICATION__ATTRIBUTE)) {
			return IScope.NULLSCOPE;
		}
		return Scopes.scopeFor(getAttribute(attributevaluespecification));		
	}
	public Collection<Attribute> getAttribute(AttributeValueSpecification attributevaluespecification) {
		
		FunctionCall functioncall=(FunctionCall)attributevaluespecification.getParameterValue().eContainer();
		StateSystem statesystem=(StateSystem) functioncall.eContainer();
		Collection<Attribute> attributes=new HashSet<Attribute>();
		statesystem.getAttributes();
		attributes.addAll(statesystem.getAttributes());
		attributes.addAll(statesystem.getSystemUnit().getAttributes());
		DataType type=attributevaluespecification.getParameterValue().getParameter().getType();
		for(Attribute a:attributes){
			if(a.getType()!=type) attributes.remove(a);
		}
				
				return attributes;
	}
}
