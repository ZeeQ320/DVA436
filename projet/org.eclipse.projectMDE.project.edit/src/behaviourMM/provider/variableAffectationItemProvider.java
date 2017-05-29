/**
 */
package behaviourMM.provider;


import behaviourMM.BehaviourMMFactory;
import behaviourMM.BehaviourMMPackage;
import behaviourMM.variableAffectation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link behaviourMM.variableAffectation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class variableAffectationItemProvider extends AffectationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public variableAffectationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(BehaviourMMPackage.Literals.VARIABLE_AFFECTATION__RECEIVED_VARIABLE);
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
	 * This returns variableAffectation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/variableAffectation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		variableAffectation variableAffectation = (variableAffectation)object;
		return getString("_UI_variableAffectation_type") + " " + variableAffectation.getId();
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

		switch (notification.getFeatureID(variableAffectation.class)) {
			case BehaviourMMPackage.VARIABLE_AFFECTATION__RECEIVED_VARIABLE:
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
				(BehaviourMMPackage.Literals.VARIABLE_AFFECTATION__RECEIVED_VARIABLE,
				 BehaviourMMFactory.eINSTANCE.createintVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.VARIABLE_AFFECTATION__RECEIVED_VARIABLE,
				 BehaviourMMFactory.eINSTANCE.createdoubleVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.VARIABLE_AFFECTATION__RECEIVED_VARIABLE,
				 BehaviourMMFactory.eINSTANCE.createboolVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.VARIABLE_AFFECTATION__RECEIVED_VARIABLE,
				 BehaviourMMFactory.eINSTANCE.createcharVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.VARIABLE_AFFECTATION__RECEIVED_VARIABLE,
				 BehaviourMMFactory.eINSTANCE.createstringVariable()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BehaviourMMPackage.Literals.AFFECTATION__RECEIVING_VARIABLE ||
			childFeature == BehaviourMMPackage.Literals.VARIABLE_AFFECTATION__RECEIVED_VARIABLE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
