/**
 */
package at.ac.tuwien.big.statesml.impl;

import at.ac.tuwien.big.statesml.Attribute;
import at.ac.tuwien.big.statesml.Edge;
import at.ac.tuwien.big.statesml.Event;
import at.ac.tuwien.big.statesml.Node;
import at.ac.tuwien.big.statesml.StateSystem;
import at.ac.tuwien.big.statesml.StatesMLPackage;
import at.ac.tuwien.big.statesml.SystemUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.ac.tuwien.big.statesml.impl.StateSystemImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.impl.StateSystemImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.impl.StateSystemImpl#getProcessibleEvents <em>Processible Events</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.impl.StateSystemImpl#getSystemUnit <em>System Unit</em>}</li>
 *   <li>{@link at.ac.tuwien.big.statesml.impl.StateSystemImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateSystemImpl extends NamedElementImpl implements StateSystem {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * The cached value of the '{@link #getProcessibleEvents() <em>Processible Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessibleEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> processibleEvents;

	/**
	 * The cached value of the '{@link #getSystemUnit() <em>System Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnit()
	 * @generated
	 * @ordered
	 */
	protected SystemUnit systemUnit;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesMLPackage.Literals.STATE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, StatesMLPackage.STATE_SYSTEM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, StatesMLPackage.STATE_SYSTEM__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getProcessibleEvents() {
		if (processibleEvents == null) {
			processibleEvents = new EObjectContainmentEList<Event>(Event.class, this, StatesMLPackage.STATE_SYSTEM__PROCESSIBLE_EVENTS);
		}
		return processibleEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnit getSystemUnit() {
		if (systemUnit != null && systemUnit.eIsProxy()) {
			InternalEObject oldSystemUnit = (InternalEObject)systemUnit;
			systemUnit = (SystemUnit)eResolveProxy(oldSystemUnit);
			if (systemUnit != oldSystemUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatesMLPackage.STATE_SYSTEM__SYSTEM_UNIT, oldSystemUnit, systemUnit));
			}
		}
		return systemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnit basicGetSystemUnit() {
		return systemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemUnit(SystemUnit newSystemUnit) {
		SystemUnit oldSystemUnit = systemUnit;
		systemUnit = newSystemUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesMLPackage.STATE_SYSTEM__SYSTEM_UNIT, oldSystemUnit, systemUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, StatesMLPackage.STATE_SYSTEM__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesMLPackage.STATE_SYSTEM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case StatesMLPackage.STATE_SYSTEM__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case StatesMLPackage.STATE_SYSTEM__PROCESSIBLE_EVENTS:
				return ((InternalEList<?>)getProcessibleEvents()).basicRemove(otherEnd, msgs);
			case StatesMLPackage.STATE_SYSTEM__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case StatesMLPackage.STATE_SYSTEM__NODES:
				return getNodes();
			case StatesMLPackage.STATE_SYSTEM__EDGES:
				return getEdges();
			case StatesMLPackage.STATE_SYSTEM__PROCESSIBLE_EVENTS:
				return getProcessibleEvents();
			case StatesMLPackage.STATE_SYSTEM__SYSTEM_UNIT:
				if (resolve) return getSystemUnit();
				return basicGetSystemUnit();
			case StatesMLPackage.STATE_SYSTEM__ATTRIBUTES:
				return getAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesMLPackage.STATE_SYSTEM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case StatesMLPackage.STATE_SYSTEM__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends Edge>)newValue);
				return;
			case StatesMLPackage.STATE_SYSTEM__PROCESSIBLE_EVENTS:
				getProcessibleEvents().clear();
				getProcessibleEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case StatesMLPackage.STATE_SYSTEM__SYSTEM_UNIT:
				setSystemUnit((SystemUnit)newValue);
				return;
			case StatesMLPackage.STATE_SYSTEM__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
			case StatesMLPackage.STATE_SYSTEM__NODES:
				getNodes().clear();
				return;
			case StatesMLPackage.STATE_SYSTEM__EDGES:
				getEdges().clear();
				return;
			case StatesMLPackage.STATE_SYSTEM__PROCESSIBLE_EVENTS:
				getProcessibleEvents().clear();
				return;
			case StatesMLPackage.STATE_SYSTEM__SYSTEM_UNIT:
				setSystemUnit((SystemUnit)null);
				return;
			case StatesMLPackage.STATE_SYSTEM__ATTRIBUTES:
				getAttributes().clear();
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
			case StatesMLPackage.STATE_SYSTEM__NODES:
				return nodes != null && !nodes.isEmpty();
			case StatesMLPackage.STATE_SYSTEM__EDGES:
				return edges != null && !edges.isEmpty();
			case StatesMLPackage.STATE_SYSTEM__PROCESSIBLE_EVENTS:
				return processibleEvents != null && !processibleEvents.isEmpty();
			case StatesMLPackage.STATE_SYSTEM__SYSTEM_UNIT:
				return systemUnit != null;
			case StatesMLPackage.STATE_SYSTEM__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateSystemImpl
