/**
 */
package behaviourMM.provider;


import behaviourMM.BehaviourMMFactory;
import behaviourMM.BehaviourMMPackage;
import behaviourMM.Operator;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import structureMM.provider.StructureEditPlugin;

/**
 * This is the item provider adapter for a {@link behaviourMM.Operator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BehaviourMMPackage.Literals.OPERATOR__ELEMENT1);
			childrenFeatures.add(BehaviourMMPackage.Literals.OPERATOR__ELEMENT2);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Operator_type");
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

		switch (notification.getFeatureID(Operator.class)) {
			case BehaviourMMPackage.OPERATOR__ELEMENT1:
			case BehaviourMMPackage.OPERATOR__ELEMENT2:
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
				(BehaviourMMPackage.Literals.OPERATOR__ELEMENT1,
				 BehaviourMMFactory.eINSTANCE.createintVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.OPERATOR__ELEMENT1,
				 BehaviourMMFactory.eINSTANCE.createdoubleVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.OPERATOR__ELEMENT1,
				 BehaviourMMFactory.eINSTANCE.createboolVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.OPERATOR__ELEMENT1,
				 BehaviourMMFactory.eINSTANCE.createcharVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.OPERATOR__ELEMENT1,
				 BehaviourMMFactory.eINSTANCE.createstringVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.OPERATOR__ELEMENT2,
				 BehaviourMMFactory.eINSTANCE.createintVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.OPERATOR__ELEMENT2,
				 BehaviourMMFactory.eINSTANCE.createdoubleVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.OPERATOR__ELEMENT2,
				 BehaviourMMFactory.eINSTANCE.createboolVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.OPERATOR__ELEMENT2,
				 BehaviourMMFactory.eINSTANCE.createcharVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.OPERATOR__ELEMENT2,
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
			childFeature == BehaviourMMPackage.Literals.OPERATOR__ELEMENT1 ||
			childFeature == BehaviourMMPackage.Literals.OPERATOR__ELEMENT2;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return StructureEditPlugin.INSTANCE;
	}

}
