/**
 */
package at.ac.tuwien.big.statesml.provider;


import at.ac.tuwien.big.statesml.StateSystem;
import at.ac.tuwien.big.statesml.StatesMLFactory;
import at.ac.tuwien.big.statesml.StatesMLPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link at.ac.tuwien.big.statesml.StateSystem} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateSystemItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSystemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSystemUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the System Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_StateSystem_systemUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_StateSystem_systemUnit_feature", "_UI_StateSystem_type"),
				 StatesMLPackage.Literals.STATE_SYSTEM__SYSTEM_UNIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StatesMLPackage.Literals.STATE_SYSTEM__NODES);
			childrenFeatures.add(StatesMLPackage.Literals.STATE_SYSTEM__EDGES);
			childrenFeatures.add(StatesMLPackage.Literals.STATE_SYSTEM__PROCESSIBLE_EVENTS);
			childrenFeatures.add(StatesMLPackage.Literals.STATE_SYSTEM__ATTRIBUTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns StateSystem.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StateSystem"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StateSystem)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StateSystem_type") :
			getString("_UI_StateSystem_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StateSystem.class)) {
			case StatesMLPackage.STATE_SYSTEM__NODES:
			case StatesMLPackage.STATE_SYSTEM__EDGES:
			case StatesMLPackage.STATE_SYSTEM__PROCESSIBLE_EVENTS:
			case StatesMLPackage.STATE_SYSTEM__ATTRIBUTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(StatesMLPackage.Literals.STATE_SYSTEM__NODES,
				 StatesMLFactory.eINSTANCE.createSelectionDivergence()));

		newChildDescriptors.add
			(createChildParameter
				(StatesMLPackage.Literals.STATE_SYSTEM__NODES,
				 StatesMLFactory.eINSTANCE.createSelectionConvergence()));

		newChildDescriptors.add
			(createChildParameter
				(StatesMLPackage.Literals.STATE_SYSTEM__NODES,
				 StatesMLFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(StatesMLPackage.Literals.STATE_SYSTEM__NODES,
				 StatesMLFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(StatesMLPackage.Literals.STATE_SYSTEM__EDGES,
				 StatesMLFactory.eINSTANCE.createEdge()));

		newChildDescriptors.add
			(createChildParameter
				(StatesMLPackage.Literals.STATE_SYSTEM__PROCESSIBLE_EVENTS,
				 StatesMLFactory.eINSTANCE.createChangeEvent()));

		newChildDescriptors.add
			(createChildParameter
				(StatesMLPackage.Literals.STATE_SYSTEM__ATTRIBUTES,
				 StatesMLFactory.eINSTANCE.createAttribute()));
	}

}
