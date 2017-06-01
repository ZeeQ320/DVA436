/**
 */
package behaviourMM.provider;


import behaviourMM.BehaviourMMFactory;
import behaviourMM.BehaviourMMPackage;
import behaviourMM.ifConditionnal;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link behaviourMM.ifConditionnal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ifConditionnalItemProvider extends ConditionnalItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ifConditionnalItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION);
			childrenFeatures.add(BehaviourMMPackage.Literals.IF_CONDITIONNAL__ELSE);
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
	 * This returns ifConditionnal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ifConditionnal"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ifConditionnal ifConditionnal = (ifConditionnal)object;
		return getString("_UI_ifConditionnal_type") + " " + ifConditionnal.getId();
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

		switch (notification.getFeatureID(ifConditionnal.class)) {
			case BehaviourMMPackage.IF_CONDITIONNAL__CONDITION:
			case BehaviourMMPackage.IF_CONDITIONNAL__ELSE:
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
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createadditionOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createsoustractionOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createmultiplicationOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createdivisionOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createequalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createinferiorOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createsuperiorOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createinferiorOrEqualOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createsuperiorOrEqualOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createandOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createorOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__CONDITION,
				 BehaviourMMFactory.eINSTANCE.createnoOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.IF_CONDITIONNAL__ELSE,
				 BehaviourMMFactory.eINSTANCE.createelseConditionnal()));
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
			childFeature == BehaviourMMPackage.Literals.CONDITIONNAL__STATEMENT ||
			childFeature == BehaviourMMPackage.Literals.IF_CONDITIONNAL__ELSE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
