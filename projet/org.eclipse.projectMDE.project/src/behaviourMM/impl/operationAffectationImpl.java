/**
 */
package behaviourMM.impl;

import behaviourMM.BehaviourMMPackage;
import behaviourMM.Operator;
import behaviourMM.operationAffectation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operation Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.impl.operationAffectationImpl#getReceivedOperation <em>Received Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class operationAffectationImpl extends AffectationImpl implements operationAffectation {
	/**
	 * The cached value of the '{@link #getReceivedOperation() <em>Received Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedOperation()
	 * @generated
	 * @ordered
	 */
	protected Operator receivedOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected operationAffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourMMPackage.Literals.OPERATION_AFFECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getReceivedOperation() {
		return receivedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivedOperation(Operator newReceivedOperation, NotificationChain msgs) {
		Operator oldReceivedOperation = receivedOperation;
		receivedOperation = newReceivedOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.OPERATION_AFFECTATION__RECEIVED_OPERATION, oldReceivedOperation, newReceivedOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedOperation(Operator newReceivedOperation) {
		if (newReceivedOperation != receivedOperation) {
			NotificationChain msgs = null;
			if (receivedOperation != null)
				msgs = ((InternalEObject)receivedOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.OPERATION_AFFECTATION__RECEIVED_OPERATION, null, msgs);
			if (newReceivedOperation != null)
				msgs = ((InternalEObject)newReceivedOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviourMMPackage.OPERATION_AFFECTATION__RECEIVED_OPERATION, null, msgs);
			msgs = basicSetReceivedOperation(newReceivedOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.OPERATION_AFFECTATION__RECEIVED_OPERATION, newReceivedOperation, newReceivedOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourMMPackage.OPERATION_AFFECTATION__RECEIVED_OPERATION:
				return basicSetReceivedOperation(null, msgs);
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
			case BehaviourMMPackage.OPERATION_AFFECTATION__RECEIVED_OPERATION:
				return getReceivedOperation();
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
			case BehaviourMMPackage.OPERATION_AFFECTATION__RECEIVED_OPERATION:
				setReceivedOperation((Operator)newValue);
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
			case BehaviourMMPackage.OPERATION_AFFECTATION__RECEIVED_OPERATION:
				setReceivedOperation((Operator)null);
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
			case BehaviourMMPackage.OPERATION_AFFECTATION__RECEIVED_OPERATION:
				return receivedOperation != null;
		}
		return super.eIsSet(featureID);
	}

} //operationAffectationImpl
