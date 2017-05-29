/**
 */
package behaviourMM.provider;


import behaviourMM.BehaviourMMFactory;
import behaviourMM.BehaviourMMPackage;
import behaviourMM.writeConsole;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link behaviourMM.writeConsole} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class writeConsoleItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public writeConsoleItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(BehaviourMMPackage.Literals.WRITE_CONSOLE__VARIABLE);
			childrenFeatures.add(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION);
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
	 * This returns writeConsole.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/writeConsole"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		writeConsole writeConsole = (writeConsole)object;
		return getString("_UI_writeConsole_type") + " " + writeConsole.getId();
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

		switch (notification.getFeatureID(writeConsole.class)) {
			case BehaviourMMPackage.WRITE_CONSOLE__VARIABLE:
			case BehaviourMMPackage.WRITE_CONSOLE__OPERATION:
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
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__VARIABLE,
				 BehaviourMMFactory.eINSTANCE.createintVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__VARIABLE,
				 BehaviourMMFactory.eINSTANCE.createdoubleVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__VARIABLE,
				 BehaviourMMFactory.eINSTANCE.createboolVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__VARIABLE,
				 BehaviourMMFactory.eINSTANCE.createcharVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__VARIABLE,
				 BehaviourMMFactory.eINSTANCE.createstringVariable()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createadditionOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createsoustractionOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createmultiplicationOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createdivisionOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createequalOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createinferiorOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createsuperiorOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createinferiorOrEqualOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createsuperiorOrEqualOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createandOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createorOperator()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviourMMPackage.Literals.WRITE_CONSOLE__OPERATION,
				 BehaviourMMFactory.eINSTANCE.createnoOperator()));
	}

}
