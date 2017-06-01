/**
 */
package behaviourMM.provider;


import behaviourMM.BehaviourMMFactory;
import behaviourMM.BehaviourMMPackage;
import behaviourMM.forLoop;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link behaviourMM.forLoop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class forLoopItemProvider extends LoopItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forLoopItemProvider(AdapterFactory adapterFactory) {
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

			addIterationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Iteration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIterationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_forLoop_iteration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_forLoop_iteration_feature", "_UI_forLoop_type"),
				 BehaviourMMPackage.Literals.FOR_LOOP__ITERATION,
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
			childrenFeatures.add(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP);
			childrenFeatures.add(BehaviourMMPackage.Literals.FOR_LOOP__START_VALUE);
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
	 * This returns forLoop.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/forLoop"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		forLoop forLoop = (forLoop)object;
		return getString("_UI_forLoop_type") + " " + forLoop.getId();
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

		switch (notification.getFeatureID(forLoop.class)) {
			case BehaviourMMPackage.FOR_LOOP__CONDITION_STOP:
			case BehaviourMMPackage.FOR_LOOP__START_VALUE:
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
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createadditionOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createsoustractionOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createmultiplicationOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createdivisionOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createequalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createinferiorOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createsuperiorOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createinferiorOrEqualOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createsuperiorOrEqualOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createandOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createorOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__CONDITION_STOP,
				 BehaviourMMFactory.eINSTANCE.createnoOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__START_VALUE,
				 BehaviourMMFactory.eINSTANCE.createoperationAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__START_VALUE,
				 BehaviourMMFactory.eINSTANCE.createvariableAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__START_VALUE,
				 BehaviourMMFactory.eINSTANCE.createintAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__START_VALUE,
				 BehaviourMMFactory.eINSTANCE.createdoubleAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__START_VALUE,
				 BehaviourMMFactory.eINSTANCE.createboolAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__START_VALUE,
				 BehaviourMMFactory.eINSTANCE.createcharAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.FOR_LOOP__START_VALUE,
				 BehaviourMMFactory.eINSTANCE.createstringAffectation()));
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
			childFeature == BehaviourMMPackage.Literals.LOOP__STATEMENT ||
			childFeature == BehaviourMMPackage.Literals.FOR_LOOP__START_VALUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
