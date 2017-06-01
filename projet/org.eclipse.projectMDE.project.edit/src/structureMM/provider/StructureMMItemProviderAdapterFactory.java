/**
 */
package structureMM.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import structureMM.util.StructureMMAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureMMItemProviderAdapterFactory extends StructureMMAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMMItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.doubleAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected doubleAttributeItemProvider doubleAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.doubleAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createdoubleAttributeAdapter() {
		if (doubleAttributeItemProvider == null) {
			doubleAttributeItemProvider = new doubleAttributeItemProvider(this);
		}

		return doubleAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.stringAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected stringAttributeItemProvider stringAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.stringAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createstringAttributeAdapter() {
		if (stringAttributeItemProvider == null) {
			stringAttributeItemProvider = new stringAttributeItemProvider(this);
		}

		return stringAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.charAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected charAttributeItemProvider charAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.charAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createcharAttributeAdapter() {
		if (charAttributeItemProvider == null) {
			charAttributeItemProvider = new charAttributeItemProvider(this);
		}

		return charAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.boolAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolAttributeItemProvider boolAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.boolAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createboolAttributeAdapter() {
		if (boolAttributeItemProvider == null) {
			boolAttributeItemProvider = new boolAttributeItemProvider(this);
		}

		return boolAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.intAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected intAttributeItemProvider intAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.intAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createintAttributeAdapter() {
		if (intAttributeItemProvider == null) {
			intAttributeItemProvider = new intAttributeItemProvider(this);
		}

		return intAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.intMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected intMethodItemProvider intMethodItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.intMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createintMethodAdapter() {
		if (intMethodItemProvider == null) {
			intMethodItemProvider = new intMethodItemProvider(this);
		}

		return intMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.boolMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolMethodItemProvider boolMethodItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.boolMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createboolMethodAdapter() {
		if (boolMethodItemProvider == null) {
			boolMethodItemProvider = new boolMethodItemProvider(this);
		}

		return boolMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.charMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected charMethodItemProvider charMethodItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.charMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createcharMethodAdapter() {
		if (charMethodItemProvider == null) {
			charMethodItemProvider = new charMethodItemProvider(this);
		}

		return charMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.stringMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected stringMethodItemProvider stringMethodItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.stringMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createstringMethodAdapter() {
		if (stringMethodItemProvider == null) {
			stringMethodItemProvider = new stringMethodItemProvider(this);
		}

		return stringMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link structureMM.doubleMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected doubleMethodItemProvider doubleMethodItemProvider;

	/**
	 * This creates an adapter for a {@link structureMM.doubleMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createdoubleMethodAdapter() {
		if (doubleMethodItemProvider == null) {
			doubleMethodItemProvider = new doubleMethodItemProvider(this);
		}

		return doubleMethodItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (classItemProvider != null) classItemProvider.dispose();
		if (doubleAttributeItemProvider != null) doubleAttributeItemProvider.dispose();
		if (stringAttributeItemProvider != null) stringAttributeItemProvider.dispose();
		if (charAttributeItemProvider != null) charAttributeItemProvider.dispose();
		if (boolAttributeItemProvider != null) boolAttributeItemProvider.dispose();
		if (intAttributeItemProvider != null) intAttributeItemProvider.dispose();
		if (intMethodItemProvider != null) intMethodItemProvider.dispose();
		if (boolMethodItemProvider != null) boolMethodItemProvider.dispose();
		if (charMethodItemProvider != null) charMethodItemProvider.dispose();
		if (stringMethodItemProvider != null) stringMethodItemProvider.dispose();
		if (doubleMethodItemProvider != null) doubleMethodItemProvider.dispose();
	}

}
