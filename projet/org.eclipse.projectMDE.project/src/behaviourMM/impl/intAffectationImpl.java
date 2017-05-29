/**
 */
package behaviourMM.impl;

import behaviourMM.BehaviourMMPackage;
import behaviourMM.intAffectation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>int Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.impl.intAffectationImpl#getReceivedInt <em>Received Int</em>}</li>
 * </ul>
 *
 * @generated
 */
public class intAffectationImpl extends AffectationImpl implements intAffectation {
	/**
	 * The default value of the '{@link #getReceivedInt() <em>Received Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedInt()
	 * @generated
	 * @ordered
	 */
	protected static final int RECEIVED_INT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReceivedInt() <em>Received Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedInt()
	 * @generated
	 * @ordered
	 */
	protected int receivedInt = RECEIVED_INT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected intAffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourMMPackage.Literals.INT_AFFECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReceivedInt() {
		return receivedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedInt(int newReceivedInt) {
		int oldReceivedInt = receivedInt;
		receivedInt = newReceivedInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.INT_AFFECTATION__RECEIVED_INT, oldReceivedInt, receivedInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourMMPackage.INT_AFFECTATION__RECEIVED_INT:
				return getReceivedInt();
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
			case BehaviourMMPackage.INT_AFFECTATION__RECEIVED_INT:
				setReceivedInt((Integer)newValue);
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
			case BehaviourMMPackage.INT_AFFECTATION__RECEIVED_INT:
				setReceivedInt(RECEIVED_INT_EDEFAULT);
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
			case BehaviourMMPackage.INT_AFFECTATION__RECEIVED_INT:
				return receivedInt != RECEIVED_INT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (receivedInt: ");
		result.append(receivedInt);
		result.append(')');
		return result.toString();
	}

} //intAffectationImpl
