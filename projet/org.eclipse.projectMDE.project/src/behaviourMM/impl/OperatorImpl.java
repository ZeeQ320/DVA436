/**
 */
package behaviourMM.impl;

import behaviourMM.BehaviourMMPackage;
import behaviourMM.Operator;
import behaviourMM.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.impl.OperatorImpl#getElement1 <em>Element1</em>}</li>
 *   <li>{@link behaviourMM.impl.OperatorImpl#getElement2 <em>Element2</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperatorImpl extends MinimalEObjectImpl.Container implements Operator {
	/**
	 * The cached value of the '{@link #getElement1() <em>Element1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement1()
	 * @generated
	 * @ordered
	 */
	protected Variable element1;

	/**
	 * The cached value of the '{@link #getElement2() <em>Element2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement2()
	 * @generated
	 * @ordered
	 */
	protected Variable element2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourMMPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getElement1() {
		return element1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement1(Variable newElement1, NotificationChain msgs) {
		Variable oldElement1 = element1;
		element1 = newElement1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.OPERATOR__ELEMENT1, oldElement1, newElement1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement1(Variable newElement1) {
		if (newElement1 != element1) {
			NotificationChain msgs = null;
			if (element1 != null)
				msgs = ((InternalEObject)element1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.OPERATOR__ELEMENT1, null, msgs);
			if (newElement1 != null)
				msgs = ((InternalEObject)newElement1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.OPERATOR__ELEMENT1, null, msgs);
			msgs = basicSetElement1(newElement1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.OPERATOR__ELEMENT1, newElement1, newElement1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getElement2() {
		return element2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement2(Variable newElement2, NotificationChain msgs) {
		Variable oldElement2 = element2;
		element2 = newElement2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.OPERATOR__ELEMENT2, oldElement2, newElement2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement2(Variable newElement2) {
		if (newElement2 != element2) {
			NotificationChain msgs = null;
			if (element2 != null)
				msgs = ((InternalEObject)element2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.OPERATOR__ELEMENT2, null, msgs);
			if (newElement2 != null)
				msgs = ((InternalEObject)newElement2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.OPERATOR__ELEMENT2, null, msgs);
			msgs = basicSetElement2(newElement2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.OPERATOR__ELEMENT2, newElement2, newElement2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourMMPackage.OPERATOR__ELEMENT1:
				return basicSetElement1(null, msgs);
			case BehaviourMMPackage.OPERATOR__ELEMENT2:
				return basicSetElement2(null, msgs);
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
			case BehaviourMMPackage.OPERATOR__ELEMENT1:
				return getElement1();
			case BehaviourMMPackage.OPERATOR__ELEMENT2:
				return getElement2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviourMMPackage.OPERATOR__ELEMENT1:
				setElement1((Variable)newValue);
				return;
			case BehaviourMMPackage.OPERATOR__ELEMENT2:
				setElement2((Variable)newValue);
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
			case BehaviourMMPackage.OPERATOR__ELEMENT1:
				setElement1((Variable)null);
				return;
			case BehaviourMMPackage.OPERATOR__ELEMENT2:
				setElement2((Variable)null);
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
			case BehaviourMMPackage.OPERATOR__ELEMENT1:
				return element1 != null;
			case BehaviourMMPackage.OPERATOR__ELEMENT2:
				return element2 != null;
		}
		return super.eIsSet(featureID);
	}

} //OperatorImpl
