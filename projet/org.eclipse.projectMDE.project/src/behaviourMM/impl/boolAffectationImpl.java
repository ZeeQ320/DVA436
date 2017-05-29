/**
 */
package behaviourMM.impl;

import behaviourMM.BehaviourMMPackage;
import behaviourMM.boolAffectation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>bool Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviourMM.impl.boolAffectationImpl#isReceivedBool <em>Received Bool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class boolAffectationImpl extends AffectationImpl implements boolAffectation {
	/**
	 * The default value of the '{@link #isReceivedBool() <em>Received Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceivedBool()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECEIVED_BOOL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReceivedBool() <em>Received Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceivedBool()
	 * @generated
	 * @ordered
	 */
	protected boolean receivedBool = RECEIVED_BOOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolAffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourMMPackage.Literals.BOOL_AFFECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReceivedBool() {
		return receivedBool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedBool(boolean newReceivedBool) {
		boolean oldReceivedBool = receivedBool;
		receivedBool = newReceivedBool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourMMPackage.BOOL_AFFECTATION__RECEIVED_BOOL, oldReceivedBool, receivedBool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourMMPackage.BOOL_AFFECTATION__RECEIVED_BOOL:
				return isReceivedBool();
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
			case BehaviourMMPackage.BOOL_AFFECTATION__RECEIVED_BOOL:
				setReceivedBool((Boolean)newValue);
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
			case BehaviourMMPackage.BOOL_AFFECTATION__RECEIVED_BOOL:
				setReceivedBool(RECEIVED_BOOL_EDEFAULT);
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
			case BehaviourMMPackage.BOOL_AFFECTATION__RECEIVED_BOOL:
				return receivedBool != RECEIVED_BOOL_EDEFAULT;
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
		result.append(" (receivedBool: ");
		result.append(receivedBool);
		result.append(')');
		return result.toString();
	}

} //boolAffectationImpl
